package fr.imag.steamer.geniusc.repository;

import java.util.List;

import fr.imag.steamer.geniusc.entity.User;

public interface UserRepository {

	public void createWorker(User user);
	public void deleteTask(User user);
	public void updateTask(User user);
	public List<User> getAllUsers();
	
}