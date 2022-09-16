/* interface  */

import java.util.*;
import java.lang.*;
import java.io.*;
  
  interface bike{
      void run();
  }
  class Motor implements bike{
      public void run(){
          System.out.println("carrying");
      }
  
  public static void main(String args[]){ 
  
      Motor m= new Motor();
      m.run();
  }
  }



