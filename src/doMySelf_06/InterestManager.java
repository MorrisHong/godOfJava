package doMySelf_06;

public class InterestManager {
	public static void main(String[] args) {
		InterestManager interestM = new InterestManager();
		double returnMoney = interestM.calculateAmount(365, 1000000 * 365);
		System.out.println(returnMoney);
	}
	
	public double getInterestRate(int day) {
		double interest = 0.0;
		if(day <= 90) {
			interest = 0.5;
		}else if(day >= 91 && day <= 180) {
			interest = 1.0;
		}else if(day >= 181 && day <= 364) {
			interest = 2.0;
		}else if(day >= 365) {
			interest = 5.6;
		}
		
		return interest;
	}
	
	public double calculateAmount(int day, long amount) {
		double interest = getInterestRate(day);
		double returnMoney = amount * ( interest / 100 );
		
		return returnMoney;
	}
}
