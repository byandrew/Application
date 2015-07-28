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

import br.com.rest.model.Musica;
import br.com.rest.service.MusicaService;

public class MusicaResource {

	@Context
	UriInfo uriInfo;
	@Context
	Request request;
	String id;
	
	MusicaService musicaService;
	
	public MusicaResource(UriInfo uriInfo, Request request, String id){
		this.uriInfo = uriInfo;
		this.request = request;
		this.id = id;
		musicaService = new MusicaService();
	}
	
	@GET
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public Musica getMusica() {
		Musica musica = musicaService.getMusica(id); 
		return musica;
	}
	
	@GET
	@Produces(MediaType.TEXT_XML)
	public Musica getMusicaAsHtml() {
		Musica musica = musicaService.getMusica(id);
		return musica;
	}
	
	@PUT
	@Consumes(MediaType.APPLICATION_XML)
	public Response putMusica(JAXBElement<Musica> musicaElement) {
		Musica musica = musicaElement.getValue();
		Response response;
		if (musicaService.getMusicas().containsKey(musica.getId())) {
			response = Response.noContent().build();
		} else {
			response = Response.created(uriInfo.getAbsolutePath()).build();
		}
		musicaService.createMusica(musica);
		return response;
	}
	
	@DELETE
	public void deleteMusica() {
		musicaService.deleteMusica(id);
	}
	
}
