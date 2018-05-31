package com.company;

public class Main {

    public static void main(String[] args) {

        CalculateService ser = new CalculateService();
        ICalculate calc = ser.getCalculatePort();
        System.out.println(calc.mult(3,2));

    }
}
