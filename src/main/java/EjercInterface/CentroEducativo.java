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
        int cant=0;
        for (Alumno alumno : alumnos){
            if(alumno.aprobo()){
                cant ++;
            }
        }
        return 0;
    }
}
