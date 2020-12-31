package icehs.science.chapter05;

public class ValuationBasisTest {

	public static void main(String[] args) {
		int firstnum = 10;
		int secondnum = 20;
		int thirdnum = 40;
		int fourthnum = 50;
		int fifthnum = 80;
		
		double result = 0;
		
		result = firstnum * (secondnum / 2 * 0.6);
		result = result + (thirdnum + fourthnum) / 2 * 0.13;
		result = result + (fifthnum * 0.27);
		
		if (result >=95 && result <=100) {
			System.out.println("Special Class  입니다.");
		}else if (result >= 90 && result < 95) {
			System.out.println("Gold Class 입니다.");
		}else if (result >= 85 && result <90 ) {
			System.out.println("Silver Class 입니다");
		}else if (result >= 80 && result < 85) {
			System.out.println("Bronze Class 입니다.");
		}else if (result < 80) {
			System.out.println("Member 입니다");
		}
	}

}
