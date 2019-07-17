package com.springboot.rest.example.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.rest.example.dao.CityDao;
import com.springboot.rest.example.domain.City;
import com.springboot.rest.example.domain.Student;
import com.springboot.rest.example.mapper.StudentMyBatisRepository;


@RestController
@RequestMapping("/api")
public class StudentController {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	StudentMyBatisRepository repository;
	
	@Autowired
	CityDao cityDao;
	
	@RequestMapping(value="/student/{id}",method=RequestMethod.GET, produces="application/json")
	public Student getStudentById(@PathVariable("id") Long id) {
		
		logger.info("Inside getStudentById method");
		Student student = repository.findById(id);
		logger.info("Student::"+student);
		return student;
		
	}
	
	@RequestMapping(value="/city/{id}",method=RequestMethod.GET,produces="application/json")
	public City selectCityById(@PathVariable("id") Long id) {
		logger.info("Inside selectCityById method");
		City city = cityDao.selectCityById(id);
		logger.info("city : "+city);
		return city;
	}
}
