package icehs.science.chapter04;

public class OperatorTest {

	public static void main(String[] args) {
		int num = 64;
		
		boolean two = (num % 2 == 0);
		boolean three = (num % 3 == 0);
		boolean tt = (num % 2 == 0) && (num % 3 == 0);
		boolean hh = (num % 2 == 0) || (num % 3 == 0);
		
		
		
		
		
		System.out.println("¦���Դϱ�? : " + two);
		System.out.println("3�� ����Դϱ�? : " + three);
		System.out.println("2�� ����̸鼭 7�� ����Դϱ�? : " + tt);
		System.out.println("2�� ����̰ų� 7�� ����Դϱ�? : " + hh);
		
		
					
	}

}
