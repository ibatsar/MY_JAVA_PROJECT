package icehs.science.chapter09;

public class Teacher extends Person {
	private String Subject;
	
	
	@Override 
	public void eat() {
		super.eat();
		System.out.println("���� �Ļ縦 �մϴ�.");
	}
	public void teach () {
		System.out.println("����Ĩ�ϴ�.");
	}

}

