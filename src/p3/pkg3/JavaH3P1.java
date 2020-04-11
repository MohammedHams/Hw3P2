/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p3.pkg3;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;
public class JavaH3P1 {
 public static void main( String[] args ) {

       LinkedList <Integer> list = new LinkedList <Integer>();
       int n;
       Random r = new Random();
       //run a loop that generates random numbers and add them to the list
       for(int i = 0; i < 25; i++)
       {
           //generate a random number
           n = r.nextInt(101);
           //add the number generated to the list
           list.add(n);
       }
       //display the list
       System.out.println("The numbers in the list are: ");
       printList(list);
       //sort the list
       sortList(list);
       //display the list after sorting
       System.out.println("\n\nThe numbers in the list after sorting are: ");
       printList(list);
       //calculate and print the average
       System.out.println("\n\nThe sum of the numbers is: " + getSum(list));
       System.out.printf("The average is: %.2f", getAverage(list));

   }
public class LinkedListWithRandomNumbers {

  }

   //method that displays the linked list
   public static void printList(LinkedList <Integer> list)
   {
       //create an object to iterator class
       Iterator<Integer> i = list.iterator();
       //display the items in the list using the iterator
       while(i.hasNext())
       {
           System.out.print(i.next() + " ");
       }
   }

   //method that sorts the linked list
   public static void sortList(LinkedList <Integer> list)
   {
       int temp;
       //sort the elements using bubble sort technique
       for(int i = 1; i <= list.size(); i++)
       {
           for (int j = 0; j < list.size()-1; j++)
           {
               if (list.get(j+1) < list.get(j))
               {
                   temp = list.get(j); // swap elements
                   list.set(j, list.get(j + 1));
                   list.set(j + 1, temp);
               }
           }
       }
   }
  
   //method that calculates and returns the sum of elements in the list
   public static int getSum(LinkedList <Integer> list)
   {
       int sum = 0;
       //iterate through the list and calculate the sum
       Iterator<Integer> i = list.iterator();
       while(i.hasNext())
       {
           sum = sum + (i.next());
       }
       return sum;
   }
  
   //method that calculates and returns the average of elements in the list
   public static double getAverage(LinkedList <Integer> list)
   {
       //get the sum
       double sum = getSum(list);
       //calculate and return the average
       double avg = sum /list.size();
       return avg;
   }
}