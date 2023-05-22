package com.example.projectdemo.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.projectdemo.dto.Student;




public interface StudentRepository extends JpaRepository<Student, Integer> {
	public List<Student>findByName(String name);
	public List<Student>findByAge(int age);
	public List<Student> findByBloodgroup(String bloodgroup);
	public List<Student> findByPhoneno(long phoneno);
	
	


}
