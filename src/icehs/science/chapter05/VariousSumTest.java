package icehs.science.chapter05;

public class VariousSumTest {
	public static void main(String[] args) {
		
		int sum = 0;
		int twosum = 0;
		int onesum = 0;
		for ( int i = 0; i<=1000; i++ ) {
			sum += i;
			if (i % 2 == 0) {
				twosum += i;
			}
			else {
				onesum += i;
			}
		}
		System.out.println("1���� 1000 ������ �� : " + sum);
		System.out.println("1���� 1000���� ¦������ �� : " + twosum);
		System.out.println("1���� 1000���� Ȧ������ �� : " + onesum);
	}

}
