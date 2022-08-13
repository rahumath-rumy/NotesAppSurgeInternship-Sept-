package com.school.StudentAdminLogin;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

import com.tourism_org.com.tourismapp.dao.UserDao;
import com.tourism_org.com.tourismapp.model.User;

import Controller.UserController;

public class UserTest {

	@Test
	public void testSha1Encrypt() {
		String input = "sampleuser";
		UserController UserDao = new UserController ();
		String actual = UserDao.Sha1Encrypt(input);
		System.out.println (actual);
		
		assertNotNull(actual);
	}
	
	@Test
	public void testLogin() {
		
		String email ="olivia@gmail.com";
		String password ="olive123";
		
		UserController userDao = new UserController();
		UserController actual =userDao.userAuth(email, password);
		
		assertNotNull(actual);
	}
}
