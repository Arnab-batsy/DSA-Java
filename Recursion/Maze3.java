package com.Akd.Backtracking.Mazes;
//Q- Maze with obstacles
//You're given a boolean Matrix where false means river.
//Here- (1,1) is false. Only right and down operations are allowed

public class Maze3 {

    public static void main(String[] args) {
        boolean[][] arr ={{true,true,true},{true,false,true},{true,true,true}};
        obstacleMaze("",arr,0,0);
    }
    //Whenever you land on a new cell, check whether it's river or not.
    //If you land on river, stop recursion for that call
    private static void obstacleMaze(String p,boolean[][] arr, int r, int c) {
        //Now we are doing 0 to end
        if(r==arr.length-1 && c==arr[0].length-1){
            System.out.println(p);
            return;
        }
        //Only extra check that we need to add
        if(!arr[r][c]){
            return;
        }
        if(r<arr.length-1){
            obstacleMaze(p+"D",arr,r+1,c);
        }
        if(c<arr[0].length-1){
            obstacleMaze(p+"R",arr,r,c+1);
        }
    }
}
