
package com.mycompany.codeptit;
import java.util.*;
import java.io.*;
import java.lang.*;


public class SoKhacNhauTrongFile2 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        DataInputStream sc = new DataInputStream(new FileInputStream("DATA.IN"));
        TreeMap<Integer, Integer> mp = new TreeMap<>();
        for(int i = 1; i<=100000;i++)
        {
            int tmp = sc.readInt();
            if(!mp.containsKey(tmp)) mp.put(tmp, 1);
            else mp.put(tmp, mp.get(tmp)+1);
        }
        for(Map.Entry<Integer, Integer> res: mp.entrySet())
        {
            System.out.println(res.getKey() + " " + res.getValue());
        }
    }
}
