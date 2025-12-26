import java.util.*;
import java.time.ZonedDateTime;
import java.time.ZoneId;

public class TimeZoneAndZonedDateTime {
	static void showTime(String zoneName) {
        ZonedDateTime time = ZonedDateTime.now(ZoneId.of(zoneName));
        System.out.println(zoneName + " Time : " + time.toLocalTime());
    }
	
	public static void main(String[] args) {
		System.out.println("Current Time in Different Time Zones:\n");

        showTime("GMT");
        showTime("Asia/Kolkata");     // IST
        showTime("America/Los_Angeles"); // PST

	}

}
