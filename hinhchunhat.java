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
public class hinhchunhat {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();
        if(a <= 0 || b<=0) System.out.print(0);
        else
        {
             System.out.print((a+b)*2 + " " + (a*b));
        }
    }
}
