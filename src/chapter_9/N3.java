package chapter_9;

import java.util.Date;

public class N3 {
    public static void main(String[] args) {
        Date date = new Date();
        date.setTime(1000000);

        System.out.println(date.toString());
    }
}
