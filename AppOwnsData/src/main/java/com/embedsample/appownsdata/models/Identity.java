package com.embedsample.appownsdata.models;

import java.util.ArrayList;
import java.util.List;

public class Identity {
	
	private String username;
	private List<String> roles = new ArrayList<>(); 
	private List<String> datasets = new ArrayList<>();
	private String customData;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public List<String> getRoles() {
		return roles;
	}
	public void setRoles(List<String> roles) {
		this.roles = roles;
	}
	public List<String> getDatasets() {
		return datasets;
	}
	public void setDatasets(List<String> datasets) {
		this.datasets = datasets;
	}
	public String getCustomData() {
		return customData;
	}
	public void setCustomData(String customData) {
		this.customData = customData;
	}
	
	

}
