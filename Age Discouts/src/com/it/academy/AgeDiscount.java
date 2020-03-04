package com.it.academy;

import java.util.Scanner;

public class AgeDiscount {

    public static void main(String[] args) {
        System.out.println("Insert your age:");
   Scanner scanner = new Scanner(System.in);
   int age = scanner.nextInt();

	if ( age > 65  ) {
        System.out.println("10% discount");
    }
if ( age < 18 ) {
    System.out.println("25% discount");
}
else
    System.out.println("additional 5% discount");
    }
}
