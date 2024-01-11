package com.arnab;

import java.util.Arrays;
import java.util.Locale;

public class Methods {
    public static void main(String[] args) {
        String name= "Debalina Das";
        System.out.println(Arrays.toString(name.toCharArray()));
        //converts a String into a character Array
        System.out.println(name.toLowerCase()); //Creates new object (Immutable)
        System.out.println(name.toUpperCase());
        System.out.println(name.indexOf('a')); //Gives first index
        System.out.println(name.lastIndexOf('a')); //Gives last index
        System.out.println("      Arnab     ".strip()); //Removes extra spaces from start and end
        System.out.println(Arrays.toString(name.split(" "))); //Here it will split from the in between space
        String b= "Arnab Kumar Das";
        System.out.println(Arrays.toString(b.split("a"))); //Here it will split from the 'a' everywhere
        //But 'a' won't be present in the elements
    }
}
