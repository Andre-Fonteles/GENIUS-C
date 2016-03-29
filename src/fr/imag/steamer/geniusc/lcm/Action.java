package fr.imag.steamer.geniusc.lcm;

import fr.imag.steamer.geniusc.entity.Task;

public interface Action {

	public String getName();
	public Task perform();
	
}
