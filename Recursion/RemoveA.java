package com.Akd.Subset;
//Remove all the 'a's from the given string

public class RemoveA {
    public static void main(String[] args) {
        String s = "aabccdab";
        removeA("", s);
        System.out.println(skip(s));
    }

    //Using return type
    private static String skip(String s) {
        if (s.isEmpty()) {
            return "";
        }
        if (s.charAt(0) == 'a') {
            return skip(s.substring(1));
        } else {
            return s.charAt(0) + skip(s.substring(1));
        }
    }

    //Using void
    private static void removeA(String p, String up) {
        //up= unprocessed String
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        if (up.charAt(0) == 'a') {
            removeA(p, up.substring(1)); //Not altering the processed.
        } else {
            removeA(p + up.charAt(0), up.substring(1));
        }
    }
}
