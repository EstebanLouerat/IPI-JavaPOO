package org.example;
import java.util.Scanner;

public class Exercise {
    public String reverseString(String str) {
        StringBuilder rev = new StringBuilder();
        char n;

        for (int i = 0; i < str.length(); i++) {
            n = str.charAt(i);
            rev.insert(0, n);
        }

        return rev.toString();
    }
    public void pyramid() {
        pyramid(5); // default values
    }

    public void pyramid(int height) {
        for(int i = 1; i <= height; i++) {
            for(int j = 1; j <= height - i; j++) {
                System.out.print(" ");
            }
            for(int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public int sumTo10000() {
        int n = 10000;
        return n * (n + 1) / 2;
    }

    public static void checkNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez un nombre entier: ");

        while (!scanner.hasNextInt()) {
            System.out.println("Veuillez entrer un nombre entier valide !");
            scanner.next();
        }

        int n = scanner.nextInt();

        if (n % 2 == 0) {
            System.out.println(n + " est un nombre pair.");
        } else {
            System.out.println(n + " est un nombre impair.");
        }

        boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime && n > 1) {
            System.out.println(n + " est un nombre premier.");
        } else {
            System.out.println(n + " n'est pas un nombre premier.");
        }

        scanner.close();
    }
}
