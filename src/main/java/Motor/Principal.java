package Motor;

import Vehiculos.Auto;

public class Principal {
    public static void main(String[] args) {
        Auto a = new Auto("m1","m2","m3",true);
        a.encender();
        System.out.println(a);

    }
}
