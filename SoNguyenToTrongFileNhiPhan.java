/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.codeptit;
import java.util.*;
import java.io.*;
import java.io.IOException;
/**
 *
 * @author adminbk
 */
public class SoNguyenToTrongFileNhiPhan {
    public static boolean ngto(int n)
    {
        if(n<2) return false;
        if(n==2) return true;
        if(n%2==0) return false;
        for(int i = 3; i<= Math.sqrt(n); i+=2)
        {
            if(n%i==0) return false;
        }
        return true;
    }

    public static void main(String[] args)throws IOException, ClassNotFoundException {
        ObjectInputStream sc = new ObjectInputStream(new FileInputStream ("SONGUYEN.in"));
        ArrayList<Integer> ds = (ArrayList<Integer>) sc.readObject();
        int a[] = new int [10001];
        for(Integer x:ds)
        {
            a[x]++;
        }
        for(int i = 2; i<=10000;i++)
        {
            if(a[i] > 0 && ngto(i))
            {
                System.out.println(i + " " + a[i]);
            }
        }
    }
}
