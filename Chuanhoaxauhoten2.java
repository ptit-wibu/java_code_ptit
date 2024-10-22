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
public class Chuanhoaxauhoten2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0)
        {
            String s = sc.nextLine();
            s = s.replaceAll("\\s+", " ");
            s = s.trim();
            s = s.toLowerCase();
            String []res = s.split("\\s");
            int n = res.length;
            StringBuilder ans = new StringBuilder();
            for(int i = 1; i<n; i++)
            {
                char []tmp = res[i].toCharArray();
                tmp[0] = Character.toUpperCase(tmp[0]);
                ans.append(new String(tmp) + " ");
            }
            ans.deleteCharAt(ans.length() - 1);
            ans.toString();
            ans.append(", ");
            res[0] = res[0].toUpperCase();
            ans.append(res[0]);
            System.out.println(ans);
        }
    }
}
