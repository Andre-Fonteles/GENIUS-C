package fr.imag.steamer.geniusc.matchinghelper.cmanager;

import fr.imag.steamer.geniusc.entity.Task;
import fr.imag.steamer.geniusc.entity.User;

public interface Reaction<GUser extends User, GTask extends Task> {

	public ContextCondition<GUser, GTask> react(BasicContext<GUser, GTask> newContextInformation);
	
}
