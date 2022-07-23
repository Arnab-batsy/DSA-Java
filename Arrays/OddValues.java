package Practice;

public class OddValues {
        public int oddCells(int m, int n, int[][] indices) {
            int[][] mat= new int[m][n];
            int count=0;
            for(int[] r: mat){
                for(int i=0;i<n;i++){
                    r[i]=0;
                }
            }
            for (int i = 0; i < indices.length; i++) {

                // Increment value by 1 in a row
                for (int j = 0; j < n; j++) {
                    mat[indices[i][0]][j] += 1;
                }

                // Increment value by 1 in a col
                for (int j2 = 0; j2 < m; j2++) {
                    mat[j2][indices[i][1]] += 1; // matrix[]
                }

            }

            for (int i = 0; i < mat.length; i++) {
                for (int j = 0; j < mat[i].length; j++) {
                    if (mat[i][j] % 2 != 0) {
                        count++;
                    }
                }
            }
            return count;
        }
    }