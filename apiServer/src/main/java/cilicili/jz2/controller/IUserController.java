package cilicili.jz2.controller;

import cilicili.jz2.pojo.User;

import java.io.Serializable;
import java.util.Map;

public interface IUserController {
	Map<String, Serializable> findUserById(int id, String token);
	
	Map<String, Serializable> findUserByUsername(String username, String token);
	
	Map<String, Serializable> addUser(User user);
	
	Map<String, Serializable> updateUser(User user);
}
