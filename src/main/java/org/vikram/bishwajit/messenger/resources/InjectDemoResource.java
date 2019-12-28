package org.vikram.bishwajit.messenger.resources;


import javax.ws.rs.Consumes;
import javax.ws.rs.CookieParam;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;

/**
 * 
 * @author Bishwajit.
 *
 */
@Path("injectResource")
@Consumes(MediaType.TEXT_PLAIN)
@Produces(MediaType.TEXT_PLAIN)
public class InjectDemoResource {

	@GET
	@Path("annotations")
	@Produces(MediaType.TEXT_PLAIN)
	public String getParamUsingAnnotations(@MatrixParam("param") String matrixParam,
			@HeaderParam("customHeaderValue") String header, @CookieParam("name") String cookie) {
		return "Matrix Param :: " + matrixParam + "  CustomHeader :: " + header + "  Cookie : " + cookie;
	}

	@GET
	@Path("context")
	@Produces(MediaType.TEXT_PLAIN)
	public String getParamUsingContext(@Context UriInfo uriInfo, @Context HttpHeaders httpHeader) {
		return uriInfo.getPath() + "       " + uriInfo.getRequestUri() + "     " + uriInfo.getAbsolutePath()
								+ "         " + httpHeader.getHeaderString("Connection");
	}

	@GET
	@Path("queryParam")
	@Produces(MediaType.TEXT_PLAIN)
	public String getQueryParam(@QueryParam("param") String paramValue) {
		return paramValue;
	}
}
