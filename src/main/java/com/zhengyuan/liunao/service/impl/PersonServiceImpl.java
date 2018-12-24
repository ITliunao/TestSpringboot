package com.zhengyuan.liunao.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhengyuan.liunao.pojo.Person;
import com.zhengyuan.liunao.pojo.PersonRepository;
import com.zhengyuan.liunao.service.PersonService;

@Service
public class PersonServiceImpl implements PersonService {
	@Autowired
	PersonRepository personRepository;

	@Override
	public List<Person> findByNameLikeAndSexLike(String name, String sex) {
		// TODO Auto-generated method stub
		return personRepository.findByNameLikeAndSexLike("liunao", "nan");
	}

}
