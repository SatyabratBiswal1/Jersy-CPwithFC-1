package com.sb.producer;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;

@Path("/prod")
public class ProductRestController {
	@GET
	public String showA()
	{
	return "get show prod A";
		
	}
	@POST
	public String showb()
	{
		return "post show b";
		
	}
	@DELETE
	public String showc()
	{
		return "delete show c";
		
	}
	@PUT
	public String show()
	{
		return "put show d";
	}
	

}
