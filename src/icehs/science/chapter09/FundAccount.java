package icehs.science.chapter09;

public class FundAccount extends Account {
	
	private double earningRate;
	
	public FundAccount ( String number, String name, int balance, double earningRate) {
		super(number, name, balance);
		this.earningRate = earningRate;
		
		
	}

	public double getEarningRate() {
		return earningRate;
	}

	public void setEarningRate(double earningRate) {
		this.earningRate = earningRate;
	}
	public void earnMoney() {
		System.out.println("수익률 : " + this.earningRate + "%");
		System.out.println("수익이 발생했습니다.");
		
	}
	@Override
	public void openAccount() {
		System.out.println("계좌를 계설합니다.");
		System.out.print("펀드 ");
		super.openAccount();
		this.earnMoney();
	}
	

}
