package fr.imag.steamer.geniusc.lifecyclemanager;

import fr.imag.steamer.geniusc.entity.Task;

public interface TaskObserver {

	
	/**
	 * /**
	 * Method called before the state is transitioned
	 * @param task that will change its state.
	 * @param action that will change the state of the task
	 * @throws TransitionException if the transition is invalid for some reason
	 */
	public void preTransition(Task task, Transition action) throws TransitionException;
	

	/**
	 * Method called after the state is transitioned
	 * @param task which changed state.
	 * @param action that changed the state of the task
	 * @return
	 */
	public boolean posTransition(Task task, Transition action);
	
}
