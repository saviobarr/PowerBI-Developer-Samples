// ----------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.
// Licensed under the MIT license.
// ----------------------------------------------------------------------------

package com.embedsample.appownsdata.config;

/**
 * Configuration class
 */
public abstract class Config {
	
	// Set this to true, to show debug statements in console
	public static final boolean DEBUG = false;
	
	//	Two possible Authentication methods: 
	//	- For authentication with master user credential choose MasterUser as AuthenticationType.
	//	- For authentication with app secret choose ServicePrincipal as AuthenticationType.
	//	More details here: https://aka.ms/EmbedServicePrincipal
	public static final String authenticationType = "ServicePrincipal";
	
	//	Common configuration properties for both authentication types
	// Enter workspaceId / groupId
	public static final String workspaceId = "3c64fa62-d80a-4c5a-9a66-db442442a36d";

	// The id of the report to embed. This requires effective identity
	//public static final String reportId = "68530513-9161-44db-9d9e-4460eb87a3fb";
	public static final String reportId = "fe5be853-b822-4da2-8ebf-ffa0ff1ceff7";
	
	// The id of the report to embed. This does not requires effective id
	//public static final String reportId = "6bbd88aa-34de-4965-a79f-d3829ecc3b54";
	
	// The id of the report to embed. This does not requires effective id
	//public static final String reportId = "6bbd88aa-34de-4965-a79f-d3829ecc3b54";

	// Enter Application Id / Client Id
	public static final String clientId = "8677e850-be56-4681-af91-b8c3108c7cca";

	// Enter MasterUser credentials
	public static final String pbiUsername = "";
	public static final String pbiPassword = "";

	// Enter ServicePrincipal credentials
	public static final String tenantId = "3a78b0cd-7c8e-4929-83d5-190a6cc01365";
	public static final String appSecret = "Uhi8Q~7GDWOwaZnOKGVopuc2VvN9aVQ7hPWt.dfM";
		
	//	DO NOT CHANGE
	public static final String authorityUrl = "https://login.microsoftonline.com/";
	public static final String scopeBase = "https://analysis.windows.net/powerbi/api/.default";
	
	
	private Config(){
		//Private Constructor will prevent the instantiation of this class directly
		throw new IllegalStateException("Config class");
	}
	
}