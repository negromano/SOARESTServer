package serviciosSW;

import estructural.Curso;

import java.util.ArrayList;

import servicios.ServiciosCurso;

public class ServiciosCursoSW {
    
    public void adicionarCurso(String n, boolean b){
        ServiciosCurso.adicionarCurso(n, b);
    }
    
    public ArrayList<Curso> getAllCursos(){
        return ServiciosCurso.getAllCursos();
    }
    
    public ServiciosCursoSW() {
        super();
    }
}
