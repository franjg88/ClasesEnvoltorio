package com.cice.api;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("introduce un numero: ");

        String a = sc.nextLine();

        System.out.println("Introduce otro numero: ");

        String b = sc.nextLine();

        int enteroA = Integer.parseInt(a);
        int enteroB = Integer.parseInt(b);

        System.out.println("La suma de los numeros es: "+ (enteroA + enteroB));

    }
}
