

import java.text.SimpleDateFormat;
import java.util.Date;

public class Calender {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd-mm-yyyy hh:mm:ss");
        String strDate = formatter.format(date);
        System.out.println("Date Format with dd-mm-yyyy hh:mm:ss : " + strDate + " "+ "Ganesh Chaturthi is today" + " "+ "Hub day in the office today");


    }
}
