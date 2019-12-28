package org.vikram.bishwajit.messenger.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

/**
 * @author Bishwajit.
 *
 */
//@Path("/") // Optional
public class CommentsResource {

	@GET
	public String test() {
		return "comments";
	}

	/*
	 * @GET
	 * 
	 * @Path("{commentId}") public String test(@PathParam("commentId") String
	 * commentId) { return "comments :: " + commentId; }
	 */

	@GET
	@Path("{commentId}")
	public String test(@PathParam("messageId") String messageId, @PathParam("commentId") String commentId) {
		return messageId + " of comments :: " + commentId;
	}

}
