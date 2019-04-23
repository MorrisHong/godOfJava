package doMySelf_05;

public class SalaryManager {
	public static void main(String[] args) {
		SalaryManager sm = new SalaryManager();
		System.out.println(sm.getMonthlySalary(20000000));
	}
	public double getMonthlySalary(int yearlySalary) {
		double monthlySalary = yearlySalary / 12.0;

		double incomeTaxDeduction = calculateTax(monthlySalary);
		double nationalPentionDeduction = calculateNationalPention(monthlySalary);
		double healthInsuranceDeduction = calculateHealthInsurance(monthlySalary);
		
		double taxSum = incomeTaxDeduction + nationalPentionDeduction + healthInsuranceDeduction;
		
		monthlySalary -= taxSum;
		
		return monthlySalary;
	}
	
	public double calculateTax(double monthlySalary) {
		double incomeTax = 12.5;
		return monthlySalary * (incomeTax / 100);
	
	}
	
	public double calculateNationalPention(double monthlySalary) {
		double pention = 8.1;
		return monthlySalary  * ( pention / 100);
	}
	
	public double calculateHealthInsurance(double monthlySalary) {
		double healthInsurance = 13.5;
		return monthlySalary * ( healthInsurance / 100 );
	}
	
}
