package com.Akd.Subset;
//skip a particular string

public class SkipApple {
    public static void main(String[] args) {
        String s= "An apple a day keeps the doctor away";
        System.out.println(skipApple(s));
    }

    private static String skipApple(String s) {
        if (s.isEmpty()) {
            return "";
        }
        if (s.startsWith("apple")) {
            return skipApple(s.substring(5));
        } else {
            return s.charAt(0) + skipApple(s.substring(1));
        }
    }
}
