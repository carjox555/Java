package Pokemon;

public class Squirtle extends Pokemon implements IntAgua{

    public Squirtle() {
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Soy Squirtle ataquee Placaa");
    }

    @Override
    protected void araniazo() {
        System.out.println("Soy Squirtle ataquee Araniazo");
    }

    @Override
    protected void mordizco() {
        System.out.println("Soy Squiertle ataquee Mordizco");
    }

    @Override
    public void atacarHidrobomba() {

    }

    @Override
    public void atacarBurbuja() {
        System.out.println(",,,,,,,,,,,,,,");
    }

    @Override
    public void atacarPistolaAgua() {
        System.out.println(",,,,,,,,,,,,,,");
    }
}
