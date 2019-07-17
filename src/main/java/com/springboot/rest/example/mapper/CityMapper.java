package com.springboot.rest.example.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.springboot.rest.example.domain.City;

@Mapper
public interface CityMapper {

	
	public List<City> findAll();
	
	public City selectCityById(Long id);
}
