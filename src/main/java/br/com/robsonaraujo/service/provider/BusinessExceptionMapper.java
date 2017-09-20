package br.com.robsonaraujo.service.provider;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import br.com.robsonaraujo.service.exception.BusinessException;

@Provider
public class BusinessExceptionMapper implements ExceptionMapper<BusinessException> {

	@Override
	public Response toResponse(BusinessException exception) {
		StringBuilder mensagem = new StringBuilder("<response>");
		mensagem.append("<status>ERROR</status>");
		mensagem.append("<mensagem>");
		mensagem.append(exception.getMessage());
		mensagem.append("</mensagem>");
		mensagem.append("</response>");
		return Response.serverError().entity(mensagem.toString()).type(MediaType.APPLICATION_XML).build();
	}

}
