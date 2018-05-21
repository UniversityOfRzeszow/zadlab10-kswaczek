/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl10;

import java.util.Scanner;

/**
 *
 * @author Kasia
 */
public class WprowadzZKonsoli {
     Scanner sc = new Scanner(System.in);

    public int wprowadzInt() {

        try {
            System.out.println("Podaj liczbe: ");
            int x = sc.nextInt();
            System.out.println("Liczba: " + x);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Błąd");
        }
        return 0;
    }

    public char wprowadzChar() {

        try {
            System.out.println("Podaj char: ");
            char x = (char) sc.nextInt();
            System.out.println(x);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Błąd");
        }

        return 0;
    }

    public String wprowadzString() {

        try {
            System.out.println("Wprowadz słowo: ");
            String x = sc.next();
            System.out.println("Słowo: " + x);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Błąd");
        }
        return null;

    }

    public float wprowadzFloat() {

        try {
            System.out.println("Float: ");
            float x = sc.nextInt();
            System.out.println(x);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Błąd");
        }
        return 0;
    }

    public double wprowadzDouble() {

        try {
            System.out.println("Double: ");
            double x = sc.nextInt();
            System.out.println(x);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Błąd");
        }
        return 0;
    }

    public long wprowadzLong() {

        try {
            System.out.println("Double: ");
            double x = sc.nextInt();
            System.out.println(x);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Błąd");
        }
        return 0;
    }
}

