package br.com.robsonaraujo.service.api;

import java.io.Serializable;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.robsonaraujo.model.entity.Hello;
import br.com.robsonaraujo.service.exception.BusinessException;

/**
 * See {@link RestConfiguration}
 * @author nosbo
 *
 */
@Path("/hello")
public class HelloService implements Serializable {
	private static final long serialVersionUID = -1848201147900590329L;

	@GET
	@Path("/hi/{id}")
	@Produces(MediaType.APPLICATION_XML)
	public Hello hi(@PathParam("id") String id) {
		if ("boom".equals(id)) {
			throw new BusinessException("Invalid id");
		}
		return new Hello("hello from rest");
	}
}
