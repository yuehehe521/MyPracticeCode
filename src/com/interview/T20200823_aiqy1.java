package com.interview;

import java.util.Scanner;

/**
 * 正整数n的阶乘(n!)中的末尾有多少个0?
 *
 * 例如：n = 5, n! = 120.末尾有1个0
 *
 * 实现：int CountZero(int n);
 */
public class T20200823_aiqy1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = ContZero(n);
        System.out.println(res);

    }

    private static int ContZero(int n) {
        int count = 0;
        for (int i = 1; i <=n ; i++) {
            int j = i;
            while(j % 5 == 0){
                count++;
                j = j/5;
            }
        }
        return count;
    }


}