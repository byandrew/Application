package br.com.rest.resources;

import java.io.IOException;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.UriInfo;

import br.com.rest.model.Banda;
import br.com.rest.service.BandaService;

@Path("/bandas")
public class BandasResource {

	@Context
	UriInfo uriInfo;
	@Context
	Request request;

	BandaService bandaService;

	public BandasResource() {
		bandaService = new BandaService();
	}

	@GET
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public List<Banda> getBandas() {
		return bandaService.getBandaAsList();
	}

	@GET
	@Produces(MediaType.TEXT_XML)
	public List<Banda> getBandasAsHtml() {
		return bandaService.getBandaAsList();
	}

	// URI: /rest/bandas/count
	@GET
	@Path("count")
	@Produces(MediaType.TEXT_PLAIN)
	public String getCount() {
		return String.valueOf(bandaService.getBandasCount());
	}

	//Pegando as informações do form e criando banda.
	@POST
	@Produces(MediaType.TEXT_HTML)
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	public void createBanda(@FormParam("id") String id,
			@FormParam("nomeBanda") String nomeBanda,
			@FormParam("anoFormacao") int anoFormacao,
			@Context HttpServletResponse servletResponse) throws IOException {
		Banda banda = new Banda(id, nomeBanda, anoFormacao);
		bandaService.createBanda(banda);
		servletResponse.sendRedirect("./bandas/");
	}

	// Listando banda para fazer operações.
	@Path("{banda}")
	public BandaResource getBandas(@PathParam("banda") String id) {
		return new BandaResource(uriInfo, request, id);
	}

}
