package com.satye.client;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class RESTJerseyClient {
	public static void main(String[] args) {
		 
		RESTJerseyClient crunchifyClient = new RESTJerseyClient();
		//crunchifyClient.getCtoFResponse();
		crunchifyClient.testProduct();
//		crunchifyClient.getFtoCResponse();
	}
 
	private void testProduct() {
		try {
 
			Client client = Client.create();
			WebResource webResource = client.resource("http://localhost:7070/restWS-QUERY_PARAM/rest/university?studentRoleNo1=20&studentRoleNo2=40000");
			//WebResource webResource = client.resource("http://localhost:9090/rest-app2/rest/ctofservice/4");
			ClientResponse response = webResource.accept("text/plain").get(ClientResponse.class);
			if (response.getStatus() != 200) {
				throw new RuntimeException("Failed : HTTP error code : " + response.getStatus());
			}
 
			String output = response.getEntity(String.class);
			System.out.println("============getCtoFResponse============");
			System.out.println(output);
 
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	private void getCtoFResponse() {
		try {
 
			Client client = Client.create();
			WebResource webResource = client.resource("http://localhost:7070/restWS-PATH_PARAM/rest/v1/product/20/31");
			//WebResource webResource = client.resource("http://localhost:9090/rest-app2/rest/ctofservice/4");
			ClientResponse response = webResource.accept("text/plain").get(ClientResponse.class);
			if (response.getStatus() != 200) {
				throw new RuntimeException("Failed : HTTP error code : " + response.getStatus());
			}
 
			String output = response.getEntity(String.class);
			System.out.println("============getCtoFResponse============");
			System.out.println(output);
 
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void getFtoCResponse() {
		try {
 
			Client client = Client.create();
			WebResource webResource2 = client.resource("http://localhost:8080/CrunchifyRESTJerseyExample/crunchify/ftocservice/90");
			ClientResponse response2 = webResource2.accept("application/json").get(ClientResponse.class);
			if (response2.getStatus() != 200) {
				throw new RuntimeException("Failed : HTTP error code : " + response2.getStatus());
			}
 
			String output2 = response2.getEntity(String.class);
			System.out.println("\n============getFtoCResponse============");
			System.out.println(output2);
 
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
}
