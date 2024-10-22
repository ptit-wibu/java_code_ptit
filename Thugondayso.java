/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.codeptit;
import java.util.*;
import java.text.*;
import java.lang.*;
import java.math.*;

/**
 *
 * @author adminbk
 */
public class Thugondayso {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i<n; i++)
        {
            int tmp = sc.nextInt();
            if(st.empty()) st.push(tmp);
            else
            {
                if((st.getLast() + tmp ) % 2 == 0) st.pop();
                else st.push(tmp);
            }
        }
        System.out.println(st.size());
    }
}
