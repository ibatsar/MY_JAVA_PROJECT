package icehs.science.chapter07;

public class ReferenceValuePrint {
	public static void main(String[] args) {
		
		Publication pub1 = new Publication("��ȭ �ﱹ��" , 5000, 300);
		System.out.println(pub1.numberOfObjects);
		
		Publication pub2 = new Publication();
		System.out.println(pub2.numberOfObjects);
		System.out.println(pub1.numberOfObjects);
		System.out.println(Publication.numberOfObjects);
		int intValue = 10;
		
		System.out.print("publicaiton1 ��ü ���� �ּҰ� :");
		System.out.println(pub1);
		
		System.out.print("publication2 ��ü ���� �ּҰ� :");
		System.out.println(pub2);
		
		System.out.println("int ���� ���尪 : ");
		System.out.println( intValue);
		
		
		
		
		
	}

}
