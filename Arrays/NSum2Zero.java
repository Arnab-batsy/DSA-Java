package Practice.Sheet;

public class NSum2Zero {
    public int[] sumZero(int n) {
        int[] arr= new int[n];
        if(n%2==0){
            int i= -(n/2);
            int j=0;
            while(j<n){
                arr[j]=i;
                if(i==-1){
                    i+=2;
                }
                else{
                    i++;
                }
                j++;
            }
            return arr;
        }
        else{
            int i= -(n/2);
            int j=0;
            while(j<n){
                arr[j]=i;
                i++;
                j++;
            }
            return arr;
        }
    }
}
