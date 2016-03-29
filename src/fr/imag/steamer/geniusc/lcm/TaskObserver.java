package fr.imag.steamer.geniusc.lcm;

import fr.imag.steamer.geniusc.entity.Task;

public interface TaskObserver {
	
	/**
	 * /**
	 * Method called before the state is transitioned
	 * @param task that will change its state.
	 * @param action that will be performed
	 * @throws ActionException if the action is invalid for some reason
	 */
	public void preAction(Task task, Action action) throws ActionException;
	

	/**
	 * Method called after the state is transitioned
	 * @param task which changed state.
	 * @param action that has been performed
	 */
	public void posAction(Task task, Action action);
}
