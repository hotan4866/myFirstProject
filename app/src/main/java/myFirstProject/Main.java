package myFirstProject;

import java.text.DecimalFormat;
import java.util.Arrays;

import myFirstProject.test.Test;
import myFirstProject.thread.Task;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Test test = new Test();
		//test.run();
		
		//sts();
		//sts1();
		
		
		sts2();
		
	}

	public static void sts2() {
		double num = 1234567.89;
		
		DecimalFormat df = new DecimalFormat("0");
		System.out.println( df.format(num) );
		
		df = new DecimalFormat("0.00");
		System.out.println( df.format(num) );
		
		df = new DecimalFormat("0000000000.00000");
		System.out.println( df.format(num) );
		
		System.out.println( "================" );
		
		df = new DecimalFormat("#");
		System.out.println( df.format(num) );
		
		df = new DecimalFormat("#.#");
		System.out.println( df.format(num) );
		
		df = new DecimalFormat("##########.#####");
		
		
		System.out.println( df.format(num) );
		
		System.out.println( "================" );
		
		df = new DecimalFormat("#.0");
		System.out.println( df.format(num) );
		
		df = new DecimalFormat("+#.0");
		System.out.println( df.format(num) );
		
		df = new DecimalFormat("-#.0");
		System.out.println( df.format(num) );
		
		df = new DecimalFormat("#,###.0");
		System.out.println( df.format(num) );
		
		System.out.println( "================" );
		
		df = new DecimalFormat("0.0E0");
		System.out.println( df.format(num) );
		
		df = new DecimalFormat("+#,### ; -#,###");
		System.out.println( df.format(num) );
		
		df = new DecimalFormat("#.# %");
		System.out.println( df.format(num) );
		
		df = new DecimalFormat("\u00A4 #,###"); // 
		System.out.println( df.format(num) );
	}
	public static void sts1() {
		System.out.println("[-128~127 초과값일 경우]");
		Integer obj1 = 300;
		Integer obj2 = 300;
		System.out.println("==결과: " + (obj1 == obj2));  
		System.out.println("언박싱후 ==결과: " + (obj1.intValue() == obj2.intValue())); 
		System.out.println("equals() 결과: " + obj1.equals(obj2)); 
		System.out.println();
		
		System.out.println("[-128~127 범위값일 경우]");
		Integer obj3 = 10;
		Integer obj4 = 10;
		System.out.println("==결과: " + (obj3 == obj4)); 
		System.out.println("언박싱후 ==결과: " + (obj3.intValue() == obj4.intValue())); 
		System.out.println("equals() 결과: " + obj3.equals(obj4)); 
		
	}
	
	
	public static void sts() {
		int[][] original = { {1,2}, {3,4} };
		
		//original 주소 체계면 
		//{1,2} 주소가 1
		//{3,4} 주소가 2
		//original 주소가 3 
		
		
		
		
		//얖은 복사후 비교
		System.out.println("[얕은 복제후 비교]");
		int[][] cloned1 = Arrays.copyOf(original, original.length);
		
		
		//cloned1 주소 체계면 
		//{1,2} 주소가 1
		//{3,4} 주소가 2
		//cloned1 주고가 4 
		// 자바에서 얕은 복사는 동일한 주소를 바라보는 개념이다.
		
		int[] asd = {1,2,3,4};
		int[] asd1 = asd;
		//System.out.println("배열 번지 비교: " + asd.equals(asd1));
		//System.out.println("1차 배열 항목값 비교: " + Arrays.equals(asd, asd1));
		
		System.out.println("배열 번지 비교: " + original.equals(cloned1));
		System.out.println("1차 배열 항목값 비교: " + Arrays.equals(original, cloned1));
		System.out.println("중첩 배열 항목값 비교: " + Arrays.deepEquals(original, cloned1));
		
		//깊은 복사후 비교
		System.out.println("\n[깊은 복제후 비교]");
		int[][] cloned2 = Arrays.copyOf(original, original.length);
		cloned2[0] = Arrays.copyOf(original[0], original[0].length);
		cloned2[1] = Arrays.copyOf(original[1], original[1].length);
		System.out.println("배열 번지 비교: " + original.equals(cloned2));
		System.out.println("1차 배열 항목값 비교: " + Arrays.equals(original, cloned2));
		System.out.println("중첩 배열 항목값 비교: " + Arrays.deepEquals(original, cloned2));
	}
}
