package com.ssafy.happyhouse.model.dto;

public class Environment {
	private String name;
	private String address;
	private String yorn;
	private String desc;
	private String dong;
	public Environment() {}
	public Environment(String name, String address, String yorn, String desc, String dong) {
		this.name = name;
		this.address = address;
		this.yorn = yorn;
		this.desc = desc;
		this.dong = dong;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getYorn() {
		return yorn;
	}
	public void setYorn(String yorn) {
		this.yorn = yorn;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getDong() {
		return dong;
	}
	public void setDong(String dong) {
		this.dong = dong;
	}
	@Override
	public String toString() {
		return "Environment [name=" + name + ", address=" + address + ", yorn=" + yorn + ", desc=" + desc + "]";
	}
	
}
