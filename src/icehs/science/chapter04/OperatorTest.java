package icehs.science.chapter04;

public class OperatorTest {

	public static void main(String[] args) {
		int num = 64;
		
		boolean two = (num % 2 == 0);
		boolean three = (num % 3 == 0);
		boolean tt = (num % 2 == 0) && (num % 3 == 0);
		boolean hh = (num % 2 == 0) || (num % 3 == 0);
		
		
		
		
		
		System.out.println("짝수입니까? : " + two);
		System.out.println("3의 배수입니까? : " + three);
		System.out.println("2의 배수이면서 7의 배수입니까? : " + tt);
		System.out.println("2의 배수이거나 7의 배수입니까? : " + hh);
		
		
					
	}

}
