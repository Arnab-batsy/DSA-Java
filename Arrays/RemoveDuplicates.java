package Practice.Sheet;

public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        if(nums.length==0) return 0;
        int index=1;
        //Index where unique characters will be inserted at
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]<nums[i+1]){
                nums[index]=nums[i+1]; //placing the unique
                index++; //Increases only when array in increasing
            }
        }
        return index;
    }
    }
