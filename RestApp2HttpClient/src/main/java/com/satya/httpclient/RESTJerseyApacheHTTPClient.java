package com.satya.httpclient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

public class RESTJerseyApacheHTTPClient {

	public static void main(String[] args) {
		 
		DefaultHttpClient httpClient = null;
		try {
 
			// create default HTTP Client
			httpClient = new DefaultHttpClient();
 
			// Create new getRequest with below mentioned URL
			//HttpGet getRequest = new HttpGet("http://localhost:9090/rest-app2/rest/ctofservice/4");
			HttpGet getRequest = new HttpGet("http://localhost:7777/restWS-QUERY_PARAM/rest/university?studentRoleNo1=20&studentRoleNo2=40");
 
			// Add additional header to getRequest which accepts application/xml data
			getRequest.addHeader("accept", "text/plain");
 
			// Execute your request and catch response
			HttpResponse response = httpClient.execute(getRequest);
 
			// Check for HTTP response code: 200 = success
			if (response.getStatusLine().getStatusCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : " + response.getStatusLine().getStatusCode());
			}
 
			// Get-Capture Complete application/xml body response
			BufferedReader br = new BufferedReader(new InputStreamReader((response.getEntity().getContent())));
			String output;
			System.out.println("============Output:============");
 
			// Simply iterate through XML response and show on console.
			while ((output = br.readLine()) != null) {
				System.out.println(output);
			}
 
			
 
		} catch (ClientProtocolException e) {
			e.printStackTrace();
 
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			if(httpClient != null) {
				httpClient.getConnectionManager().shutdown();
				httpClient.close();
			}
		}
	}
}
