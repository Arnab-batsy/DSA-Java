package Practice.Sheet;

public class PlusOne {
    public int[] plusOne(int[] arr) {
        int n = arr.length;
        for(int i = n-1; i>=0 ; i--){
            if(arr[i] < 9){
                arr[i]++;
                return arr;
            }
            arr[i] = 0;
        }
        int nums[] = new int[n+1];
        nums[0] = 1;
        return nums;
    }
}
