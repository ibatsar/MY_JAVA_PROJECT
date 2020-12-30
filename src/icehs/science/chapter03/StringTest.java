package icehs.science.chapter03;

public class StringTest {

	public static void main(String[] args) {
		String sejong = "¼¼Á¾´ë¿Õ";
		String money = "10000";
		String thisYear = "2017";
		int intYear = Integer.parseInt(thisYear);
		
		System.out.println(sejong + " : " + money);
		
		System.out.println(thisYear + "³â");
		System.out.println(money + thisYear);
		System.out.println(intYear + Integer.parseInt(money));
		// TODO Auto-generated method stub

	}

}
