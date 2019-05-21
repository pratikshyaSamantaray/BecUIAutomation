package com.benchmark.testcases.home;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Test {
	

	public static void main(String[] args) throws ParseException {
		WebDriver d;
		//List<WebElement> List = d.findElements(By.xpath(reportPage.getDateColumnXpath()));
		//String strArray[] = new String[List.size()];
		 ArrayList<Date> date=new ArrayList<>();
		  SimpleDateFormat format=new SimpleDateFormat("dd-MM-yyyy");
		  Date date1=format.parse("02-12-2001");
		  Date date2=format.parse("12-09-1999");
		  Date date3=format.parse("13-11-2016");
		  date.add(date1);
		  date.add(date2);
		  date.add(date3);
		  Collections.sort(date);
		  date.forEach(action-> System.out.println(format.format(action)));

	}

}
