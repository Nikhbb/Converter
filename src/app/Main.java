package app;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean isConvertToMiles = isConvertToMiles();
        double inputValue = inputValue();

        printResult(inputValue, isConvertToMiles, getResult(inputValue, isConvertToMiles));
    }

    private static double inputValue() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input your value: ");
        return scanner.nextDouble();
    }

    private static boolean isConvertToMiles() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Converter MENU\n1 - for km to mi\n2 - for mi to km\nInput your choose: ");
        return (scanner.nextInt() == 1) ? true : false;
    }

    private static double getResult(double inputValue, boolean isConvertToMiles) {
        double index = 1.60934;
        return !isConvertToMiles ? (inputValue * index) : (inputValue / index);
    }

    private static void printResult(double inputValue, boolean isConvertToMiles, double result) {
        System.out.println("\nRESULT:");
        if (!isConvertToMiles) {
            System.out.println(inputValue + " mi = " + result + " km");
        } else {
            System.out.println(inputValue + " km = " + result + " mi");
        }
    }

}
