package fr.imag.steamer.geniusc.lcm;

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
	public Task transition(Task task, Action action) throws ActionException {
		if(task.getState().nextStateName(action) == null) {
			throw new ActionException("Task state " + task.getState().getName() + " does not accept action: " + action.getClass().getName());
		}
		
		for (TaskObserver taskObserver : taskObservers) {
			taskObserver.preAction(task, action);
		}
		
		State nextState = task.getState().nextStateName(action);
		task.setState(nextState);
		action.perform();
		
		for (TaskObserver taskObserver : taskObservers) {
			taskObserver.posAction(task, action);
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
