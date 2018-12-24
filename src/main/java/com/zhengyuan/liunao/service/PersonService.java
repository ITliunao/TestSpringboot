package com.zhengyuan.liunao.service;

import java.util.List;

import com.zhengyuan.liunao.pojo.Person;

public interface PersonService {
	public List<Person> findByNameLikeAndSexLike(String name, String sex);

}
