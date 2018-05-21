package pl.edu.ur.oopl10;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author mchla
 */
public class Main {

    public static void main(String[] args) throws ArithmeticException {
        //Zadanie 2
        int[] tablica = {10, 20, 30, 40, 50};
        Scanner sc = new Scanner(System.in);

        System.out.println("Który element tablicy wyświetlić?");
        int index = sc.nextInt();
        sc.close();
        try {
            System.out.println(tablica[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Błąd");
        }

        //Zadanie 3
        int dzielna, dzielnik, wynik;
        try {
            dzielna = 128;
            dzielnik = 0;
            wynik = dzielna / dzielnik;
            System.out.println("Niemożliwe !!!");
        } catch (ArithmeticException e) {
            System.out.println("Dzielenie przez 0");

        }

        //Zadanie 4
        Random losuj = new Random();
        int x = 0;
        while (x != 3) {
            int jeden = (-10) + losuj.nextInt((10 - (-10)) + 1);
            int dwa = (-10) + losuj.nextInt((10 - (-10)) + 1);
            if (dwa == 0) {
                x++;
                System.out.println("NIE WOLNO DZIELIC PRZEZ ZERO" + x);
            } else {
                double z = jeden / dwa;
                System.out.println("Wynik:" + z);
            }
        }
        if (x == 3) {
            throw new ArithmeticException();

        }
    }
}
