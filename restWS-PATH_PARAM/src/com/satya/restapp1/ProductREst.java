package com.satya.restapp1;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.satya.data.Product;

//http://localhost:9090/restWS-PATH_PARAM/rest/v1/product/20/30
@Path("/v1/product")
public class ProductREst {

	/*@GET
	@Path("{studentRoleNo1}")
	@Produces(MediaType.TEXT_PLAIN)
	public String getStudentInfo(
			@PathParam("studentRoleNo1") String studentRoleNo1) {

		return "Two Numbers using @PathParam annotation are : "
				+ studentRoleNo1 ;
	}*/
	
	@GET
	@Path("{productId1}/{productId2}")
	@Produces(MediaType.TEXT_PLAIN)
	@Consumes()
	public String getStudentInfoInfo(
			@PathParam("productId1") String studentRoleNo1,
			@PathParam("productId2") String studentRoleNo2) {
		
		return "Two Numbers using @PathParam annotation are : "
				+ studentRoleNo1 + " and " + studentRoleNo2;
	}

	
	
	@GET
	@Path("{productId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Product getProduct(@PathParam("productId") String productId) {
		Product product = new Product("product1", "Oil", "Hair Oil");
		return product;

	}
}
