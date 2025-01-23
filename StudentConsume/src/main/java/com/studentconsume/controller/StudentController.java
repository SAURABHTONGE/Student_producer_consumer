package com.studentconsume.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.studentconsume.model.Student;

@RestController
public class StudentController {

	@Autowired
	RestTemplate rt;
	
	@GetMapping("/getAll")
	public Iterable getAllData() {
		
		//String url="http://localhost:9091/get";
	   String url="http://zuul/P/get";
		//String url="http://desktop-vekd7c1:9091/get";
		Iterable list= rt.getForObject(url,Iterable.class);
		return list;
	}
	@GetMapping("get/{id}")
	public Student getSingleData(@PathVariable int id) {
		String url="http://zuul/P/get/"+id;
		Student student = rt.getForObject(url,Student.class);
		return student;
	}
	@PutMapping("/updateAll")
	public String updateData(@RequestBody Student s) {
		String url="http://zuul/P/update";
		rt.put(url, s, Student.class);
		return "Update Successfully!!";
	}
	@DeleteMapping("/delete/{id}")
	public String DeleteData(@PathVariable int id) {
		String url="http://zuul/P/delete/"+id;
		rt.delete(url, String.class);
		return "Data Deleted Successfully!!";
	}
}
