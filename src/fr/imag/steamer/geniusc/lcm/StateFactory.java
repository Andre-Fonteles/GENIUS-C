package fr.imag.steamer.geniusc.lcm;

import java.util.List;

public interface StateFactory {
	
	public List<String> getStateNames(String name);
	public State getState(String name);
	
}
