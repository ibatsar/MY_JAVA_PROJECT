package icehs.science.chapter04;

public class SalaryTest {

	public static void main(String[] args) {
		int monthlySal = 1000000;
		int yearlySal = monthlySal * 12;
		int bonus = monthlySal * 2 / 10;
		int yearBonus = bonus * 4;
		int yearlySalAfterTax = yearlySal - yearlySal / 10;
		int yearBonusAfterTax = yearBonus - yearBonus * 55 / 1000;
		int yearIncome = yearlySalAfterTax + yearBonusAfterTax;
		
		System.out.println("연봉 : " + yearlySal + ", 세후 연봉 : " + yearlySalAfterTax);
		System.out.println("보너스 : " + yearBonus + ", 세후 보너스 : " + yearlySalAfterTax);
		System.out.println("지급액 : " + yearIncome);
		
		
		

	}

}
