package com.example.cartservice.cartservice.externalservice;

import java.util.Collection;

import javax.enterprise.context.Dependent;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import com.example.cartservice.cartservice.bean.*;


@Dependent
@RegisterRestClient
@Produces(MediaType.APPLICATION_JSON)
@Path("/products")
public interface ProductServiceEndPoint {
	
	@GET
	public Collection<Product> listProducts();


}
