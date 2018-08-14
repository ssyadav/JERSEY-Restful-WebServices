package com.satya.restapp1;

import java.io.File;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

//http://localhost:9090/restWS-Download-file/rest/university/get
@Path("/university")
public class UniversityRESTWS {

	@GET
	@Path("/get")
	public Response getStudentFile() {
		File file = new File("D:\\theme mapping.txt");
		ResponseBuilder response = Response.ok((Object)file);
		response.header("Content-Disposition", "attachment; filename=DisplayName-DemoFile.txt");
		return response.build();
	}
}
