package myFirstProject.test;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAccessor;

import myFirstProject.thread.Task;

public class Test {
	
	public void run() {
		
		//threadCreate();
		
		//datetime();
		
	}
	
	
	
	
	public void datetime() {
		int year = 2020;
		int month = 12;
		int dayOfMonth = 1;
		
		LocalDate localDate = LocalDate.now();
		LocalDate localDate1 = LocalDate.of(year, month, dayOfMonth);
		
		System.out.println(localDate + " " + localDate1);
		
		ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of("UTC"));
		ZonedDateTime zonedDateTime1 = ZonedDateTime.now(ZoneId.of("Europe/London"));
		ZonedDateTime zonedDateTime2 = ZonedDateTime.now(ZoneId.of("Asia/Seoul"));
		ZonedDateTime zonedDateTime3 = ZonedDateTime.now();
		
	
		
		Instant instant = Instant.now();
		Instant instant1 = Instant.now();

		if(instant.isBefore(instant1)) {System.out.println("instant1�� ����");}
		else if (instant.isAfter(instant1)) {
			System.out.println("instant1�� ����");
		}else {
			System.out.println("����");
		}
		System.out.println("���� : " + instant.until(instant1, ChronoUnit.NANOS));
	}
	
	
	public void threadCreate() {
		
		// 1. ���� ����
		
		// 1) Ŭ���� ���� 
		Runnable runnable = new Task();
		Thread thread = new Thread(runnable);
		
		// 2) �Լ��� �������̽� 
		Thread thread1 = new Thread(new Runnable() {
			
			public void run() {
				//������ ������
				
			}
		}); 
		
		// 3) �Լ��� �������̽��� �޼ҵ尡 �ϳ����� ���ٰ� ���� 
		Thread thread2 = new Thread(()-> {
			
			// ������ ������ 
			
		}); 
		
		//thread.start();
		//thread1.start();
		//thread2.start();
				
	}
	
	
}
