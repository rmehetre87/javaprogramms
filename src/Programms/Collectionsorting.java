package Programms;

//Java program to demonstrate working of Collections.sort() 
import java.util.*; 

public class Collectionsorting 
{ 
 public static void main(String[] args) 
 { 
     // Create a list of strings 
     ArrayList<String> al = new ArrayList<String>(); 
     al.add("Y"); 
     al.add("y"); 
     al.add("Z"); 
     al.add("t"); 
     al.add("d"); 

     /* Collections.sort method is sorting the 
     elements of ArrayList in ascending order. */
     Collections.sort(al); 

     // Let us print the sorted list 
     System.out.println("List after the use of" + 
                        " Collection.sort() :\n" + al); 
 } 
} 