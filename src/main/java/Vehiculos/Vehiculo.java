package Vehiculos;

public class Vehiculo {
    private String marca;
    private String modelo;
    private String patente;

    void acelerar(){
        System.out.println("Acelerando");
    }
    void frenar(){ System.out.println("Frenando");    }
    public void encender(){
        System.out.println("Encendiedo");
    }

    public Vehiculo(String marca, String modelo, String patente) {
        this.marca = marca;
        this.modelo = modelo;
        this.patente = patente;
    }


    @Override
    public String toString() {
        return "Vehiculo{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", patente='" + patente + '\'' +
                '}';
    }
}
