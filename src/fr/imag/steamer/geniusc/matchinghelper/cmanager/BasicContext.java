package fr.imag.steamer.geniusc.matchinghelper.cmanager;

import fr.imag.steamer.geniusc.entity.Task;
import fr.imag.steamer.geniusc.entity.User;

public class BasicContext <GUser extends User, GTask extends Task> {

	private GTask task;
	private GUser user;
	
	public GTask getTask() {
		return task;
	}
	public void setTask(GTask task) {
		this.task = task;
	}
	public GUser getUser() {
		return user;
	}
	public void setUser(GUser user) {
		this.user = user;
	}
}
