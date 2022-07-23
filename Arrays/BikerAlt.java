package Practice;

public class BikerAlt {
        public int largestAltitude(int[] gain) {
            int n= gain.length;
            int[] ans= new int[n+1];
            ans[0]= 0;
            for(int i=0;i<n;i++){
                ans[i+1]= ans[i]+gain[i];
            }
            int m=Integer.MIN_VALUE;
            for(int j: ans){
                m= Math.max(j,m);
            }
            return m;
        }
}
