package com.biblio.actions;

import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class HelloWorld extends ActionSupport {

	private String name;
	
	@Override
	public String execute() throws Exception {
		if(name != null && name.length() > 10){
			throw new Exception("El nombre excede el límite máximo");
		}
		return SUCCESS;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
