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
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.UriInfo;

import br.com.rest.model.Musica;
import br.com.rest.service.MusicaService;

@Path("/musicas")
public class MusicasResource {

	@Context
	UriInfo uriInfo;
	@Context
	Request request;

	MusicaService musicaService;

	public MusicasResource() {
		musicaService = new MusicaService();
	}

	@GET
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public List<Musica> getMusicas() {
		return musicaService.getMusicaAsList();
	}

	@GET
	@Produces(MediaType.TEXT_XML)
	public List<Musica> getMusicasAsHtml() {
		return musicaService.getMusicaAsList();
	}

	// URI: /rest/musicas/count
	@GET
	@Path("count")
	@Produces(MediaType.TEXT_PLAIN)
	public String getCount() {
		return String.valueOf(musicaService.getMusicasCount());
	}

	//Pegando as informações do form e criando musica.
	@POST
	@Produces(MediaType.TEXT_HTML)
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	public void createMusica(@FormParam("id") String id,
			@FormParam("anoFormacao") int anoFormacao,
			@FormParam("nomeMusica") String nomeMusica,
			@FormParam("tipoMusica") String tipoMusica,
			@FormParam("autor") String autor,
			@FormParam("album") String album,
			@Context HttpServletResponse servletResponse) throws IOException {
		Musica musica= new Musica(id, nomeMusica, tipoMusica, autor, album);
		musicaService.createMusica(musica);
		servletResponse.sendRedirect("./musicas/");
	}

	// Listando musica para fazer operações.
	@Path("{musica}")
	public MusicaResource getMusicas(@PathParam("musica") String id) {
		return new MusicaResource(uriInfo, request, id);
	}

}
