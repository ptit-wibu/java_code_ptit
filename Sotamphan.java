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
public class Sotamphan {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            String s = sc.next();
            char []c = s.toCharArray();
            int n = c.length;
            int check = 1;
            for(int i = 0; i<n; i++)
            {
                if(c[i] != '0' && c[i] != '1' && c[i] != '2')
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
