/**
 * 
 */
package com.satya.restapp1;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * @author satyyada
 *
 */
@Path("/university1")
public class UniversityOne {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getUniversityDetails() {
		
		return "good...u r in right direction";
	}
	
	
}
