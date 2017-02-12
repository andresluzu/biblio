package com.biblio.actions;

import java.util.HashMap;
import java.util.Map;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;

@SuppressWarnings("serial")
public class HelloWorld extends ActionSupport implements Preparable {

	//Par�metros entrada
	private String name;
	
	//Par�metros salida
	private String greeting;
	private Map<String, String> languages;
	
	@Override
	public void prepare() throws Exception {
		languages = new HashMap<>();
		languages.put("en", "English");
		languages.put("es", "Espa�ol");
	}
	
	@Override
	public String execute() throws Exception {
		if(name != null && name.length() > 10){
			throw new Exception(getText("validation.name"));
		}
		
		if(name != null && !name.isEmpty()){
			greeting = getText("message.hello") + ": " + name;
		}
		
		System.out.println("Ejecuci�n de la acci�n");
		return SUCCESS;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGreeting() {
		return greeting;
	}

	public Map<String, String> getLanguages() {
		return languages;
	}
	
	
}
