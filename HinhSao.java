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
public class HinhSao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []adj = new int [n+1];
        for(int i = 0; i<n-1;i++)
        {
            int x = sc.nextInt(), y = sc.nextInt();
            adj[x]++;
            adj[y]++;
        }
        int cnt = 0;
        for(int i = 1; i<=n; i++)
        {
            if(adj[i] > 1) cnt++;
        }
        if(cnt>1) System.out.println("No");
        else System.out.println("Yes");
    }
}
