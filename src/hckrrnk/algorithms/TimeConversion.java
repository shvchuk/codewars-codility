package hckrrnk.algorithms;

import java.util.Scanner;

public class TimeConversion {
    public static void main(String[] args) {
        readTimeFromStdInput();
    }



// Read Time from STDIN method

    public static void readTimeFromStdInput() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter time in 12-hour AM/PM format:");
        String twelveHourFormatTime = scanner.nextLine();
        System.out.println(twelveHourFormatTime);
    }

}