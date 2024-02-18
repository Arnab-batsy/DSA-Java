package com.Akd.Backtracking.Mazes;
//Q- You're at (0,0). In how many ways can you reach to the end of a nxn matrix?
//Now you can go in any of the 4 directions

public class Maze4 {
    public static void main(String[] args) {
        boolean[][] arr ={{true,true,true},{true,true,true},{true,true,true}};
        allPaths("",arr,0,0);
    }
    //Now this allPaths will give Stack Overflow error. Since infinite paths are possible in all directions.
    //It occurs because, you can go back to where you started in each call. So, infinite recursions.
    //Solution- Do not move back to the same path
    //Mark the cells that are already visited. While moving, put the cells as false.

    private static void allPaths(String p,boolean[][] arr, int r, int c) {
        //Now we are doing 0 to end
        if(r==arr.length-1 && c==arr[0].length-1){
            System.out.println(p);
            return;
        }
        if(!arr[r][c]){
            return;
        }
        if(r<arr.length-1){
            allPaths(p+"D",arr,r+1,c);
        }
        if(c<arr[0].length-1){
            allPaths(p+"R",arr,r,c+1);
        }
        //For Up
        if(r>0){
            allPaths(p+"U",arr,r-1,c);
        }
        //For Left
        if(c>0){
            allPaths(p+"L",arr,r,c-1);
        }
    }
    //Problem- While going back i.e., up the recursion tree, the cells remain marked as visited.
    //After finding one of the paths, the original array gets marked throughout the path.
    //This creates problem while finding the next path.
    //Backtracking- While you are moving back, you restore the values of the maze as it was.
    //When you come out of the recursion i.e, when the function is returned, remark the cell as true (Revert the changes)
//See back1 code
}
