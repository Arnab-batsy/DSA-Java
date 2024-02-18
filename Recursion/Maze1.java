package com.Akd.Backtracking.Mazes;
//Q- You're at (0,0). In how many ways can you reach to the end of a 3x3 matrix?
//You can only go right and down.

import java.util.ArrayList;
import java.util.List;

public class Maze1 {
    public static void main(String[] args) {
//        System.out.println(countPaths(2,2));
        System.out.println(returnPaths("",2,2));
    }

    public static int countPaths(int r, int c){
        //When we reach the last column, there is only 1 way down
        //Similarly, when we reach the last row, there is only 1 way right

        if(r==0 || c==0){
            return 1;
        }

        return countPaths(r-1,c) + countPaths(r,c-1);
    }
    //Return All the paths
    public static List<String> returnPaths(String p, int r, int c){
        //When we reach the last column, there is only 1 way down
        //Similarly, when we reach the last row, there is only 1 way right
        //p(Processed) is the path till the point r,c
        if(r==0 && c==0){
            ArrayList<String> list= new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> store= new ArrayList<>();
        if(r>0){
            store.addAll(returnPaths(p+"D",r-1,c));
        }
        if(c>0){
             store.addAll(returnPaths(p+"R",r,c-1));
        }
        return store;
    }
}
