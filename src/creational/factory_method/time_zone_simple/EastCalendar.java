package creational.factory_method.time_zone_simple;

import java.util.List;

public class EastCalendar extends Calendar{

    public EastCalendar(ZoneFactory zoneFactory) {
        zone = zoneFactory.createZone("US/Eastern");
    }

    @Override
    public void createCalendar(List<String> appointments) {
        System.out.println("Making calendar for Eastern zone");
    }
}
