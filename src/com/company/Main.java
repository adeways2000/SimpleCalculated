package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        SimpleCalculator calculator = new SimpleCalculator();

        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);

        System.out.println("substract = " + calculator.getSubtractionResult());
        System.out.println("Addition = " +calculator.getAdditionResult());

        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);
        System.out.println("division = " +calculator.getDivisionResult());
        System.out.println("multiplication = " +calculator.getMultiplicationResult());

    }
}
