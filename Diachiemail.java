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
public class Diachiemail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        HashMap<String,Integer> mp = new HashMap<>();
        while(t-->0)
        {
            String s = sc.nextLine();
            s = s.replaceAll("\\s+", " ");
            s = s.trim();
            s = s.toLowerCase();
            String []res = s.split("\\s");
            int n = res.length;
            String ans = res[n-1];
            for(int i = 0; i<n-1;i++)
            {
                ans = ans + res[i].charAt(0);
            }
            if(mp.containsKey(ans))
            {
                mp.put(ans, mp.get(ans) + 1);
            }
            else mp.put(ans,1);
            if(mp.get(ans) == 1)
            {
                System.out.print(ans + "@ptit.edu.vn");
            }
            else
            {
                System.out.print(ans + mp.get(ans) + "@ptit.edu.vn");
            }
            System.out.println();
        }
    }
}
