package com.company;

public class Conversion {

    public int convertBinary(int binary) {

        //https://www.javatpoint.com/java-binary-to-decimal

        int decimal = 0;
        int n = 0;

        while (true) {
            if (binary == 0) {
                break;
            }
            else {
                int temp = binary % 10;
                decimal += temp * Math.pow(2, n);
                binary = binary / 10;
                n++;
            }
        }
        return decimal;
    }

    public boolean checkBinary(int binary){

        //https://www.geeksforgeeks.org/check-if-a-number-is-binary-or-not-in-java/

        if (binary == 0 || binary == 1 || binary < 0) {
            return false;
        }

        while (binary != 0) {
            if (binary % 10 > 1) {
                return false;
            }
            binary = binary / 10;
        }
        return true;
    }

    public void convertDecimal(int decimal) {

        //https://www.javatpoint.com/java-decimal-to-binary

        int binary[] = new int[40];
        int index = 0;

        while (decimal > 0) {
            binary[index++] = decimal % 2;
            decimal = decimal / 2;
        }

        for (int i = index - 1; i > 0; i--) {
            System.out.print(binary[i]);
        }
    }
}
