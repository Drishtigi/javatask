import java.io.*;
import java.util.*;
public class Passcode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String passcode = sc.nextLine();
        switch (passcode) {
            case 1:
                System.out.println("Password length should be between 8 to 15 characters");
                break;

            case 2:
                System.out.println("password should not contain any space");
                break;

            case 3:
                System.out.println("password should contain at least one digit(0-9)");
                break;

            default:
                System.out.println("invalid password");


        }
    }
}
