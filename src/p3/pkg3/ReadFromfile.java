/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw3p2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
/**
 *
 * @author MohammedHams
 */
public class ReadFromfile {
    public static void main(String[] args) throws FileNotFoundException {
            HashMap<String, Integer> map = new HashMap<>(50, 10);
         File input = new File("C:\\Users\\mohammed Hams\\Documents\\NetBeansProjects\\JavaPR3_Homeworks\\src\\JavaPR3_HW3P1\\1.txt");
            Scanner read = new Scanner(new FileInputStream(input));
            ArrayList<String> list = new ArrayList<>();

            while (read.hasNext()) {
                list.add(read.next());
            }
            list.forEach((String w) -> {
                Integer i = map.get(w);
                if(i == null){
                    map.put(w, 1);
                }
                else {
                    map.put(w, i+1);
                }
            });
             System.out.println(map.toString());
          HashMap<Character, Integer> map2 = new HashMap<>(50, 10);
          
        String str="";
        while(read.hasNext())
            str=read.next();
   char[] ch=str.toCharArray();
    HashMap<Character,Integer> hm=new HashMap<>();
    for(char ch1:ch)
    {

        if(hm.containsKey(ch1))
        {
            hm.put(ch1,hm.get(ch1)+1);
        }
        else
        {
            hm.put(ch1,1);
        }
    }

    Set s1=hm.entrySet();
    Iterator itr=s1.iterator();

    while(itr.hasNext())
    {
        Map.Entry m1=(Map.Entry)itr.next();
        System.out.println(m1);
    }
    
    }
}
