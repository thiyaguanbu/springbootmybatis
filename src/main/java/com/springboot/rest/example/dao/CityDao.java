package com.springboot.rest.example.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Component;

import com.springboot.rest.example.domain.City;

@Component
public class CityDao {
	
	private final SqlSession sqlSession;

	public CityDao(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	public City selectCityById(long id) {
		return this.sqlSession.selectOne("selectCityById", id);
	}

}
