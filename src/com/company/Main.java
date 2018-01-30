package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // 1.2.​ Parašyti programą, kuri paprašytų vartotojo įvesti žodį ir atspausdintų kiek simbolių yra
        // tame žodyje.
        Scanner sc = new Scanner(System.in);
        System.out.println("Iveskite zodi");
        String zodis = sc.nextLine();
        System.out.println("Jusu zodis: " + zodis);
    }
}
