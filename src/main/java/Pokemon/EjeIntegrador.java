package Pokemon;

public class EjeIntegrador {
    public static void main(String[] args) {
        Squirtle squir = new Squirtle();
        Charmander charm = new Charmander();
        Bulbassur bulbassur = new Bulbassur();
        Pikachu picka1 = new Pikachu();

        squir.araniazo();
        squir.atacarPistolaAgua();
        charm.araniazo();
        charm.lanzallamas();
        bulbassur.mordizco();
        picka1.atacarPunioTrueno();

    }
}
