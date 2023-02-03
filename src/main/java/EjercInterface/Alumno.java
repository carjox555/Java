package EjercInterface;

import java.util.ArrayList;

public class Alumno implements Aprobable {
    private String Id;
    private String nombre;
    private String apellido;
    private ArrayList<Examen> examenes;

    public Alumno(String id, String nombre, String apellido) {
        Id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.examenes = new ArrayList<>();
    }

    public void agregarExamen(Examen e){
        this.examenes.add(e);
    }

    @Override
    public boolean aprobo() {
        int i =0;
        while (i<this.examenes.size() && this.examenes.get(i).aprobo()){
            i++;
        }

        return i== this.examenes.size();
    }
}
