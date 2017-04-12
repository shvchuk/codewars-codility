package codility.lessons;

import java.lang.reflect.Array;
import java.util.Scanner;

public class BinaryGap {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = reader.nextInt();


        binaryGapSolution(n);
    }

    public static void binaryGapSolution(int n) {
        String numberString = Integer.toBinaryString(n);
        System.out.println(numberString);
        System.out.println(numberString.length());
        System.out.println("-----------");

        int[] binaryArray = new int[numberString.length()];

        // converting binary number from string to int array
        for(int i=0; i < numberString.length(); i++){
            binaryArray[i] = Integer.parseInt(String.valueOf(numberString.charAt(i)));
            System.out.println("Binary Array index [" + i + "] : " + binaryArray[i]);
        }

//
//        //int binaryGapSolutionValue = 0;
//
//
//
//
//        String binaryArrayString = new String();
//
//        for(int j = 0; j < binaryArray.length; j++){
//            binaryArrayString += String.valueOf(binaryArray[j]);
//        }
//
//
//        // System.out.println(binaryArrayString);
    }
}
