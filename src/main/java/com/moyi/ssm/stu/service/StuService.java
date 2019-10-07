package com.moyi.ssm.stu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.moyi.ssm.stu.entity.Student;
import com.moyi.ssm.stu.mapper.StuMapper;

@Service
public class StuService {

	@Autowired
	private StuMapper stuMapper;
	
	public void addStu(Student stu) {
		stuMapper.addStu(stu);
	}
	
}
