/**
 * 
 */
package come.rest.app3;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * @author satyyada
 *
 */

@Path("/v1/calculator")
public class RestApp3 {

	@GET
	@Path("/add/{num1}/{num2}")
	@Produces(MediaType.TEXT_PLAIN)
	public String addition(@PathParam("num1") Integer num1, @PathParam("num2") Integer num2) {
		int result = num1+num2;
		return ""+result;
		
	}
}
