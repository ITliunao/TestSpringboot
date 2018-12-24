package com.zhengyuan.liunao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zhengyuan.liunao.service.PersonService;

@Controller
@RequestMapping(value = "/person")
public class PersonController {
	@Autowired
	PersonService personService;

	@RequestMapping("/showPerson")
	@ResponseBody
	public void showPerson() {
		System.out.println(personService.findByNameLikeAndSexLike("liunao", "nan"));
	}
}
