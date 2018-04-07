package com.example;

import javax.enterprise.context.RequestScoped;
import javax.faces.annotation.FacesConfig;
import javax.faces.annotation.FacesConfig.Version;
import javax.inject.Named;

@Named
@RequestScoped
@FacesConfig(version =Version.JSF_2_3)
public class Hello {

	private String name;
	private String message;

	public void createMessage() {
		message = "Hello, " + name + "!";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMessage() {
		return message;
	}

}
