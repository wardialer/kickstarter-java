package com.test;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.json.JSONException;
import org.json.JSONObject;

@Path("/echo")
public class EchoService {

	
	@GET
	@Produces("application/json")
	public Response noMessage(@PathParam("message") String m) throws JSONException {
		return Response.status(400).build();
	}
	
	
	@Path("{message}")
	@GET
	@Produces("application/json")
	public Response message(@PathParam("message") String m) throws JSONException {
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("echo", m);
		return Response.status(200).entity(jsonObject.toString()).build();
	}

}