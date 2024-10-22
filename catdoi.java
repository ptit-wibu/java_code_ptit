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
public class catdoi {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- != 0)
        {
            String s = sc.next();
            char c[] = s.toCharArray();
            int n = c.length;
            boolean check = false;
            int cnt = 0;
            for(int i = 0; i<n; i++)
            {
                if(c[i] == '0' || c[i] == '8' || c[i] == '9')
                {
                    if(cnt > 0)
                    {
                        check = true;
                        System.out.print("0");
                    }
                }
                else if(c[i] == '1')
                {
                    check = true;
                    cnt++;
                    System.out.print(c[i]);
                }
                else break;
            }
            if(check == false) System.out.print("INVALID");
            System.out.println();
        }
    }
}
