package EjercInterface;

import java.util.ArrayList;

public class CentroEducativo {
    private ArrayList<Alumno> alumnos;

    public CentroEducativo() {
        this.alumnos = new ArrayList<>();
    }
    //metodo agregar alumno
    public void agregarAlumno(Alumno a){
        this.alumnos.add(a);
    }
    //devolver cantidad aprovados

    public int cantAprobados(){
        return 0;
    }
}
