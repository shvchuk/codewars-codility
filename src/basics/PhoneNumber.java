package basics;

import java.util.Arrays;

public class PhoneNumber {
    public static void main(String[] args) {
        String phoneNumber = createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0});
        System.out.println(phoneNumber);
        System.out.println("---");
        String phoneNumberBestSol = createPhoneNumberBestSolution(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0});
        System.out.println(phoneNumberBestSol);
    }

    public static String createPhoneNumberBestSolution(int[] numbers){
        return String.format("(%d%d%d) %d%d%d-%d%d%d%d", numbers[0], numbers[1], numbers[2],
                numbers[3], numbers[4], numbers[5], numbers[6], numbers[7], numbers[8], numbers[9]);
    }

    public static String createPhoneNumber(int[] numbers){
        int[] array1 = Arrays.copyOfRange(numbers, 0, 3);
        int[] array2 = Arrays.copyOfRange(numbers, 3, 6);
        int[] array3 = Arrays.copyOfRange(numbers, 6, 10);

        String arrayOneString = new String();
        String arrayTwoString = new String();
        String arrayThreeString = new String();

        for(int j = 0; j < array1.length; j++){
            arrayOneString += String.valueOf(array1[j]);
        }

        for(int k = 0; k < array2.length; k++){
            arrayTwoString +=String.valueOf(array2[k]);
        }

        for(int n = 0; n < array3.length; n++){
            arrayThreeString += String.valueOf(array3[n]);
        }

        return "("+arrayOneString+") " + arrayTwoString +"-"+arrayThreeString;
    }
}


