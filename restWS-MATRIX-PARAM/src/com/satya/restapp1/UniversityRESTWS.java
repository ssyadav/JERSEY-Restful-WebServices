package com.satya.restapp1;

import javax.ws.rs.GET;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

//http://localhost:9090/restWS-MATRIX-PARAM/rest/university;studentRoleNo1=20;studentRoleNo2=50
@Path("/university")
public class UniversityRESTWS {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getStudentInfoInfo(@MatrixParam("studentRoleNo1") String studentRoleNo1, 
			@MatrixParam("studentRoleNo2") String studentRoleNo2) {
		
		return "Two Numbers using @MatrixParam annotation are : " +studentRoleNo1 + " and " + studentRoleNo2;
	}
}
