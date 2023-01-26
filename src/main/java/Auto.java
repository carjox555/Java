import Motor.Motor;

public class Auto {
    private String marca;
    private String color;
    private int kms;
    private boolean conAire;
    private Motor motor;

    public Auto(String marca, String color, int kms, boolean conAire, Motor motor) {
        this.marca = marca;
        this.color = color;
        this.kms = kms;
        this.conAire = conAire;
        this.motor = motor;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "marca='" + marca + '\'' +
                ", color='" + color + '\'' +
                ", kms=" + kms +
                ", conAire=" + conAire +
                '}';
    }
}
