package servicios;

import estructural.Curso;

import java.util.ArrayList;

import javax.smartcardio.ATR;

public class ServiciosCurso {
    
    private static ArrayList<Curso> cursos = new ArrayList<>();
    
    public ServiciosCurso() {
        super();
    }
    
    public static void adicionarCurso(String n, boolean b){
        cursos.add(new Curso(n,b));
    }
    
    public static ArrayList<Curso> getAllCursos(){
        return cursos;
    }
}
