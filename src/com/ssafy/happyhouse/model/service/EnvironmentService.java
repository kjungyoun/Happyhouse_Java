package com.ssafy.happyhouse.model.service;

import java.util.List;

import com.ssafy.happyhouse.model.dto.Environment;

public interface EnvironmentService {
	public List<Environment> search(String dong);
	public List<Environment> search();
}
