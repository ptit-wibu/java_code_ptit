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
public class Sochinhphuong {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            int n = sc.nextInt();
            int can =(int) Math.sqrt((double)n);
            if(can * can == n) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
