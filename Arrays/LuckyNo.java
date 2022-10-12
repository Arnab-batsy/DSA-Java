package Practice.Sheet;

import java.util.ArrayList;

public class LuckyNo {
    public ArrayList<Integer> luckyNumbers (int[][] matrix) {
        ArrayList<Integer> arr= new ArrayList<>();
        for(int i =0; i<matrix.length; i++){
            int big= Integer.MIN_VALUE;
            int temp=0;
            int small=Integer.MAX_VALUE;
            for(int j=0; j<matrix[i].length; j++){
                if(small> matrix[i][j]){
                    small=matrix[i][j];
                    temp=j;
                }
            }
            for(int k=0; k<matrix.length; k++){
                if(big<matrix[k][temp]){
                    big=matrix[k][temp];
                }
            }
            if(small==big)
                arr.add(small);
        }
        return arr;
    }
}
