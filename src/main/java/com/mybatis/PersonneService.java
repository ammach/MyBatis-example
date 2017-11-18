package com.mybatis;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

public class PersonneService {

	public void save(Personne personne) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		session.insert("insertPersonne", personne);
		session.commit();
		session.close();
	}

	public void savePersonneByNom(String nom) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		session.insert("insertPersonneByNom", nom);
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

	public Personne getPersonneById(Integer id) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		Personne personne = session.selectOne("selectPersonneById", id);
		session.close();
		return personne;
	}

	public List<Personne> selectPersonnes() {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		List<Personne> personnes = session.selectList("selectPersonnes");
		session.close();
		return personnes;
	}

	public List<Personne> selectPersonnesOrderedByAge() {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		List<Personne> personnes = session.selectList("selectPersonnesOrderedByAge");
		session.close();
		return personnes;
	}

	public List<Object> selectPersonnesGroupedByAge() {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		List<Object> personnes = session.selectList("selectPersonnesGroupedByAge");
		session.close();
		return personnes;
	}

	public int selectCountPersonnes() {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		int count = session.selectOne("selectCountPersonnes");
		session.close();
		return count;
	}
}
