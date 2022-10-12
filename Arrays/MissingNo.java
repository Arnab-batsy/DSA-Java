package Practice.Sheet;

public class MissingNo {
        public int missingNumber(int[] nums) {
            int range= nums.length;
            int totalSum= ((range*(range+1))/2);
            int runningSum=0;
            for(int i=0;i<range;i++){
                runningSum= runningSum+ nums[i];
            }
            return (totalSum-runningSum);
        }
}
