package com.springcore.standalone.collections;
import java.util.*;
public class Person {
	private List<String> friends;
	private Map<String, Integer> feestruct;
	
	public Map<String, Integer> getFeestruct() {
		return feestruct;
	}

	public void setFeestruct(Map<String, Integer> feestruct) {
		this.feestruct = feestruct;
	}

	public List<String> getFriends() {
		return friends;
	}

	public void setFriends(List<String> friends) {
		this.friends = friends;
	}

	@Override
	public String toString() {
		return "Person [friends=" + friends + ", feestruct=" + feestruct + "]";
	}

	

	
	
}
