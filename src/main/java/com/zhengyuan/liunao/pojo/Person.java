package com.zhengyuan.liunao.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "person")
@Getter
@Setter
public class Person {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(length = 10)
	private int age;

	@Column(length = 20)
	private String name;

	@Column(length = 10)
	private String sex;

	@Override
	public String toString() {
		return "Person [id=" + id + ", age=" + age + ", name=" + name + ", sex=" + sex + "]";
	}

}
