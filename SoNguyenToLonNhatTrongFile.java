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
public class SoNguyenToLonNhatTrongFile {
    public static int []nto = new int [1000005];
    public static void sang()
    {
        Arrays.fill(nto, 0);
        nto[0] = nto[1] = 1;
        for(int i = 2; i<=Math.sqrt(1000000); i++)
        {
            for(int j = i*i; j<=1000000; j+=i)
            {
                nto[j] = 1;
            }
        }
    }
    public static int []cnt = new int [1000005];
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        sang();
        ObjectInputStream sc = new ObjectInputStream(new FileInputStream("Data.in"));
        ArrayList<Integer> list = (ArrayList<Integer>) sc.readObject();

        Arrays.fill(cnt, 0);
        for(Integer res:list)
        {
            if(nto[res] == 0) cnt[res]++;
        }
        int cp = 0;
        for(int i = 1000000; i>=2; i--)
        {
            if(cp == 10) break;
            if(cnt[i] != 0) 
            {
                System.out.println(i + " " + cnt[i]);
                cp++;
            }
        }
    }
}
