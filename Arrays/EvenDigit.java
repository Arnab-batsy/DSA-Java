package Practice.more;

public class EvenDigit {
        public int findNumbers(int[] nums) {
            int count=0;
            for(int i: nums){
                int l= (String.valueOf(i)).length();
                if(l%2==0)
                    count++;
            }
            return count;
        }
    }
