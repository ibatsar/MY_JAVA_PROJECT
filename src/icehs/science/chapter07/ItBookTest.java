package icehs.science.chapter07;

public class ItBookTest {
	public static void main(String[] args) {
		
		ItBook sql = new ItBook("sql Plus", 50000, 5.5);
		sql.printItBookInfo();
		
		ItBook java = new ItBook ("Java 2.0 ", 28000, 3.2 );
		java.printItBookInfo();
		ItBook jsp = new ItBook("JSP Servlet", 37000, 6.9);
		jsp.printItBookInfo();
		
		System.out.println("SQL Plus 의 정가와 할인율을 변경합니다.");
		sql.setPrice(55000);
		sql.setDiscountRate(9.5);
		sql.printItBookInfo();
		
		System.out.println();
		System.out.println("java 2.0의 정가를 변경합니다.");
		java.setPrice(30000);
		java.printItBookInfo();
		
		
		System.out.println();
		System.out.println("JSP Servlet의 제목과 할인율을 변경합니다.");
		jsp.setTitle("Servlet & JSP");
		jsp.setDiscountRate(12.6);
		jsp.printItBookInfo();
		
	}

}
