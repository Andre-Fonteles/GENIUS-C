package fr.imag.steamer.geniusc.lifecyclemanager;

import java.util.ArrayList;
import java.util.List;

import fr.imag.steamer.geniusc.entity.Task;

public class TaskLifeCycleManager {

	private List<TaskObserver> taskObservers;
	
	private TaskLifeCycleManager() {
		taskObservers = new ArrayList<TaskObserver>();
	}
	
	public void addTaskObserver(TaskObserver taskObserver) {
		taskObservers.add(taskObserver);
	}
	
	public void removeTaskObserver(TaskObserver taskObserver) {
		taskObservers.remove(taskObserver);
	}
	
	public void clearTaskObservers() {
		taskObservers.clear();
	}
	
	/**
	 */
	/**
	 * Attempts to transition from the task's current state to a new one (according to the object stateTransiction).
	 * @param task
	 * @param stateTransition
	 * @return null if the transition fails ant the the modified task if it succeeds.
	 */
	public Task transition(Task task, Transition transition) throws TransitionException {
		if(task.getState().nextState(transition.getName()) == null) {
			throw new TransitionException("The state of the task does not accept the transition: " + transition.getName());
		}
		
		for (TaskObserver taskObserver : taskObservers) {
			taskObserver.preTransition(task, transition);
		}
		
		task = transition.perform(task);
		
		for (TaskObserver taskObserver : taskObservers) {
			taskObserver.posTransition(task, transition);
		}
		
		return task;
	}
	
	private static TaskLifeCycleManager singleton = null;
	
	public static TaskLifeCycleManager getInstance() {
		if(singleton == null) {
			singleton = new TaskLifeCycleManager();
		}
		
		return singleton;
	}
	
}
