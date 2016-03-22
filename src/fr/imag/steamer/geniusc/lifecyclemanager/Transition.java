package fr.imag.steamer.geniusc.lifecyclemanager;

import fr.imag.steamer.geniusc.entity.Task;

public abstract class Transition {
	
	/**
	 * @return Unique name identifying the transition.
	 */
	public abstract String getName();
	
	public abstract Task perform(Task task);
	
}
