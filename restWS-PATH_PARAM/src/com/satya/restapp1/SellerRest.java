/**
 * 
 */
package com.satya.restapp1;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.satya.data.Product;

/**
 * @author satyyada
 *
 */
//http://localhost:9090/restWS-PATH_PARAM/rest/seller/20
@Path("/seller")
public class SellerRest {

	@GET
	@Path("{sellerId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Product getProduct(@PathParam("sellerId") String productId) {
		Product product = new Product("sellerId", "Oil", "Hair Oil");
		return product;

	}
}
