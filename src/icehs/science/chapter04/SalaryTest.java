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
		
		System.out.println("���� : " + yearlySal + ", ���� ���� : " + yearlySalAfterTax);
		System.out.println("���ʽ� : " + yearBonus + ", ���� ���ʽ� : " + yearlySalAfterTax);
		System.out.println("���޾� : " + yearIncome);
		
		
		

	}

}
