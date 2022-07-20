package CondiLoop;
//Take integer inputs till the user enters 0 and print the sum of all numbers
import java.util.Scanner;
public class SumNum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= 0;
        int a = 0;
        while((n=sc.nextInt()) !=0)
        {
            a= a+n;
        }
        System.out.println(a);
    }
}
