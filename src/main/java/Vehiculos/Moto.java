package Vehiculos;

public class Moto extends  Vehiculo{
    private int anchoManubrio;

    public Moto(String marca, String modelo, String patente) {
        super(marca, modelo, patente);
    }

    void hacerWiliee(){
        System.out.println("Alzando con wiliee");
    }
}
