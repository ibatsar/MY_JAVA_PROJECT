package icehs.science.chapter05;

public class ChangeWhileTest {
	public static void main(String[] args) {
		int i = 1;
		while (i <= 10) {
			int j = 1;
			while ( j <= 1) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			j++;
		}
	}

}
