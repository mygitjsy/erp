package com.bwei.dto;

import java.io.Serializable;

/**
* 
* <p>Title: pojoToJson</p>
* <p>Description: </p>
* @Param
* @Author:Jiangsy
* @Date:2016��9��1�� ����7:22:42
*/
public class Dog implements Serializable{
	private String name;
	private Integer age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
	

}
