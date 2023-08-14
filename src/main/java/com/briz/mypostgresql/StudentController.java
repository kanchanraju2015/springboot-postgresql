package com.briz.mypostgresql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController
{
@Autowired
StudentService sserv;
@RequestMapping("/test")
public String test()
{
	return "this is by test ";
}
@RequestMapping("/save")
public String testsave()
{
	Student s=new Student();
	s.setAge(90);
	s.setCity("paris");
	s.setName("chandan lal");
	sserv.addStudent(s);
	return "this is by test for postgresql ";
}
}
