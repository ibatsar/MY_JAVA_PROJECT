package icehs.science.chapter05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DutchCalculator {
	public static void main(String[] args) {
		int numOfTimes = 0;
		int partmoney = 0;
		int totalExpense = 0;
		System.out.println("������ �������� ����Ǿ�����");
		numOfTimes = getUserInput();
		System.out.println("=============================");
		System.out.println("�� ������ �� ����� �Է��ϼ���,");
		for (int i = 1; i <= numOfTimes; i++) {
			System.out.println(i + "�� ��� : ");
			totalExpense += getUserInput();
			
		}
		System.out.println("�� �����" + totalExpense + "�� �Դϴ�.");
		System.out.println("=============================");
		System.out.print("������ �ο��� �Է��ϼ���.");
		int numOfPeople = getUserInput();
		partmoney = totalExpense / numOfPeople;
		System.out.println("===================");
		for ( int i = 1; i <= numOfPeople ; i ++ ){
			
			
		
			if(i == numOfPeople) {
				System.out.println(i + " : " + partmoney + "��");
			}else {
				System.out.println(i + " : " + partmoney + "��");
				totalExpense -= partmoney;
			
				
			}
			
			
		}
		
	}
	public static int getUserInput() {
        
        BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
        String inputString = null;
        
        try {
            inputString = br.readLine();
        } catch ( IOException e ) {
            e.printStackTrace();
        }
        
        return Integer.parseInt( inputString );
    }
}
