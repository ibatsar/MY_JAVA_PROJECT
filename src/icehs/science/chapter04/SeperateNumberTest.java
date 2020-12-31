package icehs.science.chapter04;

public class SeperateNumberTest {

	public static void main(String[] args) {
		int num = 456;
		int num100 = num / 100;
		int num10 = (num % 100) / 10;
		int num1 = num % 10;
		
		System.out.println("숫자 : " + num);
		System.out.println("백의 자리 수 : " + num100);
		System.out.println("십의 자리 수 : " + num10 );
		System.out.println("일의 자리 수 : " + num1);
		

	}

}
