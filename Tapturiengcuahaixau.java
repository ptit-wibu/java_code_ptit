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
public class Tapturiengcuahaixau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0)
        {
            String a = sc.nextLine();
            String b = sc.nextLine();
            TreeSet<String> aa = new TreeSet<>();
            TreeSet<String> bb = new TreeSet<>();
            String [] tmp = a.split("\\s");
            for(String x:tmp)
            {
                aa.add(x);
            }
            String []tp = b.split("\\s");
            for(String x:tp)
            {
                bb.add(x);
            }
            aa.removeAll(bb);
            for(String x:aa)
            {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}
