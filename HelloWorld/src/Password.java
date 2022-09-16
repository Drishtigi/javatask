import java.io.*;
import java.util.*;
public class Password {
    public String printMessage(){

      Scanner in= new Scanner(System.in);
      String input = in.nextLine();
     // int inputLen = input.length();

        switch(input){
            case 1:
                System.out.println("Password should not contain any space");
                break;
            case 2:
                System.out.println("Password length should be 8 to 15 characters");
                break;
            case 3:
                System.out.println("Password should contain atleast one digit(0-9)");
                break;
            case 4:
                System.out.println("Password should contain upper case and lower case character");
            default:
                System.out.println("Invalid password");



      }




    }
}
