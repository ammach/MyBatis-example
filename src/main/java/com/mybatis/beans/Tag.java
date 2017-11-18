package com.mybatis.beans;

import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Tag {

	private int id;
	private String libelle;

	private List<UserTag> userTags;
}
