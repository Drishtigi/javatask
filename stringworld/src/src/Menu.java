
import java.util.*;
public class Menu {
    static void solve(double meal_cost, int tip_percent, int tax_percent) {
        double tip = meal_cost * tip_percent / 100;
        double tax = meal_cost * tax_percent / 100;
        int totalCost = (int) Math.round(meal_cost + tip + tax);
        System.out.print(totalCost);
    }



    public static void main(String[] args) {
       Scanner scn = new Scanner(System.in);
        double meal_cost = scn.nextDouble();

        int tip_percent = scn.nextInt();

        int tax_percent = scn.nextInt();

        solve(meal_cost, tip_percent, tax_percent);


    }
}
