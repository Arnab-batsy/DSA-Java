package Practice;

public class GoodPairs {
        public int numIdenticalPairs(int[] nums) {
            int l= nums.length;
            int count=0;
            for( int i=0;i<l;i++){
                for(int j=0;j<l && j!=i;j++){
                    if(nums[i]==nums[j])
                        count++;
                }
            }
            return count;
        }
    }
