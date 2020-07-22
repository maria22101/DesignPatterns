package creational.factory_method.time_zone_simple;

import java.util.Arrays;
import java.util.List;

public class CalendarTestDrive {
    public static void main(String[] args) {

        ZoneFactory zoneFactory = new ZoneFactory();

        Calendar calendar1 = new PacificCalendar(zoneFactory);
        List<String> appointments1 = Arrays.asList("appt_1", "appt_2", "appt_3");
        calendar1.createCalendar(appointments1);
        calendar1.print();

        System.out.println("*******************");

        Calendar calendar2 = new EastCalendar(zoneFactory);
        List<String> appointments = Arrays.asList("appt_1", "appt_2", "appt_3");
        calendar2.createCalendar(appointments);
        calendar2.print();
    }
}
