package com.mybatis;

import java.util.List;

import com.mybatis.beans.User;
import com.mybatis.services.UserService;

import lombok.extern.log4j.Log4j;

@Log4j
public class App {

	public static void main(String[] args) {

		PersonneService personneService = new PersonneService();
		UserService userService=new UserService();

		try {
			List<User> users = userService.selectUsers();
			log.info(users);
		} catch (Exception e) {
			log.error(e.getMessage());
		}
		log.info("---end---");
	}

}
