package fr.imag.steamer.geniusc.lifecyclemanager;

import java.util.HashMap;
import java.util.Map;

public class State {

	private Map<String, State> transitionMap;
	private String name;
	private long id;
	
	public State() {
		transitionMap = new HashMap<String, State>();
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Map<String, State> getAcceptedTransitions() {
		return transitionMap;
	}

	public void setTransitionMap(Map<String, State> acceptedTransitions) {
		this.transitionMap = acceptedTransitions;
	}

	/**
	 * Returns the state that results from this transition from this state
	 * @param the name of the transition
	 * @return the next state or null if the transition is not valid for this state
	 */
	public State nextState(String transitionName) {
		return transitionMap.get(transitionName);
	}
	
}
