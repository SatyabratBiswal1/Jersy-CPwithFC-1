package com.sb.Consumer;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

public class ConsumerTest {
	public static void main(String[] args) {
		try {
			String URI="http://localhost:8080/jerseyProducerAppMultiController";
			//String path="/satya/prod";
		//	String path="/satya/emp";
		//	String path="/satya/emp/a";
			String path ="/satya/emp/b";
			Client c=ClientBuilder.newClient();
			WebTarget wt=c.target(URI).path(path);
			Invocation.Builder builder=wt.request();
			//Response resp=builder.get();
			Response resp=builder.post(Entity.text("none"));
			System.out.println(resp.getStatus());
			System.out.println(resp.getStatusInfo());
			
			System.out.println(resp.readEntity(String.class));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
