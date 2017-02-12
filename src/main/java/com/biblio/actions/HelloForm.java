package com.biblio.actions;

import java.util.HashMap;
import java.util.Map;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;

@SuppressWarnings("serial")
public class HelloForm extends ActionSupport implements Preparable {
	
	//Parámetros salida
	private Map<String, String> languages;
	
	@Override
	public void prepare() throws Exception {
		languages = new HashMap<>();
		languages.put("en", "English");
		languages.put("es", "Español");
	}
	
	@Override
	public String execute() throws Exception {
		return SUCCESS;
	}

	public Map<String, String> getLanguages() {
		return languages;
	}	
}
