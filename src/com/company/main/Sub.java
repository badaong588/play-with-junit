package com.company.main;

public class Sub {
    public boolean checkPassword(String a) {
        if (a == null || a.length() <= 0) {
            throw new IllegalArgumentException("Input can't be null or length <= 0");
        }
        if (a.length() < 8) {
            return false;
        }
        for (int i = 0; i < a.length(); i++) {
            if (Character.isLetter(a.charAt(i)) || Character.isDigit(a.charAt(i))) {
                continue;
            }
            return false;
        }
        return true;
    }
}
