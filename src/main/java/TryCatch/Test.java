package TryCatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
/*
        System.out.println("Ingresa y: ");
        int x =10, y, z;
        try {
            y = new Scanner(System.in).nextInt();
            z= x/y;
            System.out.println("Resultado: "+z);
        }
        catch (InputMismatchException ime){
            System.out.println("no es un numero entero");
        }
        catch (ArithmeticException ae){
            System.out.println("No se puede dividir por 0 __");
        }
        catch (Exception ex){
            System.out.println("Error: "+ex.getMessage());
            ex.printStackTrace(System.out);
        }
        System.out.println("Adioss..."); */
    int y, z;
        System.out.println("Ingresa t: ");
        y = new Scanner(System.in).nextInt();
        z= new Calculadora().factorial(y);
        System.out.println("Resultado: "+z);

    }


}
