/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.codeptit;
import java.util.*;
import java.io.*;
import java.math.*;
/**
 *
 * @author adminbk
 */
public class DanhDauChuCai {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String s = sc.next();
       TreeSet<Character>  st = new TreeSet<Character>();
       for(char c:s.toCharArray())
       {
           st.add(c);
       }
       System.out.println(st.size());
    }
}
