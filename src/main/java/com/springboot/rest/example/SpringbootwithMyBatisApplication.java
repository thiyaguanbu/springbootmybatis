package com.springboot.rest.example;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springboot.rest.example.dao.CityDao;
import com.springboot.rest.example.mapper.StudentMyBatisRepository;

@SpringBootApplication
@MapperScan("com.springboot.rest.example.mapper")
public class SpringbootwithMyBatisApplication implements CommandLineRunner {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	StudentMyBatisRepository repository;
	
	@Autowired
	CityDao cityDao;

	public static void main(String[] args) {
		SpringApplication.run(SpringbootwithMyBatisApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		logger.info("Student id 10003 -> {}", repository.findById(10003L));
		logger.info("All users -> {}", repository.findAll());
		logger.info("city id 20003 ::"+cityDao.selectCityById(20003L));
		
	}

}

