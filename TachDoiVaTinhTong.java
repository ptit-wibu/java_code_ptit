/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.codeptit;
import java.util.*;
import java.io.*;
import java.math.BigInteger;
/**
 *
 * @author adminbk
 */
public class TachDoiVaTinhTong {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        BigInteger res =  sc.nextBigInteger();
        while(res.toString().length() !=1 )
        {
            int n = res.toString().length();
            String a = res.toString().substring(0, n/2);
            String b = res.toString().substring(n/2);
            BigInteger aa = new BigInteger(a);
            BigInteger bb = new BigInteger(b);
            res = aa.add(bb);
            System.out.println(res);
        }
    }
}
