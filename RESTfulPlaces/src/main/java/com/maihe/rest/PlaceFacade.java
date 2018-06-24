package com.maihe.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/json/places")
public class PlaceFacade {

	@GET
	@Path("/list")
	@Produces("application/json")
	public Place list() {

		ArrayList<Place> search = PlacesService.search("sushi", 34322243, 34554342, 100000);

		return Place;

	}

//	@GET
//	@Path("/search")
//	@Produces("application/json")
//	public Place detail() {
//
//		Place search = PlacesService.detail("sushi");
//
//		return Place;
//
//	}

	@POST
	@Path("/post")
	@Consumes("application/json")
	public Response fav(Place place) {

		String result = "Place favorited : " + place;
		return Response.status(201).entity(result).build();
		
	}
	
}