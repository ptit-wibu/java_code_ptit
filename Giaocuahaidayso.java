/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.codeptit;
import java.util.*;

public class Giaocuahaidayso {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int m,n;
        m = sc.nextInt();
        n = sc.nextInt();
        TreeSet<Integer> a = new TreeSet<Integer>();
        TreeSet<Integer> b = new TreeSet<Integer>();
        for(int i = 0; i<m; i++)
        {
            int tmp = sc.nextInt();
            a.add(tmp);
        }
        for(int i = 0; i<n; i++)
        {
            int tmp = sc.nextInt();
            b.add(tmp);
        }
        // To find union
        /*Set<Integer> union = new HashSet<Integer>(a);
        union.addAll(b);
        System.out.print("Union of the two Set");
        System.out.println(union);*/

        // To find intersection
        TreeSet<Integer> intersection = new TreeSet<Integer>(a);
        intersection.retainAll(b);
        for(int i:intersection)
        {
            System.out.print(i + " ");
        }

       /* // To find the symmetric difference
        Set<Integer> difference = new HashSet<Integer>(a);
        difference.removeAll(b);
        System.out.print("Difference of the two Set");
        System.out.println(difference);*/
    }
}
