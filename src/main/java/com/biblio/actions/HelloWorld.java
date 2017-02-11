package com.biblio.actions;

import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class HelloWorld extends ActionSupport {

	private String name;
	
	@Override
	public String execute() throws Exception {
		return SUCCESS;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
