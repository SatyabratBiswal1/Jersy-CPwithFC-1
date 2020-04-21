package com.sb.producer;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Path("/emp")
public class EmployeeRestController {
	@GET
	public String showA()
	{
		return "Get-emp-showA()";
	}
	@GET
	@Path("/a")
	public String showB()
	{
		return "get-emp-showB()";
	}
	@POST
	public String showc()
	{
		return "post-emp-showC()";
	}
	@POST
	@Path("/b")
	public String ShowD()
	{
		return "post-emp-showD()";
	}

}
