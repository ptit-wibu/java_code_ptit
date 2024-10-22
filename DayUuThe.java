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
public class DayUuThe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0)
        {
            String s = sc.nextLine();
            int chan =0, le = 0;
            String [] res = s.trim().split("\\s+");
            for(String tmp: res)
            {
                if(Integer.parseInt(tmp) % 2 == 0) chan++;
                else le++;
            }
            if((res.length % 2 == 0 && chan > le) || (res.length % 2 == 1 && le > chan)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
