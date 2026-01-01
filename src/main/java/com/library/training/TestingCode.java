package com.library.training;

import java.util.Arrays;
import java.util.List;

public class TestingCode {

    public static void main(String[] args) {

        MathOperation addition = (a, b) -> a+b;

        int result=addition.operate(5,3);
        System.out.println(result);

        int total= calculate(5 , 5 , addition);
        System.out.println(total);

    }

    static int calculate(int x, int y, MathOperation operation) {
        return operation.operate(x,y);

    }
}
