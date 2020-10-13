package com.userFront.service;

import java.util.Set;

import com.userFront.domain.User;
import com.userFront.domain.security.UserRole;

public interface UserService {
	
	public void save(User user);
	
	public User findByUsername(String username);
	
	public User findByEmail(String email);
	
	public boolean checkUserExists(String username, String email);

    public boolean checkUsernameExists(String username); 
    
    public boolean checkEmailExists(String email); 
	
    User createUser(User user, Set<UserRole> userRoles);

    User saveUser (User user);
    
}
