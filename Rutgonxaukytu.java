/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.codeptit;
import java.util.*;

/**
 *
 * @author adminbk
 */
public class Rutgonxaukytu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char []c = s.toCharArray();
        int n = c.length;
        Stack<Character> st = new Stack<>();
        for(int i = 0; i<n; i++)
        {
            if(st.empty()) st.push(c[i]);
            else
            {
                if(st.lastElement().equals(c[i])) st.pop();
                else st.push(c[i]);
            }
        }
        String ans = "";
        if(st.empty())
        {
            System.out.println("Empty String");
        }
        else
        {
             while(!st.empty())
        {
           ans += st.pop();
        }
        StringBuilder res = new StringBuilder(ans);
        res.reverse();
        System.out.println(res);
        }
       
    }
}
