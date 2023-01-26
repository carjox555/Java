package EjeArrayList;

public class Instrumento {
    private  String ID;
    private double precio;
    private TipoInstrumento tipo;

    @Override
    public String toString() {
        return "Instrumento{" +
                "ID='" + ID + '\'' +
                ", precio=" + precio +
                ", tipo=" + tipo +
                '}';
    }
    
}
