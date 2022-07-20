package CondiLoop;
import java.util.Scanner;
import java.lang.Math;
public class fuck {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double n= sc.nextDouble();
        double p= sc.nextDouble();
        double pow=1;
        if(p>0) {
            for (int i = 0; i < p; i++) {
                pow = pow * n;
            }
        }
        else if(p==0){
            pow=1;
        }
        else{
            p= Math.abs(p);
            for (int i = 0; i < p; i++) {
                pow = pow * n;
            }
            pow=1.0/pow;
        }
        System.out.println(pow);
    }
}
