package Practice;

import java.util.ArrayList;

public class KidCandie {
        public ArrayList<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

            //Declaring of ArrayList
            ArrayList<Boolean> al = new ArrayList<>();

            // if candy + extraCandies > maximum true will be added to list else false
            for (int num: candies) {
                al.add(num + extraCandies >= maxOfArray(candies));
            }

            return al;
        }

        //Method to find Max of Array
        int maxOfArray(int candies[]) {
            int max = Integer.MIN_VALUE;
            for (int num : candies) {
                max = Math.max(num,max);
            }
            return max;
        }

    }

