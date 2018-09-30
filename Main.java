package com.company;

import java.util.Scanner;

import static java.lang.Math.pow;
import static java.lang.StrictMath.sqrt;

public class Main {

    public static void main(String[] args) {
        double jeden;
        double dwa;
        double wynik;
        int co;

        Scanner Dane = new Scanner(System.in);

        System.out.println("Podaj pierwszą wartość: ");
        jeden = Dane.nextDouble();
        System.out.println("Podaj drugą wartość: ");
        dwa = Dane.nextDouble();

        System.out.println("Menu");
        System.out.println("1. Dodawanie");
        System.out.println("2. Odejmowanie");
        System.out.println("3. Mnożenie");
        System.out.println("4. Dzielenie");
        System.out.println("5. Reszta z dzielenia");
        System.out.println("6. Potęgowanie");
        System.out.println("7. Pierwiastek II stopnia");
        co = Dane.nextInt();

        switch(co) {
            case 1:
                wynik = jeden + dwa;
                System.out.println(wynik);
                break;

            case 2:
                wynik = jeden - dwa;
                System.out.println(wynik);
                break;

            case 3:
                wynik = jeden * dwa;
                System.out.println(wynik);
                break;

            case 4:
                if(dwa != 0) {
                    wynik = jeden / dwa;
                    System.out.println(wynik);
                }
                else System.out.println("Pamiętaj cholero nie dziel przez 0!");
                break;

            case 5:
                wynik = jeden % dwa;
                System.out.println(wynik);
                break;

            case 6:
                wynik = pow(jeden, dwa);
                System.out.println(wynik);
                break;

            case 7:
                wynik = sqrt(jeden);
                System.out.println(wynik);
                break;
        }
    }
}
