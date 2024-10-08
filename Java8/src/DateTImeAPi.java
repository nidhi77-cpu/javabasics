import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

/**
 * 
 */

/**
 * @author srinidhi.k
 *
 */
public class DateTImeAPi {

	
	public static void main(String[] args) {
		
		//////////////////////////////////////////////////////////////////////////////////
		// localDate
		LocalDate now = LocalDate.now();
		System.out.println(now);
		LocalDate mydate = LocalDate.of(1999, 2, 27);
		System.out.println(mydate);
		int month = now.getDayOfMonth();
		System.out.println(month);
		now.getDayOfWeek();
		now.getDayOfYear();

		LocalDate yesterday = now.minusDays(1);
		System.out.println(yesterday);
		
		//////////////////////////////////////////////////////////////////////////////////////
		//localtime
		
		LocalTime nowtime  = LocalTime.now();
		 System.out.println(nowtime);
		 
		 
		 /////////////////////////////////////////////////////////////////////////////////////
		 
		 //localdatetime//
		 
		 LocalDateTime date = LocalDateTime.now();
		 System.out.println(date);
		 
		 
		 ///////////////////////////////////////////////////////////////////////////////////
		 
		 ZonedDateTime zone = ZonedDateTime.now();
		 System.out.println(zone);
		 Set<String> avaliblezoneids = ZoneId.getAvailableZoneIds();
		 System.out.println(avaliblezoneids);
		 
		 ////////////////////////////////////////////////////////////////////////
		 //instant//
		 Long currentTimeMillis = System.currentTimeMillis();
		 System.out.println(currentTimeMillis);
		 
		 Instant instant = Instant.now();
		 System.out.println(instant);
		 now.atStartOfDay();
		 //////////////////////////////////////////////////////////
		 
		 LocalDate date1 = LocalDate.now();
		 LocalDate date2 = LocalDate.parse("2024-01-31");
		 System.out.println(date2);		 
		 
		 //////////////////////////////////////////////////
		 //format
		
		

	}

}
