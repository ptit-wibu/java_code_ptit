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
public class LietKeTuKhacNhau {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("VANBAN.in"));
        TreeSet<String> st = new TreeSet<>();
        while(sc.hasNext())
        {
            String res = sc.next();
            res = res.toLowerCase();
            st.add(res);
        }
        for(String res:st)
        {
            System.out.println(res);
        }
    }
}
