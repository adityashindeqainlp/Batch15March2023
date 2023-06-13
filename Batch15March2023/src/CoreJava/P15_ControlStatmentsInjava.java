package CoreJava;

/**
 * aditya shinde Java + Selenium Core 07-Jun-2023 11:09:47 am
 */
public class P15_ControlStatmentsInjava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int age = 20;

		// Type 1 if Statement
		if (age > 18) {
			System.out.println("Allowed to drive a vehicle");
		}

		// Type 2 if else Statement
		if (age > 18) {
			System.out.println("Allowed to drive a vehicle");
		} else {
			System.out.println("Not allowed to drive a vehicle");
		}

		/*
		 * Type 3 if-else ladder Income Tax Slab on the basis of salary per annum
		 */

		int salary = 350000;

		if (salary < 100000) {

			System.out.println("Not applicable for income tax ");
		} else if (salary > 100000 && salary < 300000) {

			double taxPer = 0.05 * salary;

			System.out.println("5% Tax apply on the Total Salary : " + taxPer);

		} else if (salary > 300000 && salary < 700000) {

			double taxPer = 0.075 * salary;

			System.out.println("7.5% Tax apply on the Total Salary : " + taxPer);
		} else if (salary > 700000) {

			double taxPer = 0.09 * salary;

			System.out.println("9% Tax apply on the Total Salary : " + taxPer);
		}
		
		
		
		int income =  20000;
		int bonus = 5000;
		
		
		if(income==20000) {
			
			if(bonus==5000) {
				
				int grossIncome =  income + bonus;
				
				System.out.println("Gross Income : "+ grossIncome);
				
			}
		}else {
			
			System.out.println("income and bonus values are not matching ");
		}
		
		
		
		

	}

}
