package Pokemon;

public class Charmander extends Pokemon implements IntFuego{
    public Charmander() {
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Soy Charmander ataquee Placaa");
    }

    @Override
    protected void araniazo() {
        System.out.println("Soy Charmander ataquee Araniazo");
    }

    @Override
    protected void mordizco() {
        System.out.println("Soy Chrmander ataquee Mordizco");
    }

    @Override
    public void atacarPunioFuego() {

    }

    @Override
    public void lanzallamas() {
        System.out.println("LANZO LLAMAASSS");
    }

    @Override
    public void atacarAscuas() {
        System.out.println(",,,,,,,,,,,,,,");
    }
}
