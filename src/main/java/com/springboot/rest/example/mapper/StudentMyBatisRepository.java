package com.springboot.rest.example.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.springboot.rest.example.domain.Student;

@Mapper
public interface StudentMyBatisRepository {

	@Select("SELECT * FROM student_table")
	public List<Student> findAll();
	
	@Select("SELECT * FROM student_table WHERE id = #{id}")
	public Student findById(long id);
	
}
