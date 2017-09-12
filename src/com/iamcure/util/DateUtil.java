package com.iamcure.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;


public class DateUtil {

	
	public static ThreadSafeSimpleDateFormat dtFormat 			= 	new ThreadSafeSimpleDateFormat("MM/dd/yyyy");
	public static ThreadSafeSimpleDateFormat dateFormat 		= 	new ThreadSafeSimpleDateFormat("yyyy-MM-dd");
	public static ThreadSafeSimpleDateFormat displayDtFormat 	= 	new ThreadSafeSimpleDateFormat("dd-MMM-yyyy");
	public static ThreadSafeSimpleDateFormat timeFormat 		= 	new ThreadSafeSimpleDateFormat("dd-MMM-yyyy hh:mm:ss a");
	public static ThreadSafeSimpleDateFormat eventTimeFormat 	= 	new ThreadSafeSimpleDateFormat("MM/dd/yyyy HH:mm:ss");
	public static ThreadSafeSimpleDateFormat hours				=	new ThreadSafeSimpleDateFormat("HH");
	public static ThreadSafeSimpleDateFormat minutes			=	new ThreadSafeSimpleDateFormat("mm");
	public static ThreadSafeSimpleDateFormat seconds			=	new ThreadSafeSimpleDateFormat("ss");
	public static ThreadSafeSimpleDateFormat years				=	new ThreadSafeSimpleDateFormat("yyyy");
	public static ThreadSafeSimpleDateFormat monthYearFormat	=	new ThreadSafeSimpleDateFormat("yyyy-MM");
	public static ThreadSafeSimpleDateFormat monthFormat		=	new ThreadSafeSimpleDateFormat("MM");
	public static ThreadSafeSimpleDateFormat fileNameFormat 	= 	new ThreadSafeSimpleDateFormat("dd-MM-yyyy-HH-mm-ss");
	
	public static ThreadSafeSimpleDateFormat dbFormat 			= 	new ThreadSafeSimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	public static ThreadSafeSimpleDateFormat dateTimeFormat 	= 	new ThreadSafeSimpleDateFormat("MM/dd/yyyy HH:mm");
	
	public static ThreadSafeSimpleDateFormat monthYear	=	new ThreadSafeSimpleDateFormat("MMMM yyyy");
	public final static long ONE_SECOND = 1000;
	public final static long SECONDS = 60;

	public final static long ONE_MINUTE = ONE_SECOND * 60;
	public final static long MINUTES = 60;
  
	public final static long ONE_HOUR = ONE_MINUTE * 60;
	public final static long HOURS = 24;
  
	public final static long ONE_DAY = ONE_HOUR * 24;
	
	/**
	 * This method takes the parameter MM/dd/yyyy
	 * returns the calendar Object
	 * @param date
	 * @return
	 */
	public static Calendar getCalFromString(String date)
	{
		Calendar calObj=Calendar.getInstance();
		if(date!=null && date.length()>0)
		{
			calObj=Calendar.getInstance();
			try {
				calObj.setTime(dtFormat.parse(date));
				return calObj;
			} catch (Exception e) {
			return null;
			}
		}
		return null;
	}
	/**
	 * This method takes the parameter MM/dd/yyyy
	 * returns the yyyy-MM-dd format
	 * @param date
	 * @return
	 */
	public static String getCalenderFormatDate(String date)
	{
		Calendar cal=Calendar.getInstance();
		try {
			cal.setTime(dtFormat.parse(date));
			return dateFormat.format(cal.getTime());
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * This method takes the parameter dd-MMM-yyyy
	 * returns the yyyy-MM-dd format
	 * @param date
	 * @return
	 */
	public static String getCalenderFormatDateFromDisplay(String date)
	{
		Calendar cal=Calendar.getInstance();
		try {
			cal.setTime(displayDtFormat.parse(date));
			return dateFormat.format(cal.getTime());
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * This method is to set the start time for the shift
	 * @param time
	 * @return
	 */
	public static Calendar getShiftStartTime(String time)
	{
		Calendar now=Calendar.getInstance();
		String values[]=time.split(":");
		if(values.length!=2)
			return null;
		try {
			now.set(Calendar.HOUR_OF_DAY, Integer.valueOf(values[0]));
			now.set(Calendar.MINUTE, Integer.valueOf(values[1]));
			now.set(Calendar.SECOND, 0);
		} catch (Exception e) {
			return null;
		}
//		System.out.println("Shift Start Time "+getStringFromCal("dd-MM-yyyy HH:mm:ss ", now));
		return now;
	}
	/**
	 * This method is to set the end time for a shift
	 * @param time
	 * @param startTime
	 * @return
	 */
	public static Calendar getShiftEndTime(String time,Calendar startTime)
	{
		Calendar now=Calendar.getInstance();
		now.setTime(startTime.getTime());
		String values[]=time.split(":");
		if(values.length!=2)
			return null;
		try {
			now.add(Calendar.HOUR_OF_DAY, Integer.valueOf(values[0]));
			now.add(Calendar.MINUTE, Integer.valueOf(values[1]));
			
		} catch (Exception e) {
			return null;
		}
//		System.out.println("Shift End Time "+getStringFromCal("dd-MM-yyyy HH:mm:ss ", now));
		return now;
	}
	/**
	 * This method takes the parameter Calendar object 
	 * returns the MM/dd/yyyy format
	 * @param date
	 * @return
	 */
	public static String getStringToDisplayFromCal(Calendar date)
	{
		if(date==null)
			return "";
		return dtFormat.format(date.getTime());
	}
	
	/**
	 * This method takes the parameter Calendar object 
	 * returns the yyyy-MM-dd format
	 * @param date
	 * @return
	 */
	public static String getDbFormatDate(Calendar date)
	{
		if(date!=null)
			return dateFormat.format(date.getTime());
		return null;
	}
	
	/**
	 * This method is to set the start time of the date to 00:00:00
	 * @param start
	 * @return
	 */
	public static Calendar getDayStartTime(String start)
	{
		Calendar calObj=getCalFromString(start);
		if(calObj!=null)
		{
			calObj.set(Calendar.HOUR_OF_DAY, 0);
			calObj.set(Calendar.MINUTE, 0);
			calObj.set(Calendar.SECOND, 0);
		}
		return calObj;
	}
	
	/**
	 * This method  id to set the end time of the date as 23:59:59 
	 * @param end
	 * @return
	 */
	public static Calendar getDayEndTime(String end)
	{
		Calendar calObj=getCalFromString(end);
		if(calObj!=null)
		{
			calObj.set(Calendar.HOUR_OF_DAY, 23);
			calObj.set(Calendar.MINUTE, 59);
			calObj.set(Calendar.SECOND, 59);
		}
		return calObj;
	}
	
	/**
	 * This method is to retrun the full date time format as dd-MMM-yyyy hh:mm:ss a takes the parameter as Calender Object
	 * @param dateTime
	 * @return
	 */
	public static String  getFullTimeFormat(Calendar dateTime)
	{
		if(dateTime!=null)
			return timeFormat.format(dateTime.getTime());
		else
			return "";
	}
	
	/**
	 * This method is to return the Calendar Object from  full date time format as dd-MMM-yyyy hh:mm:ss a 
	 * @param dateTime
	 * @return
	 */
	public static Calendar getCalFromFullTimeFormat(String dateTime)
	{
		Calendar date=Calendar.getInstance();
		if(dateTime!=null)
			try {
				date.setTime(timeFormat.parse(dateTime));
			} catch (ParseException e) {
				e.printStackTrace();
			}
		return date;
	}
	
	
	/**
	 * This method is to return the week_day based on the index 
	 * @param index
	 * @return
	 */
	public static String getDay(int index)
	{
		String day="";
		switch (index) {
		case 0:
			day="Sunday";
			break;
		case 1:
			day="Monday";
			break;
		case 2:
			day="Tuesday";
			break;
		case 3:
			day="Wednesday";
			break;
		case 4:
			day="Thursday";
			break;
		case 5:
			day="Friday";
			break;
		case 6:
			day="Saturday";
			break;
		
		default:
			break;
		}
		return day;
	}
	
	public static int getDay(String day)
	{
		if(day==null)
			return -1;
		int index=-1;
		if(day.equalsIgnoreCase("Sunday"))
			return 0;
		else if(day.equalsIgnoreCase("Monday"))
			return 1;
		else if(day.equalsIgnoreCase("Tuesday"))
			return 2;
		else if(day.equalsIgnoreCase("Wednesday"))
			return 3;
		else if(day.equalsIgnoreCase("Thursday"))
			return 4;
		else if(day.equalsIgnoreCase("Friday"))
			return 5;
		else if(day.equalsIgnoreCase("Saturday"))
			return 6;
	return -1;
	}
	
	/**
	 * This method is to return the name of the month based on the index 
	 * @param index
	 * @return
	 */
	public static String getMonth(int index)
	{
		String month="";
		switch (index) {
		case 0:
			month="January";
			break;
		case 1:
			month="February";
			break;
		case 2:
			month="March";
			break;
		case 3:
			month="April";
			break;
		case 4:
			month="May";
			break;
		case 5:
			month="June";
			break;
		case 6:
			month="July";
			break;
		case 7:
			month="August";
			break;
		case 8:
			month="September";
			break;
		case 9:
			month="October";
			break;
		case 10:
			month="November";
			break;
		case 11:
			month="December";
			break;
		default:
			break;
		}
		return month;
	}
	
	/**
	 * This method is to return the name of the month based on the index 
	 * @param index
	 * @return
	 */
	public static int getMonth(String  monthName)
	{
		if(monthName.equalsIgnoreCase("January"))
			return 0;
		else if(monthName.equalsIgnoreCase("February"))
			return 1;
		else if(monthName.equalsIgnoreCase("March"))
			return 2;
		else if(monthName.equalsIgnoreCase("April"))
			return 3;
		else if(monthName.equalsIgnoreCase("May"))
			return 4;
		else if(monthName.equalsIgnoreCase("June"))
			return 5;
		else if(monthName.equalsIgnoreCase("July"))
			return 6;
		else if(monthName.equalsIgnoreCase("August"))
			return 7;
		else if(monthName.equalsIgnoreCase("September"))
			return 8;
		else if(monthName.equalsIgnoreCase("October"))
			return 9;
		else if(monthName.equalsIgnoreCase("November"))
			return 10;
		else if(monthName.equalsIgnoreCase("December"))
			return 11;
		return -1;
	}
	
	/**
	 * This method is to convert the duration in long to hh mm ss format
	 * @param duration
	 * @return
	 */
	public static String millisToShortDHMS(long duration) {
	    String res = "";
	    duration /= ONE_SECOND;
	    int seconds = (int) (duration % SECONDS);
	    duration /= SECONDS;
	    int minutes = (int) (duration % MINUTES);
	    duration /= MINUTES;
	    int hours = (int) (duration % HOURS);
	    
	    int days  = (int) (duration /HOURS );
	    //int days = (int) (duration / HOURS);
	    //1d 17h 18m 15s
	    //if (days == 0) {
	      res = String.format("%dd %dh %dm %ds",days, hours, minutes, seconds);
	    //} else {
	    //  res = String.format("%dd%02d:%02d:%02d", days, hours, minutes, seconds);
	    //}
	    return res;
	  }
	
	/**
	 * This method is to convert the date fromat from yyyy-MM-dd to dd-MMM-yyyy
	 * @param date
	 * @return
	 */
	public static String getDispalyFromatFromCalFormat(String date)
	{
		if(date==null)
			return "";
		Calendar dateObj=Calendar.getInstance();
			try {
				dateObj.setTime(dateFormat.parse(date));
			} catch (ParseException e) {
				e.printStackTrace();
				return "";
			}
			return displayDtFormat.format(dateObj.getTime());
		
	}
	
	/**
	 * this method is to return the calender obj from the full date time format
	 * MM/dd/yyyy hh:mm:ss
	 * @param 
	 */
	public static Calendar getCalObjFromFullDateTime(String date)
	{
		Calendar dateTime=Calendar.getInstance();
		try {
			dateTime.setTime(eventTimeFormat.parse(date));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return dateTime;
	}
	
	/**
	 * This method is to return the hours only from the cal
	 */
	public static String  getHours(Calendar date) {
		if(date!=null)
			return hours.format(date.getTime());
		return "";
	}
	/**
	 * This method is to return the minutes
	 * @param date
	 * @return
	 */
	public static String  getMinutes(Calendar date) {
		if(date!=null)
			return minutes.format(date.getTime());
		return "";
	}
	
	/**
	 * This method is to return the seconds only
	 * @param date
	 * @return
	 */
	public static String  getSeconds(Calendar date) {
		if(date!=null)
			return seconds.format(date.getTime());
		return "";
	}
	
	/**
	 * This method is to ge the only hours
	 * @param date
	 * @return
	 */
	public static int  getYear(Calendar date) {
		if(date!=null)
			return Integer.valueOf(years.format(date.getTime()));
		return 0;
	}
	
	
	/**
	 * This method is to return the "Calender object" from the String format as "yyyy-MM-dd"
	 * @param dateString
	 * @return
	 */
	public static Calendar getCalFromDbFormatString(String dateString)
	{
		Calendar dateTime=Calendar.getInstance();
		try {
			dateTime.setTime(dateFormat.parse(dateString));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return dateTime;
	}
	
	/**
	 * This method is to get the "yyyy-MM" format from the "Calender Object"
	 * @param date
	 * @return
	 */
	public static String  getMonthYear(Calendar date) {
		if(date!=null)
			return monthYearFormat.format(date.getTime());
		return null;
	}
	
	/**
	 * This method is to get the "MM" format from the "Calender Object"
	 * @param date
	 * @return
	 */
	public static String  getMonth(Calendar date) {
		if(date!=null)
			return monthFormat.format(date.getTime());
		return null;
	}
	
	public static int  getDay(Calendar date) {
		if(date!=null)
			return date.get(Calendar.DAY_OF_MONTH);
		return -1;
	}
	
	/**
	 * This method is to get the file name as the datetime string
	 * @return
	 */
	public static String  getFileName() {
		Calendar date=Calendar.getInstance();
		return fileNameFormat.format(date.getTime());
	}
	
	public static String getColor(int index)
	{
		String color="";
		switch (index) {
		case 0:
			color="#F4CDCD";
			break;
		case 1:
			color="#D9CDF4";
			break;
		case 2:
			color="#CDF4F2";
			break;
		case 3:
			color="#D4F4CD";
			break;
		case 4:
			color="#F2F4CD";
			break;
		case 5:
			color="#cccccc";
			break;
		default:
			color="#fsfdf";
			break;
		}
		return color;
				
	}
	
	
	
	
	/*public static void main(String asd[])
	{
		Calendar now=Calendar.getInstance();
		//Calendar end=Calendar.getInstance();
		//end.add(Calendar.DAY_OF_MONTH, -20);
	System.out.println(getStringFromCal("EEEE",now));
//	System.out.println(convertDate("", inputFormat, outPutFormat));
	//System.out.println(end.toString());
	}*/
	
	public static int getDifferenceBetween2Days(Calendar from,Calendar to)
	{
//		System.out.println("Start "+DateUtil.getStringToDisplayFromCal(from)+" end "+DateUtil.getStringToDisplayFromCal(to));
		setTime(from, 0, 0, 0);
		setTime(to, 0, 0, 0);
		int count=1;
		Calendar old=Calendar.getInstance();
		old.setTimeInMillis(from.getTimeInMillis());
		while (getYear(old)<=getYear(to) && old.get(Calendar.MONTH)<=to.get(Calendar.MONTH) && getDay(old)<getDay(to)) {
			count++;
			old.add(Calendar.DAY_OF_MONTH, 1);
//			System.out.println("old"+DateUtil.getFullTimeFormat(old)+" end "+DateUtil.getFullTimeFormat(to));
			
		}
		
		//System.out.println("count "+count);
		return count;
		
	}
	public static Calendar setTime(Calendar date,int hours,int minutes,int seconds)
	{
		if(date==null)
			return null;
		date.set(Calendar.HOUR_OF_DAY, hours);
		date.set(Calendar.MINUTE, minutes);
		date.set(Calendar.SECOND, seconds);
		date.set(Calendar.MILLISECOND, 0);
	return date;	
	}
	public static String convertDate(String date, String inputFormat,String outPutFormat)
	{
		ThreadSafeSimpleDateFormat inFormat = new ThreadSafeSimpleDateFormat(inputFormat);
		ThreadSafeSimpleDateFormat outFormat = new ThreadSafeSimpleDateFormat(outPutFormat);
		Calendar cal=Calendar.getInstance();
		try {
			cal.setTime(inFormat.parse(date));
			return outFormat.format(cal.getTime());
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		return "";
	}

	 public static float Round(float Rval, int Rpl) {
		  float p = (float)Math.pow(10,Rpl);
		  Rval = Rval * p;
		  float tmp = Math.round(Rval);
		  return (float)tmp/p;
		  }
	 public static double Round(double Rval, int Rpl) {
		  double p = (double)Math.pow(10,Rpl);
		  Rval = Rval * p;
		  float tmp = Math.round(Rval);
		  return (double)tmp/p;
		  }
	 /**
	  * This mmethod return the comparision between 2 dates
	  * 
	  * 1 means start date is smaller
	  * -1 means start date is greater
	  * 0 means equal
	  * 
	  * @param start
	  * @param end
	  * @return
	  */
	 public static int compare2Dates(Calendar start,Calendar end)
	 {
		 start=getDayStartTime(getStringToDisplayFromCal(start));
		 end=getDayStartTime(getStringToDisplayFromCal(end));
		 if(start.before(end))
			 return 1;
		 else if(start.after(end))
			 return -1;
		 else if(start.get(Calendar.YEAR)==end.get(Calendar.YEAR) && start.get(Calendar.MONTH)==end.get(Calendar.MONTH) && start.get(Calendar.DAY_OF_MONTH)==end.get(Calendar.DAY_OF_MONTH))
			 return 0;
			 return -2;
	 }
	 
	 
	 
	 public static String getDateTimeFormat(Calendar date)
	 {
		 if(date==null)
			 return "";
		 return dateTimeFormat.format(date.getTime());
	 }
	 public static Calendar getDateTimeFormat(String date)
	 {
		 Calendar now=Calendar.getInstance();
		 if(date==null)
			 return null;
		 try {
			now.setTime(dateTimeFormat.parse(date));
		} catch (ParseException e) {
			e.printStackTrace();
			return null;
			
		}
		 return now;
	 }
	 
	 /**
	  * This method takes the format and the date object and gives the string  in the given format 
	  * @param format
	  * @param cal
	  * @return
	  */
	 public static String getStringFromCal(String format,Calendar cal)
	 {
		 if(cal==null)
			 return "";
		 ThreadSafeSimpleDateFormat sdfFormat 			= 	new ThreadSafeSimpleDateFormat(format);
		 String resultedText = sdfFormat.format(cal);
		 return resultedText;
	 }
	 
	 public static String getStringFromCalWithTimezone(String format,Calendar cal)
	 {
		 if(cal==null)
			 return "";
		 ThreadSafeSimpleDateFormat sdfFormat 			= 	new ThreadSafeSimpleDateFormat(format,cal.getTimeZone());
		 String resultedText = sdfFormat.format(cal);
		 return resultedText;
	 }
	 
	 public static Calendar getCalFromString(String format,String date)
	 {
		 if(date==null)
			 return Calendar.getInstance();
		 
		 ThreadSafeSimpleDateFormat sdfFormat 			= 	new ThreadSafeSimpleDateFormat(format);
		Calendar resultedCalender=Calendar.getInstance();
		
		try {
			resultedCalender.setTime(sdfFormat.parse(date));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		 return resultedCalender;
	 }
	 
	public static Calendar setDate(Calendar actual, Calendar instance) {
		if(actual==null)
			return null;
		actual.set(Calendar.DAY_OF_MONTH, instance.get(Calendar.DAY_OF_MONTH));
		actual.set(Calendar.MONTH, instance.get(Calendar.MONTH));
		actual.set(Calendar.YEAR, instance.get(Calendar.YEAR));
		actual.set(Calendar.DAY_OF_YEAR, instance.get(Calendar.DAY_OF_YEAR));
		return actual;
	}
	
	public static int getDifference(Calendar from,Calendar to)
	{
		Calendar cal1 = Calendar.getInstance();
        Calendar cal2 = Calendar.getInstance();
        
        // Set the date for both of the calendar instance
        cal1.set(from.get(Calendar.YEAR), from.get(Calendar.MONTH), from.get(Calendar.DAY_OF_MONTH));
        cal2.set(to.get(Calendar.YEAR), to.get(Calendar.MONTH), to.get(Calendar.DAY_OF_MONTH));

        // Get the represented date in milliseconds
        long milis1 = cal1.getTimeInMillis();
        long milis2 = cal2.getTimeInMillis();
        
        // Calculate difference in milliseconds
        long diff = milis2 - milis1;
        
        // Calculate difference in seconds
        long diffSeconds = diff / 1000;
        
        // Calculate difference in minutes
        long diffMinutes = diff / (60 * 1000);
        
        // Calculate difference in hours
        long diffHours = diff / (60 * 60 * 1000);
        
        // Calculate difference in days
        long diffDays = diff / (24 * 60 * 60 * 1000);
        return (int)diffDays;
	}
	
	public static long getDifferenceInMillis(Calendar from,Calendar to)
	{
		long currentTime=0;
		long pastTime=0;
		if(from!=null)
			currentTime=from.getTimeInMillis();
		if(to!=null)
			pastTime=to.getTimeInMillis();
		return currentTime-pastTime;
	}
	
	
	public static List<String> getDaysBetweenDates(Calendar from,Calendar to){
		List<String> days = new ArrayList<String>();
		while(from.before(to)){
			days.add(getStringFromCal("yyyy-MM-dd", to));
			to.add(Calendar.DATE, -1);
		}
		days.add(getStringFromCal("yyyy-MM-dd", to));
		return days;
	}
	public static Calendar getWeekStartDate(Calendar date)
	{
		Calendar temp=Calendar.getInstance();
		temp.setTimeInMillis(date.getTimeInMillis());
		temp.add(Calendar.DATE, -7);
		int week=date.get(Calendar.WEEK_OF_YEAR);
		
		while(temp.before(date))
		{
			if(temp.get(Calendar.WEEK_OF_YEAR)==week)
				break;
			temp.add(Calendar.DATE, 1);
			
		}
		
		
		return temp;
	}
	
	public static Calendar getWeekEndDate(Calendar date)
	{
		Calendar temp=Calendar.getInstance();
		
		temp.setTimeInMillis(date.getTimeInMillis());
		temp.add(Calendar.DATE, 7);
		int week=date.get(Calendar.WEEK_OF_YEAR);
		
		while(temp.after(date))
		{
			if(temp.get(Calendar.WEEK_OF_YEAR)==week)
				break;
			temp.add(Calendar.DATE, -1);
			
		}
		
		
		return temp;
	}
	
	/**
	 * This method is to convert the input string(date) to data query-able date format
	 * tail is for hh:mm:ss
	 * @param inputTimeString
	 * @param tail
	 * @return
	 */
	public static String getDataTimeStamp(String inputTimeString,String tail){
		//if length of input string is greater than 10 then it is assumed to be in yyyy-MM-dd HH:mm:ss format
		if(inputTimeString.length()>10)
			return inputTimeString;
		
		return convertDate("MM/dd/yyyy","yyyy-MM-dd",inputTimeString).concat(tail);
	}
	
	/**
	 * This method is to get the "MMMM yyyy" format from the "Calender Object"
	 * @param date
	 * @return
	 */
	public static String  getMonthYearFormat(Calendar date) {
		if(date!=null)
			return monthYear.format(date.getTime());
		return null;
	}

	/**
	 * This method is to return the "Calender object" from the String format as "yyyy-MM-dd HH:mm:ss"
	 * @param dateString
	 * @return
	 */
	public static Calendar getCalFromDbTimeFormatString(String dateString)
	{
		Calendar dateTime=Calendar.getInstance();
		try {
			dateTime.setTime(dbFormat.parse(dateString));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return dateTime;
	}
	
	public static String getDBformatStringFromCal(Calendar cal){
		String time = "";
		try {
			time = dbFormat.format(cal.getTime());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return time;
	}
	
	public static Calendar DateToCalendar(Date date){ 
		  Calendar cal = Calendar.getInstance();
		  cal.setTime(date);
		  return cal;
		}
	
	//Convert Calendar to Date
		public static Date calendarToDate(Calendar calendar) {
			return calendar.getTime();
		}
	
	public static void main(String[] args) {

		SimpleDateFormat sdft = new SimpleDateFormat("");

		String date = "20090927 150000.000";

		String dateTime = getDateTimeString(date);
		
		Calendar calDateTime=DateUtil.getCalFromString("yyyy-MM-dd", dateTime);
		System.out.println("Before"+dateTime);
		/*Calendar calDateTime=getCalFromDbTimeFormatString(dateTime);
		calDateTime=setTime(calDateTime, 0, 0, 0);*/
		dateTime=getDBformatStringFromCal(calDateTime);
		System.out.println("after"+dateTime);

	}

	public static String getDateTimeString(String date) {
		String dateTime="";
		try {
			String fmtStr = date.replace(".000", "");
			String dateStr1 = fmtStr.substring(0, 4);
			String dateStr2 = fmtStr.substring(4, 6);
			String dateStr3 = fmtStr.substring(6, 8);
			String dateString = dateStr1 + "-" + dateStr2 + "-" + dateStr3;
			String timeStr1 = fmtStr.substring(9, 11);
			String timeStr2 = fmtStr.substring(11, 13);
			String timeStr3 = fmtStr.substring(13, 15);
			String timeString = timeStr1 + ":" + timeStr2 + ":" + timeStr3;
			dateTime = dateString + " " + timeString;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return dateTime;
	}

}
