package com.moyi.ssm.stu.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.moyi.ssm.stu.entity.Student;
import com.moyi.ssm.stu.service.StuService;

@Controller
@RequestMapping("/stu")
public class SutAction {

	@Autowired
	private StuService stuService;
	
	@RequestMapping("/addInit")
	public String addInit() {
		return "stu/add";
	}
	
	
	@RequestMapping("/add")
	public String add(Student stu) {
		stuService.addStu(stu);
		return "stu/add";
	}
	
}
