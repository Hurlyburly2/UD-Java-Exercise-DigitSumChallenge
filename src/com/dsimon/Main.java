package com.dsimon;

public class Main {

    public static void main(String[] args) {
        System.out.println(SumDigits.sumDigits(125) == 8);
        System.out.println(SumDigits.sumDigits(123456) == 21);
        System.out.println(SumDigits.sumDigits(-1) == -1);
        System.out.println(SumDigits.sumDigits(5) == -1);
    }
}
