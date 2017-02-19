package com.mybatis;

public class Personne {

	Long id;
	String nom;
	int age;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Personne(String nom, int age) {

		this.nom = nom;
		this.age = age;
	}

	public Personne() {

	}

	@Override
	public String toString() {
		return "Personne [id=" + id + ", nom=" + nom + ", age=" + age + "]";
	}

}
