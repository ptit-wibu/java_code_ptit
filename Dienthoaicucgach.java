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
public class Dienthoaicucgach {
    static int [] a = {2,2,2,3,3,3,4,4,4,5,5,5,6,6,6,7,7,7,7,8,8,8,9,9,9,9};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            String s = sc.next();
            s =s.toLowerCase();
            String res = "";
            for(char x:s.toCharArray())
            {
                res = res + Integer.toString(a[x-'a']);
            }
            int check = 1;
            char []c = res.toCharArray();
            int n = c.length;
            for(int i = 0; i<n/2; i++)
            {
                if(c[i] != c[n-i-1]) 
                {
                    check = 0;
                    break;
                }
            }
           /* StringBuilder tmp = new StringBuilder(s);
            StringBuilder rev = new StringBuilder(tmp);
            rev.reverse();
            System.out.println(tmp);
            System.out.println(rev);*/
            if(check == 1) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
/*

package com.mycompany.codeptit;
import java.util.*;
public class Dienthoaicucgach {
    static int [] a = {2,2,2,3,3,3,4,4,4,5,5,5,6,6,6,7,7,7,7,8,8,8,9,9,9,9};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            String s = sc.next();
            s =s.toLowerCase();
            String res = "";
            for(char x:s.toCharArray())
            {
                res = res + Integer.toString(a[x - 'a']);
            }
            String rev = new StringBuffer(res).reverse().toString();
            if(rev.equals(res)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
*/