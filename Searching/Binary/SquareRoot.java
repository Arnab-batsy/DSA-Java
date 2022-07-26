package com.arnab.PracticeSheet;

public class SquareRoot {
    public int mySqrt(int x) {
        long l = 1, h = x;
        while(l <= h){
            long mid = (l+h)/2;
            if(mid * mid == x){
                return (int)mid;
            }
            else if(mid * mid < x){
                l = mid + 1;
            }
            else {
                h = mid - 1;
            }
        }
        return (int)h;
    }
}
