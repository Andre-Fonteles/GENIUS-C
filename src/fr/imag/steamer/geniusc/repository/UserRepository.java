package fr.imag.steamer.geniusc.repository;

import java.util.List;

import fr.imag.steamer.geniusc.entity.User;

public interface UserRepository {

	public void createUser(User user);
	public void deleteUser(User user);
	public void updateUser(User user);
	public List<User> getAllUsers();
	
}