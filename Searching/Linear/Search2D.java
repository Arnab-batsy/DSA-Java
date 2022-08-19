package com.arnab;
import java.util.Arrays;
import java.util.Scanner;
public class Search2D {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int [][] arr= {
                {1,12,4,5},
                {-4,13,0},
                {2,69,-7}
        };
        System.out.println("enter the element you want to search");
        int target=sc.nextInt();
        Search2D obj= new Search2D();
        System.out.println(Arrays.toString(obj.search(arr,target)));
    }
    public int[] search(int[][] arr, int t){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (t==arr[i][j]){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
