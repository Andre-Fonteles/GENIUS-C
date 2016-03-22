package fr.imag.steamer.geniusc.repository;

import java.util.List;

import fr.imag.steamer.geniusc.entity.Task;

public interface TaskRepository {

	public Task createTask(Task task);
	public Task deleteTask(Task task);
	public Task updateTask(Task task);
	public List<Task> getAllTasks();
	public Task findById(long id);
	
}
