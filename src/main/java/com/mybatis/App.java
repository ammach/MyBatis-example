package com.mybatis;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PersonneService personneService = new PersonneService();

		Personne personne = new Personne("ammach", 22);
		personneService.save(personne);

	}

}
