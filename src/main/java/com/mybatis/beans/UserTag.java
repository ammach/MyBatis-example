package com.mybatis.beans;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class UserTag {

	private int id;
	private User user;
	private Tag tag;

}
