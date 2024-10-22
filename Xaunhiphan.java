/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.codeptit;
import java.util.*;

/**
 *
 * @author Adminbk
 */
public class Xaunhiphan {
    static long a[] = new long [94];
    public static void fibo()
    {
        a[0] = 0;
        a[1] = 1;
        a[2] = 1;
        for(int i = 3; i<93; i++)
        {
            a[i] = a[i-1] + a[i-2];
        }
    }
    public static void Try(long n, long k)
    {
        if(n == 1) System.out.println("0");
        else if(n == 2) System.out.println("1");
        else if(k <= a[(int)n-2]) Try(n-2, k);
        else Try(n-1, k-a[(int)n-2]);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        fibo();
        while(t-- >0)
        {
            long n,k;
            n = sc.nextLong();
            k = sc.nextLong();
            Try(n,k);
        }
    }
}
