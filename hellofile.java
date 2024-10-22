
package com.mycompany.codeptit;
import java.util.Scanner;
import java.io.*;
public class hellofile {
    public static void main(String[] args) throws IOException
    {
        Scanner sc = new Scanner(new File("Hello.txt"));
        while(sc.hasNext())
        {
            System.out.println(sc.nextLine());
        }
                
    }
}