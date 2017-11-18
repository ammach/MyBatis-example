package com.mybatis;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Personne {

	private Long id;
	private String nom;
	private int age;
	
	public Personne(String nom, Integer age) {
		this.nom = nom;
		this.age = age;
	}
	
	

	
}
