/*Abstraction*/

import java.util.*;
import java.lang.*;
import java.io.*;


abstract class Student{  
  abstract void run();  
}  
class Coder extends Student{  
void run()
{
    System.out.println("programmer");
    
}  
public static void main(String args[]){  
 Student obj = new Coder();  
 obj.run();  
}  
}  