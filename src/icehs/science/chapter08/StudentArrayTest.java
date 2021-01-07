package icehs.science.chapter08;

public class StudentArrayTest {
	public static void main(String[] args) {
		
		Student [] st = new Student[3];
		
		st[0] = new Student ("강감찬", "STU001", "010-1234-5678");
		st[1] = new Student ("이순신", "STU002", "010-2345-6789");
		st[2] = new Student ("김유신", "STU003", "010-9876-5432");
		
		for (int i = 0 ; i < st.length; i++) {
			st[i].printStudentInfo();
		}
	}

}
