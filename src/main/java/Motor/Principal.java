package Motor;

import EjercInterface.*;
import Vehiculos.Auto;

public class Principal {
    public static void main(String[] args) {
        CentroEducativo c = new CentroEducativo();

        Alumno pepe = new Alumno("123","raul","mendez");
        Alumno ana = new Alumno("423","ana","martinez");
        Alumno julia = new Alumno("123","julia","julis");

        pepe.agregarExamen(new ExamenEscrito(40,7,"00/00/00"));
        pepe.agregarExamen(new ExamenOral(NivelSatisfaccion.EXCELENTE,"00/00/00"));

        ana.agregarExamen(new ExamenEscrito(65,7,"00/00/00"));
        ana.agregarExamen(new ExamenEscrito(65,8,"00/00/00"));
        ana.agregarExamen(new ExamenOral(NivelSatisfaccion.EXCELENTE,"00/00/00"));

        julia.agregarExamen(new ExamenEscrito(100,9,"00/00/00"));
        julia.agregarExamen(new ExamenOral(NivelSatisfaccion.INSUFICIENTE,"00/00/00"));

        c.agregarAlumno(pepe);
        c.agregarAlumno(ana);
        c.agregarAlumno(julia);

        System.out.println("Cantidad Alumnos aprobados: "+c.cantAprobados());

    }

}
