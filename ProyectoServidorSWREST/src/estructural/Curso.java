package estructural;

public class Curso {
    
    private String nombreCurso;
    private boolean vuelanLosPavoReales;
    
    public Curso() {
        super();
    }


    public Curso(String nombreCurso, boolean vuelanLosPavoReales) {
        super();
        this.nombreCurso = nombreCurso;
        this.vuelanLosPavoReales = vuelanLosPavoReales;
    }


    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setVuelanLosPavoReales(boolean vuelanLosPavoReales) {
        this.vuelanLosPavoReales = vuelanLosPavoReales;
    }

    public boolean isVuelanLosPavoReales() {
        return vuelanLosPavoReales;
    }
}
