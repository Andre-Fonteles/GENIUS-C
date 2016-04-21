package fr.imag.steamer.geniusc.matchinghelper.cmanager;

import fr.imag.steamer.geniusc.entity.Task;
import fr.imag.steamer.geniusc.entity.User;

public interface ContextCondition <GUser extends User, GTask extends Task> {

	public boolean run(BasicContext<GUser, GTask> newContextInformation);
	
}
