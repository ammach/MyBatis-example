package com.mybatis.services;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.mybatis.MyBatisUtil;
import com.mybatis.beans.User;

public class UserService {

	public List<User> selectUsers() {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		List<User> users = session.selectList("selectUsers");
		session.commit();
		session.close();
		return users;
	}

	public void save(User user) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		session.insert("insertUser", user);
		session.commit();
		session.close();
	}

	public void saveDynamic(User user) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		session.insert("insertUserDynamic", user);
		session.commit();
		session.close();
	}

}
