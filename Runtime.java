/* Runtime Polymorphism */
/

import java.util.*;
import java.lang.*;
import java.io.*;


class Vehicle{  
  void run()
  {
      System.out.println("running");}  
 }  
class Splendor extends Vehicle{  
  void run()
  {
      System.out.println("running safely");
      
  }  
  
  public static void main(String args[]){  
    Vehicle b = new Splendor();
    b.run();  
  }  
}  