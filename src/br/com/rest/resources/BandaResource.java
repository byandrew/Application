package br.com.rest.resources;



import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
import javax.xml.bind.JAXBElement;


import br.com.rest.model.Banda;
import br.com.rest.service.BandaService;

public class BandaResource {

	@Context
	UriInfo uriInfo;
	@Context
	Request request;
	String id;
	
	BandaService bandaService;
	
	public BandaResource(UriInfo uriInfo, Request request, String id){
		this.uriInfo = uriInfo;
		this.request = request;
		this.id = id;
		bandaService = new BandaService();
	}
	
	@GET
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public Banda getBanda() {
		Banda banda = bandaService.getBanda(id); 
		return banda;
	}
	
	@GET
	@Produces(MediaType.TEXT_XML)
	public Banda getBandaAsHtml() {
		Banda banda = bandaService.getBanda(id);
		return banda;
	}
	
	@PUT
	@Consumes(MediaType.APPLICATION_XML)
	public Response putBanda(JAXBElement<Banda> bandaElement) {
		Banda banda = bandaElement.getValue();
		Response response;
		if (bandaService.getBandas().containsKey(banda.getId())) {
			response = Response.noContent().build();
		} else {
			response = Response.created(uriInfo.getAbsolutePath()).build();
		}
		bandaService.createBanda(banda);
		return response;
	}
	
	@DELETE
	public void deleteBanda() {
		bandaService.deleteBanda(id);
	}
	
}
