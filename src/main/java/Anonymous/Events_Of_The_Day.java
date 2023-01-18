package Anonymous;

import java.util.Date;

public class Events_Of_The_Day {
    public static void main(String[] args) {
        Date today = new Date();
        if (today.getDay() == today.getTime()) {
            System.out.println("Swami Vivekananda's Birthday");
        }
        System.out.println("date : " + today.getDate());

    }
}
