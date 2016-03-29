package fr.imag.steamer.geniusc.services;

import java.util.List;

import fr.imag.steamer.geniusc.entity.Task;
import fr.imag.steamer.geniusc.lcm.ActionException;

public interface TaskService {

	/**
	 * Publish a new task
	 * @param task the new task to be published
	 * @return the new task published
	 */
	public Task publishTask(Task task) throws ActionException;
	public Task deleteTask(Task task) throws ActionException;
	public Task updateTask(Task task) throws ActionException ;
	public List<Task> getAllTasks();
	
}
