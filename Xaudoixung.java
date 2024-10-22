/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.codeptit;
import java.util.*;

/**
 *
 * @author adminbk
 */
public class Xaudoixung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            String s = sc.next();
            int cnt = 0;
            char [] res = s.toCharArray();
            int n = res.length;
            for(int i = 0; i<s.length()/2;i++)
            {
                if(res[i] != res[n- i-1]) cnt++;
            }
            if(cnt==1 || cnt==0 && n%2==1) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
