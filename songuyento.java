/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.codeptit;
import java.util.Scanner;
/**
 *
 * @author Adminbk
 */
public class songuyento {
    public static boolean snt(long n)
    {
        if(n<2) return false;
        if(n==2) return true;
        if(n%2==0) return false;
        for(int i = 3; i<=Math.sqrt(n); i+=2)
        {
            if(n%i==0) return false;
        }
        return true;
    } 
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- != 0)
        {
            long n = sc.nextLong();
            if(snt(n) == true) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
