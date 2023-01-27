package Vehiculos;

import Motor.Motor;

public class Auto extends Vehiculo{

    private boolean tienAire;

    public Auto(String marca, String modelo, String patente, boolean tienAire) {
        super(marca, modelo, patente);
        this.tienAire = tienAire;
    }

    void prenderAire(){
    if (tienAire){
        System.out.println("Encendiendo aire");
    }
}
}
