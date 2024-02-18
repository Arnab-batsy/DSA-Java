package com.Akd.Backtracking.Mazes;
//Q- You're at (0,0). In how many ways can you reach to the end of a 3x3 matrix?
//You can only go right and down and also diagonal.

import java.util.ArrayList;

public class Maze2 {
    public static void main(String[] args) {
        System.out.println(diagonalPaths("",2,2));
    }

    private static ArrayList<String> diagonalPaths(String p, int r, int c) {
        if(r==0 && c==0){
            ArrayList<String> list= new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> store= new ArrayList<>();
        if(r>0){
            store.addAll(diagonalPaths(p+"D",r-1,c));
        }
        if(c>0){
            store.addAll(diagonalPaths(p+"R",r,c-1));
        }
        //For Diagonal path. Let c- Cross
        if(c>0 && r>0){
            store.addAll(diagonalPaths(p+"C",r-1,c-1));
        }
        return store;
    }
}
