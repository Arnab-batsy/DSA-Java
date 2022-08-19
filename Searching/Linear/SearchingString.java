package com.arnab;

public class SearchingString {
    public static void main(String[] args) {
        String str= "Arnab Kumar Das";
        char target= 'm';
        System.out.println(search(str, target));
    }
    static boolean search(String str, char target){
        if(str.length()==0){
            return false;
            //Case might occur when the string has no elements.
        }
        //Run for loop.
        for(char ch: str.toCharArray()){
            //check for element at every index if it's = target
            //Enhanced loop for String
            // .toCharArray function converts the string to a character array
            if(target==ch){
                return true;
            }
        }
        //This line will execute if none of the return statements above have executed
        //Hence target not found
        return false;
    }
}
