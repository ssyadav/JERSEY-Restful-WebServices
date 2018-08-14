package com.satya.restapp1;

import javax.ws.rs.GET;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

//http://localhost:9090/restWS-QUERY_PARAM/rest/university?studentRoleNo1=20&studentRoleNo2=40
@Path("/university")
public class UniversityRESTWS {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getStudentInfoInfo(@QueryParam("studentRoleNo1") String studentRoleNo1, 
			@QueryParam("studentRoleNo2") String studentRoleNo2) {
		
		return "Two Numbers using @QueryParam annotation are : " +studentRoleNo1 + " and " + studentRoleNo2;
	}
	
	@GET
	@Path("/matrix")
	@Produces(MediaType.TEXT_PLAIN)
	public String getStudentInfoInfoTest(@MatrixParam("studentRoleNo1") String studentRoleNo1, 
			@MatrixParam("studentRoleNo2") String studentRoleNo2) {
		
		return "Two Numbers using @MatrixParam annotation are : " +studentRoleNo1 + " and " + studentRoleNo2;
	}
	
}
