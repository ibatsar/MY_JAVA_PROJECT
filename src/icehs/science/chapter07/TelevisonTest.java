package icehs.science.chapter07;

public class TelevisonTest {
	
	public static void main(String[] args) {
		
		Television infinia = new Television ("INFINIA", 1000000);
		infinia.printTelevisonInfo();
		
		Television xcanvas = new Television("XCANVAS", 2000000, "LCD TV");
		xcanvas.printTelevisonInfo();
		
		Television cinema = new Television("CINEMA", 2000000, "3D TV");
		cinema.printTelevisonInfo();
		
		
	}

}
