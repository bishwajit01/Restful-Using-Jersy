package org.vikram.bishwajit.messenger.exception;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import org.vikram.bishwajit.messenger.model.ErrorCode;

/**
 * @author Bishwajit.
 *
 */
@Provider
public class GenericExceptionMapper implements ExceptionMapper<Throwable> {

	@Override
	public Response toResponse(Throwable exception) {
		return Response
				.status(Status.INTERNAL_SERVER_ERROR)
				.entity(new ErrorCode(exception.getMessage(), Status.INTERNAL_SERVER_ERROR.toString(), "NOT ACCPETABLE"))
				.build();
	}

}
