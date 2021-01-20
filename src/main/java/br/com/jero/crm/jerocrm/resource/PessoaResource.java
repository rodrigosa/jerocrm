package br.com.jero.crm.jerocrm.resource;

import br.com.jero.crm.jerocrm.model.Pessoa;
import br.com.jero.crm.jerocrm.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;
import java.util.Optional;

@RestController
@Path("/pessoa")
public class PessoaResource {

    @Autowired
    PessoaRepository repository;



    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Iterable<Pessoa> get() {
        return (List<Pessoa>) repository.findAll();
    }

    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Optional<Pessoa> getById(@PathParam("id") Integer id) {
        return repository.findById(id);
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response post(Pessoa pessoa) {
        try {
            repository.save(pessoa);
            return Response.status(Response.Status.CREATED).entity(pessoa).build();
        } catch (Exception ex) {
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(ex.getMessage()).build();
        }
    }

    @PUT
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response put(@PathParam("id") int id, Pessoa pessoa) {
        Optional<Pessoa> p = repository.findById(id);
        if (p == null)
            return Response.status(Response.Status.NOT_FOUND).build();

        try {
            pessoa.setIdpessoa(id);
            repository.save(pessoa);
            return Response.status(Response.Status.OK).entity(pessoa).build();
        } catch (Exception ex) {
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(ex.getMessage()).build();
        }
    }

    @DELETE
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response delete(@PathParam("id") int id) {
        Optional<Pessoa> p = repository.findById(id);
        if (p == null)
            return Response.status(Response.Status.NOT_FOUND).build();

        try {
            repository.deleteById(id);
            return Response.status(Response.Status.OK).build();
        } catch (Exception ex) {
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(ex.getMessage()).build();
        }
    }

}
