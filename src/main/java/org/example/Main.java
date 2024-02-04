package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>(Arrays.asList(1, 2));
        Calculator calculator = new Calculator();
        System.out.println("calculator.sum(array) = " + calculator.sum(array));
        List<Double> array2 = new ArrayList<>(Arrays.asList(1.0, 6.0));
        System.out.println("calculator.sum(array2) = " + calculator.sum(array2));
        System.out.println("calculator.multi(new ArrayList<>(Arrays.asList(1.0, 2.0, 3.0))) = "
                + calculator.multi(new ArrayList<>(Arrays.asList(1.0, 2.0, 3.0))));
        System.out.println("calculator.div(6.0, 3.0) = " + calculator.div(6.0, 3.0));
        System.out.println("calculator.binToDec(\"111\") = " + calculator.binToDec("111"));
        System.out.println("calculator.binToDec(111) = " + calculator.binToDec(111));
        System.out.println("calculator.BinareNum(4.5) = " + calculator.BinareNum(4.5));
    }
}
