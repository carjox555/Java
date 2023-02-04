package Pokemon;

public class Bulbassur extends Pokemon implements IntPlanta{
    public Bulbassur() {
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Soy Bulbasor ataquee Placaa");
    }

    @Override
    protected void araniazo() {
        System.out.println("Soy Bulbasor ataqueee Araniazo");
    }

    @Override
    protected void mordizco() {
        System.out.println("Soy Bulbasor ataque Mordizco");
    }

    @Override
    public void atacarDrenaje() {
        System.out.println("Soy Bulbasor Ataque Drenaje");
    }

    @Override
    public void atacarParalisar() {
        System.out.println("Soy Bulbasor ataquee Paralizacion");
    }
}
