package com.company.main;

public class Main {
    public int divide(int a, int b) {
        if (b != 0) {
            return a / b;
        }
        else {
            throw new IllegalArgumentException("Divide by zero");
        }
    }
}
