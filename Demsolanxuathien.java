/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.codeptit;
import java.util.*;
/**
 *
 * @author ADMIN
 */
public class Demsolanxuathien {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for(int t = 1; t <= test ; t++)
        {
            int n  = sc.nextInt();
            HashMap<Integer,Integer> mp = new HashMap<>();
            int [] a = new int [n];
            for(int i = 0; i<n; i++)
            {
                int tmp = sc.nextInt();
                a[i] = tmp;
                if(mp.containsKey(tmp) == false) mp.put(tmp, 1);
                else mp.put(tmp, mp.get(tmp) + 1);
            }
            System.out.println("Test " + t + ":");
            for(int i = 0; i<n; i++)
            {
                if(mp.containsKey(a[i]))
                {
                    System.out.println(a[i] + " xuat hien " + mp.get(a[i]) +" lan");
                    mp.remove(a[i], mp.get(a[i]));
                }
            }
        }
    }
}
