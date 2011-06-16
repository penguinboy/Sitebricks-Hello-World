package com.mycompany.app.web;

import com.google.sitebricks.At;

@At("/")
public class Home {
	
	public String getHello() {
		return "Hello world";
	}
}
