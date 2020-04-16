package com.sb.consumer;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;



public class ConsumerTest {
	public static void main(String[] args) {
		try {
			//declare the URI and PATH
			String URI="http://localhost:8080/jerseyProducerAppMultiController";
			String PATH="/satya/prod";
			//create client object
			Client c=ClientBuilder.newClient();
			//define Webtarget by adding  URI and PATH
			WebTarget wt=c.target(URI).path(PATH);
			//convert into request object(Equals to HTTP under construction)
			Invocation.Builder bulder=wt.request();
			//provide HTTP method type
			Response resp=bulder.get();
			System.out.println(resp.getStatus());
			System.out.println(resp.getStatusInfo());
			System.out.println(resp.readEntity(String.class));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
