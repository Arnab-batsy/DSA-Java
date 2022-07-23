package Practice;

public class FlipImage {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int[] row : image){
            int l= row.length;
            int c=0;
            for(int i=0;i<((l+1)/2);i++){
                c= row[i];
                row[i]=row[(l-i-1)];
                row[l-i-1]=c;
            }
        }
        for(int[] row : image){
            int l= row.length;
            int c=0;
            for(int i=0;i<l;i++){
                if(row[i]==0){
                    row[i]=1;
                }
                else if(row[i]==1){
                    row[i]=0;
                }
            }
        }
        return image;
    }
}