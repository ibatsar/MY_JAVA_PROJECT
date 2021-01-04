package icehs.science.chapter06;

public class CoffeeTest {
	public static void main(String[] args) {
		Coffee ame = new Coffee();
		Coffee latte = new Coffee();
		Coffee maki = new Coffee();
		ame.name = "아메리카노";
		ame.price = 3500;
		ame.printCoffeeInfo();
		
		latte.name = "카페라떼";
		latte.price = 4000;
		latte.printCoffeeInfo();
		
		int priceSum = ame.getPrice() + latte.getPrice() + maki.getPrice();
		System.out.println("합계 : " + priceSum + "원");

}
}
