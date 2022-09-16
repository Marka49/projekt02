package com.company;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        count(userInput());

    }

    static void count(String sentence) {
        String[] pes = sentence.split(" ");
        System.out.println("počet slov je " + pes.length);
    }

    static String userInput() {
        return sc.nextLine();
    }
}
