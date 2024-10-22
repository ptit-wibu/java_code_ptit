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
public class SoKhacNhauTrongFile1 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        TreeMap<Integer, Integer> mp = new TreeMap<>();
        while(sc.hasNextInt() == true)
        {
            int tmp = sc.nextInt();
            if(mp.containsKey(tmp)) mp.put(tmp, mp.get(tmp) + 1);
            else mp.put(tmp, 1);
        }
        mp.forEach((key, value) -> System.out.println(key + " " + value));
    }
}
