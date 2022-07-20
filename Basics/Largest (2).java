package CondiLoop;
//Take integer inputs till the user enters 0 and print the largest number from all.
import java.util.Scanner;
public class Largest {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= 0;
        int small= 0;
        int large= 0;
        int counter= 0;
        while((n=sc.nextInt()) !=0)
        {
            if (counter == 0) {
                small = large = n;
            }
            counter++;
            if(n>=large){
                large=n;
        }
            if(n<=small){
                small=n;
            }
    }
        System.out.println("The largest number is :"+ large);
        System.out.println("The smallest number is :"+ small);
}}
