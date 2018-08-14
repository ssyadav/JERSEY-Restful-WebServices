package com.satya.restapp1;

import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

//http://localhost:9090/rest-app1/rest/university
@Path("/university")
public class UniversityRESTWS {

	@GET
	@Produces(MediaType.TEXT_HTML)
	public String getHTMLUniversityInfo() {
		
		return "<HTML> <TITLE> University Innovation </TITLE> <BODY><h1>NAME - Indian University</h1></BODY></HTML>";
	}
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getXMLUniversityInfo() {
		
		return "NAME - Indian University: Plain Text";
	}
	
	@PUT
	@Path("{studentRoleNo}")
	@Produces(MediaType.TEXT_PLAIN)
	public String updateUniversityInfo(@PathParam("studentRoleNo") String studentRoleNo) {
		
		return "Update Successfully";
	}
}
