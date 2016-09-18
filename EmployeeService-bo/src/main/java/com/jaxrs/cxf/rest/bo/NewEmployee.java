package com.jaxrs.cxf.rest.bo;

import org.springframework.stereotype.Component;

@Component("newEmployee")
public class NewEmployee {

	private String name;
	private String location;
	private Integer dId;

	public NewEmployee() {
	}
	
	public NewEmployee(String name, String location) {
		this.name = name;
		this.location = location;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", location=" + location + "]";
	}

	public Integer getdId() {
		return dId;
	}

	public void setdId(Integer dId) {
		this.dId = dId;
	}

}
