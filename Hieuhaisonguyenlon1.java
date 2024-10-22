/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.codeptit;
import java.math.BigInteger;
import java.util.*;
/**
 *
 * @author adminbk
 */
public class Hieuhaisonguyenlon1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            BigInteger a = sc.nextBigInteger();
            BigInteger b = sc.nextBigInteger();
            int length = Math.max(a.toString().length(), b.toString().length());
            String ans = a.subtract(b).abs().toString();
            while(ans.length() < length) ans = "0" + ans;
            System.out.println(ans);
        }
    }
}
