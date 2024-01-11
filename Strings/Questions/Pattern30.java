package com.arnab.Questions;

public class Pattern30 {
    public static void main(String[] args) {
        int sp=4;
        int ct=0;
        for(int i=0;i<5;i++){
            for(int j=0;j<sp;j++){
                System.out.print("  ");
            }
            int count= (ct/2)+1;
            int ct2=2;
            for(int j=0;j<=ct;j++){
                if(j<=(ct/2)) {
                    System.out.print(count+" ");
                }
                else{
                    System.out.print(ct2+" ");
                    ct2++;
                }
                count--;
            }
            System.out.println();
            ct+=2;
            sp--;
        }
        simplified(5);
    }
    static void simplified(int n){
        for(int i=0;i<n;i++){
            for(int sp=0;sp<n-i;sp++){ //for spaces
                System.out.print("  ");
            }
            for(int j=i+1;j>0;j--){
                System.out.print(j+" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print(k+1+" ");
            }
            System.out.println();
        }
    }
}

//                        1
//                      2 1 2
//                    3 2 1 2 3
//                  4 3 2 1 2 3 4
//                5 4 3 2 1 2 3 4 5
