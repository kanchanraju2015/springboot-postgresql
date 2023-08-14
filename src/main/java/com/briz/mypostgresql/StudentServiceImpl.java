package com.briz.mypostgresql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService
{
@Autowired 
StudentRepository srepo;
public String addStudent(Student s)
{
	srepo.save(s);
	return "student data saved";
}
}
