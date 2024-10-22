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
public class giaiphuongtrinhbacnhat {
    public static void solve()
    {
        Scanner sc = new Scanner(System.in);
        int a,b;
        a = sc.nextInt();
        b = sc.nextInt();
        if(a == 0)
        {
            if(b == 0)
            {
                System.out.println("VSN"); 
                return;
            }
            else
            {
                System.out.println("VN");
                return;
            }
        }
        else
        {
            double ans =(double) -b/a;
            DecimalFormat df = new DecimalFormat("0.00");
            System.out.println(df.format(ans));
            return;
        }
    }
    public static void main(String[] args)
    {
        solve();
    }
}
