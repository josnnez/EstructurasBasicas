package estructuras;

import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        int numberA = 5;
        final Scanner reader = new Scanner(System.in);
        if (numberA % 2 == 0)
            System.out.println("El numero: " + numberA + " es par.");
        else
            System.out.println("El numero: " + numberA + " es impar.");

        reader.close();
    }
}
