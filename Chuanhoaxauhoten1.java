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
public class Chuanhoaxauhoten1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0)
        {
            String s = sc.nextLine();
            //System.out.println(s);
            s = s.toLowerCase();
            s = s.replaceAll("\\s+", " ");
            s = s.trim();
            String []res = s.split("\\s");
            StringBuilder build = new StringBuilder();
            for(String token:res)
            {
                char []word = token.toCharArray();
                word[0] = Character.toUpperCase(word[0]);
                build.append(new String(word) + " ");
            }
            build.toString().trim();
            System.out.println(build);
        }
    }
}
