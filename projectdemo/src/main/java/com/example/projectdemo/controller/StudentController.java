package com.example.projectdemo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.projectdemo.dto.Student;
import com.example.projectdemo.repository.StudentRepository;

@RestController
public class StudentController {
	@Autowired
	StudentRepository sr;
	
	@PostMapping("/savestudent")
	public String save(@RequestBody Student s) {
		sr.save(s);
		return"data saved successfully";
	}
	
	@GetMapping("/fetch")
	public Optional<Student> fetchStudentById(@RequestParam int id) {
		Optional<Student>student=sr.findById(id);
		return student;
		
	}
@GetMapping("/fetchbyname")
public List<Student>fetchStudentByName(@RequestParam String name){
	List<Student>student=sr.findByName(name);
	return student;
}
@GetMapping("/fetchbyage")
public List<Student>fetchStudentByAge(@RequestParam int age){
	List<Student>student=sr.findByAge(age);
	return student;
}
@GetMapping("/findall")
public List<Student>fetchAllStud(){
	List<Student>student=sr.findAll();
	return student;
}
@GetMapping("/fetchbyphoneno")
public List<Student>fetchStudentByPhoneno(@RequestParam long phoneno){
	List<Student>student=sr.findByPhoneno(phoneno);
	return student;
}
@GetMapping("/fetchbybloodgroup")
public List<Student>fetchStudentByBloodgroup(@RequestParam String bloodgroup){
	List<Student>student=sr.findByBloodgroup(bloodgroup);
	return student;
}

@DeleteMapping("/deleteall")
public String deleteAllStudent() {
	return"complete data deleted successfully";
}
@PutMapping("/update")
public String updateStud(@RequestBody Student s) {
	sr.save(s);
	return "data updated successfully";
}
}



