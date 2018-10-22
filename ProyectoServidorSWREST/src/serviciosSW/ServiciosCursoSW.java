package serviciosSW;

import estructural.Curso;

import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import servicios.ServiciosCurso;

@Path("unibague.jp")
public class ServiciosCursoSW {

    @PUT
    @Produces("application/xml")
    @Path("adicionarCurso")
    public void adicionarCurso(@QueryParam("n") String n, @QueryParam("b") boolean b){
        ServiciosCurso.adicionarCurso(n, b);
    }

    @GET
    @Produces("application/xml")
    @Path("getAllCursos")
    public ArrayList<Curso> getAllCursos(){
        return ServiciosCurso.getAllCursos();
    }
    
    public ServiciosCursoSW() {
        super();
    }
}
