/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.codeptit;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;

/**
 *
 * @author adminbk
 */
public class PhepToanCoBan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<BigInteger> list = new ArrayList<>();
        BigInteger c = new BigInteger("0");
        int t = sc.nextInt();
        while(t-->0)
        {
            BigInteger tmp = sc.nextBigInteger();
            c = c.add(tmp);
            list.add(tmp);
        }
        Collections.sort(list);
        BigInteger a = list.get(0);
        BigInteger b = list.get(list.size()-1);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
