package com.studentproducer.service;

import java.util.List;

import com.studentproducer.model.Student;

public interface StudentService {

	void addStudent(Student s);

	Student getSingleStudent(int id);

	List<Student> getAllStudent();

	Student updateStudent( Student s);

	void deleteStudent(int id);

}
