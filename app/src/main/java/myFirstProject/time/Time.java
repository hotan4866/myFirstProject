package myFirstProject.time;

import java.time.LocalDate;


public class Time {

	int year = 2020;
	int month = 12;
	int dayOfMonth = 01;
	
	LocalDate localDate = LocalDate.now();
	LocalDate localDate1 = LocalDate.of(year, month, dayOfMonth);
	
	
	
}
