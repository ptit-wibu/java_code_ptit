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
public class Chuso4vachuso7 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char c[] = s.toCharArray();
        int n = c.length;
        int cnt4 = 0, cnt7 = 0;
        for(int i = 0; i<n; i++)
        {
            if(c[i] == '4')cnt4++;
            else if(c[i] == '7') cnt7++;
        } 
        if((cnt4 + cnt7 == 7) || (cnt4 + cnt7 == 4)) System.out.println("YES");
        else System.out.println("NO");
    }
}
