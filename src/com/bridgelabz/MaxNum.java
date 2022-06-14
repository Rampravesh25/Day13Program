package com.bridgelabz;

import java.util.Scanner;

public class MaxNum {
    public static <T extends Comparable<T>> T genericMax(T x, T y, T z) {
        T max = x;
        if(y.compareTo(max) > 0) {
            max = y;
        }
        if(z.compareTo(max) > 0) {
            max = z;
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 Integer No.: ");
        System.out.println("Greatest Integer No.:"+genericMax(sc.nextInt(),sc.nextInt(),sc.nextInt()));
        System.out.println("Enter 3 Float No.: ");
        System.out.println("Greatest Float No.:"+genericMax(sc.nextFloat(),sc.nextFloat(),sc.nextFloat()));
        System.out.println("Enter 3 String : ");
        System.out.println("Greatest String.:"+genericMax(sc.next(),sc.next(),sc.next()));
    }

}
