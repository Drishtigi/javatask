/* Copy constructor */

import java.util.*;
import java.lang.*;
import java.io.*;


    class Student{  
    int id;  
    String name;  
      
    Student(int i,String n){  
    id = i;  
    name = n;  
    }  
    
    Student(Student s){  
    id = s.id;  
    name =s.name;  
    }  
    void display(){
        System.out.println(id+" "+name);
        
    }  
   
    public static void main(String args[]){  
    Student s1 = new Student(12,"aryan");  
    Student s2 = new Student(s1);  
    s1.display();  
    s2.display();  
   }  
} 


    