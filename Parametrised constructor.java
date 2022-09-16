/* Parametrised constructor */

import java.util.*;
import java.lang.*;
import java.io.*;


class Student{  
    int age;  
    String name;  
      
    Student(int i,String n){  
    age = i;  
    name = n;  
    }  
      
    void display()
    {
        System.out.println(age+" "+name);
        
    }  
   
    public static void main(String args[]){  
     
    Student s1 = new Student(23,"Drishti");  
    Student s2 = new Student(26,"Srishti");  
     
    s1.display();  
    s2.display();  
   }  
}

