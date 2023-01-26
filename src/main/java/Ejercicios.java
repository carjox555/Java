import java.util.Scanner;

public class Ejercicios {
    public static void main(String[] args) {
        System.out.println("Iniciando...");

        Scanner sc = new Scanner(System.in);
        float guille,juan, luis, total;
        System.out.println("Digite cantidad");
        guille =sc.nextFloat();

        luis = guille/2;
        juan= (guille+luis)/2;

        total = guille+luis+juan;

        System.out.println("la cantidad es "+total);


    }
}

