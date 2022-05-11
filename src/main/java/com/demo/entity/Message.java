package com.demo.entity;

import java.util.Map;
//this is the class to add the message
public class Message {

	int id;
	String message;
	Map<String,String> newdata;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	

	public Map<String, String> getNewdata() {
		return newdata;
	}

	public void setNewdata(Map<String, String> newdata) {
		this.newdata = newdata;
	}

	@Override
	public String toString() {
		return "Message [id=" + id + ", message=" + message + ", newdata=" + newdata + "]";
	}
	
	

}
