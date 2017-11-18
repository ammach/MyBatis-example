package com.mybatis.beans;

import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class User {

	private int id;
	private String username;
	private int age;
	private String sexe;

	private List<UserTag> userTags;
}
