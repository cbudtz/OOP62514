package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Cosinus ti Pi er: " + Math.cos(Math.PI));
        String input ="";
        do {
            System.out.println("");
            input = new Scanner(System.in).next();
        } while (input==null || input.isEmpty() );
        System.out.println(input);

    }
}
