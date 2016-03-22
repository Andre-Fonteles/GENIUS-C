package fr.imag.steamer.geniusc.lifecyclemanager;

import java.util.List;

public interface StateFactory {
	
	public List<String> getStateNames(String name);
	public State getState(String name);
	public Transition getTransiction(String name);
	public List<String> getTransitionNames(String name);
	
}
