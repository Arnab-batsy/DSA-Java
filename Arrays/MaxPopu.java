package Practice.Aug19;

public class MaxPopu
{
    public int maximumPopulation(int[][] logs) {
        int years = 2050 - 1950 + 1;
        int[] count = new int[years];
        int n = logs.length;

        for(int i = 0; i < n; i++){
            count[logs[i][0] - 1950]++;
            count[logs[i][1] - 1950]--;
        }

        //calculate running sum
        for(int i = 1; i < years; i++) {
            count[i] += count[i-1];
        }
        //System.out.println(Arrays.toString(count));

        int maxYear = 1950, maxValue = 0;
        for(int i = 0; i < years; i++){
            if(count[i] > maxValue){
                maxValue = count[i];
                maxYear = i + 1950;
            }
        }
        return maxYear;
    }
}
