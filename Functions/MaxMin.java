package com.arnab;

import java.util.*;

public class MaxMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("The maximum number is " + max(a, b, c));
        System.out.println("The minimum number is " + min(a, b, c));
    }
    static int max(int a, int b, int c) {
        int M = a;
        if (b > M) {
            M = b;
        } else if (c > M) {
            M = c;
        }
        return M;
    }
    static int min(int a, int b, int c) {
        int M = a;
        if (b < M) {
            M = b;
        } else if (c < M) {
            M = c;
        }
        return M;
    }
}
