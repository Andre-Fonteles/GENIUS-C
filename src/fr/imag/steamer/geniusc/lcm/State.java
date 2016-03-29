package fr.imag.steamer.geniusc.lcm;

import java.util.Map;

public class State {

	private Map<String, State> transitionMap;
	
	private String name;

	/**
	 * Informs whether this state accepts this action or not.
	 * @param action
	 * @return
	 */
	public boolean acceptAction(Action action) {
		return acceptAction(action.getName());
	}
	
	public boolean acceptAction(String actionName) {
		if(transitionMap.keySet().contains(actionName)) {
			return true;
		}
		return false;
	}

	public State nextStateName(Action action) {
		return transitionMap.get(action.getName());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Map<String, State> getTransitionMap() {
		return transitionMap;
	}

	public void setTransitionMap(Map<String, State> transitionMap) {
		this.transitionMap = transitionMap;
	}
}
