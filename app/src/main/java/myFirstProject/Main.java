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
		System.out.println("[-128~127 �ʰ����� ���]");
		Integer obj1 = 300;
		Integer obj2 = 300;
		System.out.println("==���: " + (obj1 == obj2));  
		System.out.println("��ڽ��� ==���: " + (obj1.intValue() == obj2.intValue())); 
		System.out.println("equals() ���: " + obj1.equals(obj2)); 
		System.out.println();
		
		System.out.println("[-128~127 �������� ���]");
		Integer obj3 = 10;
		Integer obj4 = 10;
		System.out.println("==���: " + (obj3 == obj4)); 
		System.out.println("��ڽ��� ==���: " + (obj3.intValue() == obj4.intValue())); 
		System.out.println("equals() ���: " + obj3.equals(obj4)); 
		
	}
	
	
	public static void sts() {
		int[][] original = { {1,2}, {3,4} };
		
		//original �ּ� ü��� 
		//{1,2} �ּҰ� 1
		//{3,4} �ּҰ� 2
		//original �ּҰ� 3 
		
		
		
		
		//�A�� ������ ��
		System.out.println("[���� ������ ��]");
		int[][] cloned1 = Arrays.copyOf(original, original.length);
		
		
		//cloned1 �ּ� ü��� 
		//{1,2} �ּҰ� 1
		//{3,4} �ּҰ� 2
		//cloned1 �ְ� 4 
		// �ڹٿ��� ���� ����� ������ �ּҸ� �ٶ󺸴� �����̴�.
		
		int[] asd = {1,2,3,4};
		int[] asd1 = asd;
		//System.out.println("�迭 ���� ��: " + asd.equals(asd1));
		//System.out.println("1�� �迭 �׸� ��: " + Arrays.equals(asd, asd1));
		
		System.out.println("�迭 ���� ��: " + original.equals(cloned1));
		System.out.println("1�� �迭 �׸� ��: " + Arrays.equals(original, cloned1));
		System.out.println("��ø �迭 �׸� ��: " + Arrays.deepEquals(original, cloned1));
		
		//���� ������ ��
		System.out.println("\n[���� ������ ��]");
		int[][] cloned2 = Arrays.copyOf(original, original.length);
		cloned2[0] = Arrays.copyOf(original[0], original[0].length);
		cloned2[1] = Arrays.copyOf(original[1], original[1].length);
		System.out.println("�迭 ���� ��: " + original.equals(cloned2));
		System.out.println("1�� �迭 �׸� ��: " + Arrays.equals(original, cloned2));
		System.out.println("��ø �迭 �׸� ��: " + Arrays.deepEquals(original, cloned2));
	}
}
