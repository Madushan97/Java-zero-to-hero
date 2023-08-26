package com.company;

public class Swap2NumbersWithoutTemp {

    public void SwapTwoNumbersWithoutTempVariable(int a, int b) {

        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("Num1 is: "+ a + "\n"+"Num1 is: "+ b);
    }
}
