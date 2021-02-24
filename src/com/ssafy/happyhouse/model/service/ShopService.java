package com.ssafy.happyhouse.model.service;

import java.util.List;

public interface ShopService {
	
	
	List<Commercial> search();
	List<Commercial> search(String dong);
}
