package com.iamcure.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class ThreadSafeSimpleDateFormat {

	private DateFormat df;

	public ThreadSafeSimpleDateFormat(String format) {
		this.df = new SimpleDateFormat(format);
	}
	
	public ThreadSafeSimpleDateFormat(String format,TimeZone timeZone) {
		this.df = new SimpleDateFormat(format);
		this.df.setTimeZone(timeZone);
	}

	public synchronized String format(Calendar date) {
		return df.format(date.getTime());
	}

	
	public synchronized String format(Date date) {
		return df.format(date);
	}
	
	public synchronized Date parse(String string) throws ParseException {
		return df.parse(string);
	}
}
