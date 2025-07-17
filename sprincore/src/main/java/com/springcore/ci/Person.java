package com.springcore.ci;

import java.util.List;

public class Person {
	
	private String personName;
	private int personId;
	private certi certi;
	private List<String> list;
	public Person(String personName, int personId, certi certi,List<String> list) {
		this.personName = personName;
		this.personId = personId;
		this.certi = certi;
		this.list = list;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.personName+" : "+ this.personId+":"+ this.certi+":"+this.list;
	}
	
}

	