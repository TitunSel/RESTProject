package com.restprograms.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC001_GET_Request {

	@Test
	void getRequest() {
		
		//specifying Base URL
		RestAssured.baseURI = "https://reqres.in";
		
		//Request URL
		RequestSpecification httprequest =  RestAssured.given();
		
		
		
		//Response URL
		Response response= httprequest.request(Method.GET,"/api/users/23");
		
		//print response in Console Window
		String body = response.getBody().asString();
		
		System.out.println("Response Body is:" +body);
		
		//status code validation
		int scode=response.getStatusCode();
		System.out.println("Status code is:" +scode);
		
		Assert.assertEquals(scode, 200);
		
		String sline= response.getStatusLine();
		
		System.out.println("Status line is:" +sline);
		
		Assert.assertEquals(sline, "HTTP/1.1 200 OK");
	}
}
