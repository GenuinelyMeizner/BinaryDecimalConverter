package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Conversion conversion = new Conversion();

        while (true) {
            try {
                Scanner menu = new Scanner(System.in);
                System.out.print("\nPress 1 for conversion from Binary to Decimal\nPress 2 for conversion from Decimal to Binary\nInput: ");
                int menuChoice = menu.nextInt();

                switch (menuChoice) {
                    case 1:
                        System.out.print("\nInsert Binary: ");
                        int binary = menu.nextInt();

                        if (conversion.checkBinary(binary) == true) {
                            System.out.println("Result: " + conversion.convertBinary(binary));
                        }

                        else {
                            System.out.println("Not a binary number");
                        }
                        break;

                    case 2:
                        System.out.print("\nInsert Decimal: ");
                        int decimal = menu.nextInt();

                        System.out.print("\nResult: ");
                        conversion.convertDecimal(decimal);
                        System.out.println("");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Wrong input");
            }
        }
    }
}
