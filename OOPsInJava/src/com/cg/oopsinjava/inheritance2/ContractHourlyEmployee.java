package com.cg.oopsinjava.inheritance2;

	public class ContractHourlyEmployee extends HourlyEmployee{
		
		float noOfYears_Contract;
		float noOfYears_Completed;
		
		void readNoOfYears_Contract() {
			System.out.println("Enter the noOfYears_Contract ");
			noOfYears_Contract = sc.nextFloat();
		}
		
		void isContractedCompleted() {
			if(noOfYears_Completed == noOfYears_Contract) {
				System.out.println("Contract Completed");
			}else {
				System.out.println("Contract not completed");
			}
		}

	}

