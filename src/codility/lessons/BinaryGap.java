package codility.lessons;

import java.lang.reflect.Array;
import java.util.Scanner;

public class BinaryGap {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = reader.nextInt();


        System.out.println("Max binary gap equals: " + binaryGapSolution(n));
    }

    public static int binaryGapSolution(int n) {
        if(n == 0) return 0;
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

        int[] oneBitIndexArray = new int[Integer.bitCount(n)];
        int j = 0;

        for(int i = 0; i < binaryArray.length; i++){
            if(binaryArray[i] == 1){
                oneBitIndexArray[j] = i;
                j++;
            }
        }
        System.out.println("---------");
        for(int i = 0; i < oneBitIndexArray.length; i++){
            System.out.println("One bit index array ["+i+"] : "+oneBitIndexArray[i]);
        }

        int maxBinaryGap = 0;
        int currentGap;

        for(int i = oneBitIndexArray.length-1; i > 0; i--){
            currentGap = oneBitIndexArray[i] - oneBitIndexArray[i-1];
            if(currentGap > maxBinaryGap) maxBinaryGap = currentGap;
        }

        return maxBinaryGap-1;
    }
}
