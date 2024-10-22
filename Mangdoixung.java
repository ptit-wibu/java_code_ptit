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
public class Mangdoixung {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            int  n = sc.nextInt();
            int []a = new int[n];
            for(int i = 0; i<n; i++)
            {
                a[i] = sc.nextInt();
            }
            int check = 1;
            for(int i = 0 ; i<n; i++)
            {
                if(a[i] != a[n-i-1])
                {
                    check = 0;
                    break;
                }
            }
            if(check == 1) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
