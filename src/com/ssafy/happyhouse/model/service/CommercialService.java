package com.ssafy.happyhouse.model.service;

import java.util.List;

import com.ssafy.happyhouse.model.dto.Commercial;

public interface CommercialService {
	
	
	List<Commercial> search();
	List<Commercial> search(String dong);
}
