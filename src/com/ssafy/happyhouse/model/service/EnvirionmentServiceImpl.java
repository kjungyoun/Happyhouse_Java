package com.ssafy.happyhouse.model.service;

import java.util.List;

import com.ssafy.happyhouse.model.dao.EnvironmentImpl;
import com.ssafy.happyhouse.model.dto.Environment;

public class EnvirionmentServiceImpl implements EnvironmentService{
	
	private EnvironmentImpl envDao;
	
	public EnvirionmentServiceImpl() {
		envDao=new EnvironmentImpl();
	}
	@Override
	public List<Environment> search(String dong) {
	
		
		return envDao.getEnvList(dong);
	}
	@Override
	public List<Environment> search() {
		return envDao.getEnvList();
	}
	
}
