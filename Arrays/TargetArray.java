package Practice;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class TargetArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        System.out.println("Enter First Array");
        int[] nums = new int[l];
        for (int i = 0; i < l; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println("Enter Second Array");
        int[] index = new int[l];
        for (int i = 0; i < l; i++) {
            index[i] = sc.nextInt();
        }
        ArrayList<Integer> list = new ArrayList<>();
            for(int i = 0 ; i < nums.length ; i++){
                list.add(index[i],nums[i]);
            }
            int[] target = new int[nums.length];
            for(int i = 0 ; i < nums.length ; i++){
                target[i] = list.get(i);
            }
        System.out.println(Arrays.toString(target));
    }
}
//        public static int[] createTargetArray(int[] nums, int[] index) {
//            ArrayList<Integer> list = new ArrayList<>();
//            for(int i = 0 ; i < nums.length ; i++){
//                list.add(index[i],nums[i]);
//            }
//            int[] target = new int[nums.length];
//            for(int i = 0 ; i < nums.length ; i++){
//                target[i] = list.get(i);
//            }
//            return target;
//        }
//    }
