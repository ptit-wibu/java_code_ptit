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
public class SoKhacNhauTrongFile3 {
     public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream sc = new ObjectInputStream(new FileInputStream("DATA.in"));
        TreeMap<Integer, Integer> mp = new TreeMap<>();
        ArrayList<Integer> list = (ArrayList<Integer>) sc.readObject();
        for(int x:list)
        {
            if(mp.containsKey(x)) mp.put(x, mp.get(x)+1);
            else mp.put(x, 1);
        }
        for(Map.Entry<Integer, Integer> res: mp.entrySet())
        {
            System.out.println(res.getKey() + " " + res.getValue());
        }
    }
}
