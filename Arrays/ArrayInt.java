package Practice.more;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayInt {
    public static void main(String[] args) {
        int[] num= {9,9,9,9,9,9,9,9,9,9}
        ;
        int k=1;
            ArrayList<Integer> list = new ArrayList<Integer>();
            int len = num.length-1;
            while( len >=0 || k!=0){
                if( len >= 0){
                    k += num[len];
                    len--;
                }
                list.add(k % 10);                      // using normal add method which add element at the end of list.
                k /= 10;
            }
            Collections.reverse(list);         // using collections reverse method to reverse our arraylist
            System.out.println(list);
        }
    }