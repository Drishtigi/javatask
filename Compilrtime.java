
/*compile time polymorphism*/

import java.util.*;
import java.lang.*;
import java.io.*;
class Student{
    String name;
    int age;
    public void displayInfo(String name){
        System.out.println(name);
    }
    public void displayInfo(int age){
        System.out.println(age);
    }
    

public void displayInfo(int age,String name){
        System.out.println(name);
        System.out.println(age);
        
}
public static void main (String[]args){
    Student s1=new Student();
    s1.name="Drishti";
    s1.age=23;
    s1.displayInfo(s1.name);
    s1.displayInfo(s1.age);
    s1.displayInfo(s1.name+" "+s1.age);
}
}


