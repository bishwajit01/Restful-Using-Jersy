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
public class DataNotFoundExceptionMapper implements ExceptionMapper<DataNotFoundException>{

	@Override
	public Response toResponse(DataNotFoundException exception) {
		return Response
				.status(Status.NOT_FOUND)
				.entity(new ErrorCode(exception.getMessage(), Status.NOT_FOUND.toString(), "NOT FOUND"))
				.build();
	}

}
