package com.Akd.Backtracking;
//Backtracking- Make a change and then revert it when the work is done
//Same Q as Maze 4
public class Back1 {
    public static void main(String[] args) {
        boolean[][] arr ={{true,true,true},{true,true,true},{true,true,true}};
        backtrackALlPaths("",arr,0,0);
    }
    //Do not move back to the same path
    //Mark the cells that are already visited. While moving, put the cells as false.
    //Backtracking- While you are moving back, you restore the values of the maze as it was.
    //When you come out of the recursion
    //i.e, when the function is returned, remark the cell as true (Revert the changes)
    private static void backtrackALlPaths(String p,boolean[][] arr, int r, int c) {
        //Now we are doing 0 to end
        if(r==arr.length-1 && c==arr[0].length-1){
            System.out.print(p+" ");
            return;
        }
        if(!arr[r][c]){
            return;
        }
        //I am considering this as a block in my path. Marking the visited.
        arr[r][c]=false;
        if(r<arr.length-1){
            backtrackALlPaths(p+"D",arr,r+1,c);
        }
        if(c<arr[0].length-1){
            backtrackALlPaths(p+"R",arr,r,c+1);
        }
        //For Up
        if(r>0){
            backtrackALlPaths(p+"U",arr,r-1,c);
        }
        //For Left
        if(c>0){
            backtrackALlPaths(p+"L",arr,r,c-1);
        }
        //This is where my function will be over
        //Before it gets removed from stack, also remove the changes made by the function
        arr[r][c]=true;
    }
}
