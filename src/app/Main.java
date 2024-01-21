package app;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double inputValue = inputValue();
        boolean isConvertToMiles = isConvertToMiles();

        printResult(inputValue, isConvertToMiles, getResult(inputValue, isConvertToMiles));
    }

    private static double inputValue(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть значення: ");
        return scanner.nextDouble();
    }

    private static  boolean isConvertToMiles(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Перевести в милі (так=1/ні=0)?  ");
        return (scanner.nextInt() == 1) ? true : false;
    }

    private static double getResult(double inputValue, boolean isConvertToMiles){
        return -1;
    }

    private static void printResult(double inputValue, boolean isConvertToMiles, double result){

    }


}
