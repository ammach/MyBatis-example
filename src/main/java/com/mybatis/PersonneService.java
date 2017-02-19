package com.mybatis;

import org.apache.ibatis.session.SqlSession;

public class PersonneService {

	public void save(Personne personne) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		session.insert("insertPersonne", personne);
		session.commit();
		session.close();
	}

	public void update(Personne personne) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		session.update("updatePersonne", personne);
		session.commit();
		session.close();
	}

	public void delete(Integer id) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		session.delete("deletePersonne", id);
		session.commit();
		session.close();
	}

	public Personne getData(Integer id) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		Personne personne = session.selectOne("selectPersonne", id);
		session.close();
		return personne;
	}
}
