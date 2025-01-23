package com.studentproducer.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studentproducer.model.Student;
import com.studentproducer.repository.StudentRepository;
import com.studentproducer.service.StudentService;
@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepository sr;
	@Override
	public void addStudent(Student s) {
		sr.save(s);
	}
	@Override
	public Student getSingleStudent(int id) {
		Optional<Student> opt = sr.findById(id);
		if(opt.isPresent()) {
			Student student = opt.get();
			return student;
		}
		return null;
	}
	@Override
	public List<Student> getAllStudent() {
             List<Student> list = sr.findAll();
		return list;
	}
	@Override
	public Student updateStudent(Student s) {
		Student student = sr.save(s);
		return student;
	}
	@Override
	public void deleteStudent(int id) {
		sr.deleteById(id);
	}

}
