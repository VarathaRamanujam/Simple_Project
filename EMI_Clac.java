package Simple_Projects;

import java.util.Scanner;

public class EMI_Clac {
Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		EMI_Clac obj = new EMI_Clac();
		obj.EMI_Clac_3months();
		//obj.EMI_Clac_months(0.0f);
	}

	private void EMI_Clac_months(float d,int year,double amount) {
		System.out.println("3 Months once ");
		float count=0;
		count=(amount*d*(1+d));
	    System.out.println(count *((year*12)/3)+" payed in 3 months");
	    count=(float) (amount*((d-2)/100));
	    System.out.println(count *((year*12)/6)+" payed in 6 months");
	    count=(float) (amount*((d)/100));
	    System.out.println(count *((year*12)/12)+" payed in 12 months");
	}

	private void EMI_Clac_3months() {
		System.out.print("Enter a amount : ");
		double amount =sc.nextDouble();
		//System.out.print("Enter your interest : ");
		float rate_of_interest = 0;//sc.nextFloat();
		
		System.out.print("Enter your Tenure : ");
		int year = sc.nextInt();
		if(year>0 && year<=5) {
			rate_of_interest=8;
			//year=5;
		}else if(year>5 && year<=10) {
			rate_of_interest=10;
			//year=10;
		}else if(year>10 && year<=15) {
			rate_of_interest=12;
			//year=15;
		}else
			rate_of_interest=20;
		    //year=25;
		
		EMI_Clac_months(rate_of_interest,year,amount);
		
		
		
		
		
//		double total = amount*(rate_of_interest/100);
//		System.out.println(total+amount);
		
	}

}
