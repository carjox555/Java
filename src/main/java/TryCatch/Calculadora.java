package TryCatch;

public class Calculadora {
    public int factorial(int num){
        if(num<0){
            throw new ArithmeticException("No se puede factoriar con negativos ");
        }
        if (num>12){
            throw new IllegalArgumentException("Mayor que 12 no se puede factoriar");
        }
        int fact=1;
        for (int i = 2; i <=num ; i++) {
            fact= fact*i;
        }
        return fact;
    }
}
