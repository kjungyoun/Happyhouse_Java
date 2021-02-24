package com.ssafy.happyhouse.model.dto;

public class Environment {
	private String name;
	private int bizcode;
	private String address;
	private int dongcode;
	private String dong;
	public Environment() {}
	
	public Environment(String name, int bizcode, String address, int dongcode, String dong) {
		this.name = name;
		this.bizcode = bizcode;
		this.address = address;
		this.dongcode = dongcode;
		this.dong = dong;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBizcode() {
		return bizcode;
	}
	public void setBizcode(int bizcode) {
		this.bizcode = bizcode;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getDongcode() {
		return dongcode;
	}
	public void setDongcode(int dongcode) {
		this.dongcode = dongcode;
	}
	public String getDong() {
		return dong;
	}
	public void setDong(String dong) {
		this.dong = dong;
	}
	@Override
	public String toString() {
		return "Environment [name=" + name + ", bizcode=" + bizcode + ", address=" + address + ", dongcode=" + dongcode
				+ ", dong=" + dong + "]";
	}
}
