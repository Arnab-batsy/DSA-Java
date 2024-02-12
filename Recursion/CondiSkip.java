package com.Akd.Subset;
//Skip app only when it's not a part of apple
//Time complexity= size of string i.e, O(N)

public class CondiSkip {
    public static void main(String[] args) {
        String s= "An app apple a day app keeps the dappoctor app away";
        System.out.println(skipAppNotApple(s));
    }

    private static String skipAppNotApple(String s) {
        if (s.isEmpty()) {
            return "";
        }
        if (s.startsWith("app") && !s.startsWith("apple")) {
            return skipAppNotApple(s.substring(3));
        } else {
            return s.charAt(0) + skipAppNotApple(s.substring(1));
        }
    }
}
