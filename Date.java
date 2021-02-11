
	import java.util.Calendar;
	import java.util.Date;
	import java.util.TimeZone;


	public class Date {
		static int day;
		static int month;
		static int year;
		String Sday;
		String Smonth;
		String Syear;
		
		public Date() {
			Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
			day = calendar.get(Calendar.DATE);
			Sday = Integer.toString(day);
			month = calendar.get(Calendar.MONTH) + 1;
			Smonth = Integer.toString(month);
			year = calendar.get(Calendar.YEAR);
			Syear = Integer.toString(year); 
		}
	}




