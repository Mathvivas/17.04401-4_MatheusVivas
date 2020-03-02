package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    double n1, n2;
	    // sout tab
        System.out.println("Informe dois números (separador decimal (,)): ");
        Scanner scanner = new Scanner(System.in);
        n1 = scanner.nextDouble();
        //Ctrl + d = duplica a linha
        n2 = scanner.nextDouble();
        if (n1 > n2) {
            System.out.println("N1 é maior!");
        }
        else {
            System.out.println("N2 é maior!");
        }
    }
}
