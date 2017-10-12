package fr.imag.steamer.geniusc.lcm;

import java.util.List;

public interface StateFactory {
	
	public List<String> getStateNames();
	public State getState(String name);
	
}
