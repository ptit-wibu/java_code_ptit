/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.codeptit;
import java.util.Scanner;
import java.text.DecimalFormat;
/**
 *
 * @author Adminbk
 */
public class chiatamgiac {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- != 0)
        {
           double n,h;
           n = sc.nextDouble();
           h = sc.nextDouble();
           DecimalFormat df = new DecimalFormat("0.000000");
           for(int i = 1; i<n;i++)
            {
                double res = (double)Math.sqrt(i/n)*h;
                System.out.print(df.format(res) + " ");
            }
           System.out.println();
        }
    }
}
