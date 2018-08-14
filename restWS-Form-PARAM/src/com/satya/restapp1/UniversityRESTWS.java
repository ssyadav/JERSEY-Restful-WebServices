package com.satya.restapp1;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

//http://localhost:9090/restWS-QUERY_PARAM/rest/university?studentRoleNo1=20&studentRoleNo2=40
@Path("/university")
public class UniversityRESTWS {

	@POST
	@Path("/add")
	@Produces(MediaType.APPLICATION_JSON)
	public String addStudentInfo(@FormParam("name") String name, 
			@FormParam("age") String age) {
		
		return "Two Numbers using @FormParam annotation are : " +name + " and " + age;
	}
}
