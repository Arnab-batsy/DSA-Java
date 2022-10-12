package com.arnab.Practice;

public class SmallestLetter {
        public char nextGreatestLetter(char[] letters, char target) {
            int start=0;
            int l= letters.length;
            int end= l-1;
            while(start<=end){
                int mid= start+(end-start)/2;
                if(target<letters[mid]){
                    end=mid-1;
                }
                else {
                    start=mid+1;
                }
            }
            return letters[start % l];
        }
    }
