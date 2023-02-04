package Pokemon;

public class Pikachu extends Pokemon implements IntElectrico{
    public Pikachu() {
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Soy Pikachuu ataquee Placaa");
    }

    @Override
    protected void araniazo() {
        System.out.println("Soy Pikachuuu ataquee Araniazo");
    }

    @Override
    protected void mordizco() {
        System.out.println("Soy Pikachuuu ataquee Mordizco");
    }

    @Override
    public void atacarImpactrueno() {
        System.out.println(",,,,,,,,,,,,,,");
    }

    @Override
    public void atacarPunioTrueno() {
        System.out.println(",,,,,,,,,,,,,,");
    }
}
