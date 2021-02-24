package com.ssafy.happyhouse.model.service;

import com.ssafy.happyhouse.model.dto.HouseDeal;

public class ImageService {
	HouseDeal house;
	String images[] = {"건양하늘터", "경희궁의아침", "광화문풍림스페이스본", "교복동경희궁자이(4단지)", "다세대주택", "동성아파트", "무악동인왕산아이파크", 
			"무악동현대", "송인동롯데캐슬천지인", 
			"신동아블루아광화문", "아남1", "창신동덕산", "창신동두산", "창신동창신쌍용1", "창신동창신쌍용2", "평동경희궁자이(3단지)", "평창동갑을", 
			"현대뜨레비앙", "홍파동경희궁자이(2단지)", };
	
	public ImageService() {
		house=new HouseDeal();
	}
	
	
	
	public void setImg(HouseDeal house) {
		this.house=house;
	}
	public String getImg() {
		String imgsrc;
		imgsrc=house.getImg();
		if(imgsrc!=null) {
			return imgsrc;
		}
		
		for(String name: images) {
			if(house.getAptName().contains(name)) {
				imgsrc=name+".jpg";
				return imgsrc;
			}
		}
		
		return null;
	}
}
