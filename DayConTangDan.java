/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.codeptit;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
/**
 *
 * @author adminbk
 */
public class DayConTangDan {
    public static int []a = new int [25];
    public static int []dayso = new int [25];
    public static ArrayList<String> list = new ArrayList<>();
    public static int n;
    public static void Try(int i)
    {
        for(int j = 0; j<=1; j++)
        {
            a[i] = j;
            if(i == n)
            {
                int cnt = 0;
                String s = "";
                ArrayList<Integer> tmp = new ArrayList<>();
                for(int k = 1; k<=n; k++)
                {
                    if(a[k] == 1) 
                    {
                        cnt++;
                        tmp.add(dayso[k]);
                        s += (String.valueOf(dayso[k]) + " ");
                    }
                }
                int check = 1;
                for(int k = 0; k <tmp.size()-1;k++)
                {
                    if(tmp.get(k) > tmp.get(k+1)) 
                    {
                        check =0;
                        break;
                    }
                }
                if(cnt <2 || check == 0){}
                else
                {
                     s.trim();
                    list.add(s);
                } 
            }
            else Try(i+1);
        }
    }
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DAYSO.in"));
        n = sc.nextInt();
        for(int i = 1; i<=n;i++) dayso[i] = sc.nextInt();
        Try(1);
        Collections.sort(list);
        for(String s : list)
        {
            System.out.println(s);
        }
    }
}
