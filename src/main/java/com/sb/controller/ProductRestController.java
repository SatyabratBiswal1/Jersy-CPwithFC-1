package com.sb.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/prod")
public class ProductRestController {
	@GET
	public String GetProduct()
	{
		return "getting product information";
	}

}
