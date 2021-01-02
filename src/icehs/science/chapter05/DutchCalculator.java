package icehs.science.chapter05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DutchCalculator {
	public static void main(String[] args) {
		int numOfTimes = 0;
		int partmoney = 0;
		int totalExpense = 0;
		System.out.println("모임이 몇차까지 진행되었나요");
		numOfTimes = getUserInput();
		System.out.println("=============================");
		System.out.println("각 차수에 쓴 비용을 입력하세요,");
		for (int i = 1; i <= numOfTimes; i++) {
			System.out.println(i + "차 비용 : ");
			totalExpense += getUserInput();
			
		}
		System.out.println("총 비용은" + totalExpense + "원 입니다.");
		System.out.println("=============================");
		System.out.print("모임의 인원을 입력하세요.");
		int numOfPeople = getUserInput();
		partmoney = totalExpense / numOfPeople;
		System.out.println("===================");
		for ( int i = 1; i <= numOfPeople ; i ++ ){
			
			
		
			if(i == numOfPeople) {
				System.out.println(i + " : " + partmoney + "원");
			}else {
				System.out.println(i + " : " + partmoney + "원");
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
