package menjadi.programmer.classes;

import java.util.Calendar;
import java.util.Date;

public class DateApp {
    public static void main(String[] args) {
        
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.YEAR, -12);
        calendar.set(Calendar.MONTH, Calendar.JANUARY);
        Date date = calendar.getTime();


        System.out.println(date);
        
        Date tanggal = new Date();
        long millisecond = tanggal.getTime();

        System.out.println(tanggal);
        System.out.println(millisecond);

        

    }
    
}
