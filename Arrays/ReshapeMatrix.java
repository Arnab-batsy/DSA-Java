package Practice.Sheet;

import java.util.ArrayList;

public class ReshapeMatrix {
        public int[][] matrixReshape(int[][] mat, int r, int c)
        {
            if((r*c)==((mat.length)*(mat[0].length))){
                ArrayList <Integer> arr= new ArrayList<>();
                int[][] res= new int[r][c];
                for(int i=0;i<mat.length;i++){
                    for(int j=0;j<mat[i].length;j++){
                        arr.add(mat[i][j]);
                    }
                }
                int count=0;
                for(int i=0;i<r;i++){
                    for(int j=0;j<c;j++){
                        res[i][j]=arr.get(count);
                        count++;
                    }
                }
                return res;
            }
            else{
                return mat;
            }
        }
}
