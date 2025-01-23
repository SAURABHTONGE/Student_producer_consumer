package com.studentproducer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.studentproducer.model.Student;
import com.studentproducer.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	StudentService si;
	
	@PostMapping("/add")
	public String addData(@RequestBody Student s) {
		si.addStudent(s);
		return "data added done!!";	
	}
	@GetMapping("get/{id}")
	public Student getSingleStudent(@PathVariable int id) {
		Student stu=si.getSingleStudent(id);
		return stu;
	}
	@GetMapping("/get")
	public List<Student> getAllData(){
		List<Student> list =si.getAllStudent();
		return list;
	}

	@PutMapping("/update")
	public Student updateStudent(@RequestBody Student s) {
	Student stu=si.updateStudent(s);
		return stu;
	}
	@DeleteMapping("/delete/{id}")
	public String deleteData(@PathVariable int id) {
		si.deleteStudent(id);
		return "Deleted!!";
	}
	
}
