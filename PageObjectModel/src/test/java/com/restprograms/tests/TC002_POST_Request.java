package com.restprograms.tests;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC002_POST_Request {

	@Test
	void putRequest(){
		//Specifying Base URI
		
		RestAssured.baseURI= "https://reqres.in";
		
		//Specifying Request
		
		RequestSpecification httprequest = RestAssured.given();
		
		//Specifying Request Payload along with post Request
		
		//JSONObject requestParams= new JSONObject();
		//requestParams.put("name", "Sunny");
		//requestParams.put("job", "Manager");
		
		//httprequest.header("Content-Type","application/json");
		
		//httprequest.body(requestParams.toJSONString());
		
		
		//sPECIFYTING Response
		
		Response response= httprequest.request(Method.POST);
		
		
		//VERIFYING THE Response
		
		int res= response.getStatusCode();
		System.out.println(res);
		
		String bod=response.getBody().toString();
		System.out.println(bod);
		
		
	}
	
	
	
}
