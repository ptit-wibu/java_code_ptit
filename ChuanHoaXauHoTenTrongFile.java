/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.codeptit;
import java.util.*;
import java.io.*;
/**
 *
 * @author adminbk
 */
public class ChuanHoaXauHoTenTrongFile {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        String s;
        while(sc.hasNextLine())
        {
            s = sc.nextLine();
            s = s.toLowerCase().replaceAll("\\s+", " ").trim();
            if(s.compareTo("end") == 0) break;
            String []res = s.split("\\s");
            StringBuilder ans = new StringBuilder();
            int n = res.length;
            for(String token:res)
            {
                char []tmp = token.toCharArray();
               // System.out.println(tmp);
                //System.out.println(tmp.length);
                tmp[0] = Character.toUpperCase(tmp[0]);
                ans.append(new String(tmp) + " ");
            }
            ans.toString().trim();
            System.out.println(ans);
        }
    }
}
