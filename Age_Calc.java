package Simple_Projects;
import java.util.Scanner;
public class Age_Calc {
	public static void main(String[] args) {
		Age_Calc obj = new Age_Calc();
		obj.Age_Calc_simple();
	}
    Scanner sc = new Scanner (System.in);
	private void Age_Calc_simple() {
		int count=0;	
	int ls[] = {31,28,31,30,31,30,31,31,30,31,30,31};
	System.out.print("Enter your Month : ");
	int Month =sc.nextInt()+1;
	//Month=7;
	System.out.print("Enter your Date : "); 
	int date =sc.nextInt();
		date = ls[Month]-date;
		for(int i=Month;i<ls.length;i++)
			count+=ls[i];
			
		int count1=0;
		int current_year=2022;
		System.out.print("Enter your  birth year: ");
		int birth_year=sc.nextInt();
		//birth_year = 2001;
		
		if(birth_year<current_year) {
			count1=current_year-birth_year;
			count1*=365;
			int j=1;
			int find=0;
			int count2=0;
		for(int i=birth_year+1;i<current_year;i++) {		
			int unit=0;
		    int tens=0;
		    unit=i%10;
		    find=i/10;
		    tens=find%10;
		    if(unit==0 && tens==0) {
		    	if(i%400==0)
		    		count2++;
		    }else {
		    	if(i%4==0)
		    		count2++;
		    }      
		    //i=birth_year+(j++);   //count2-leap count-remainingmonth count1-year*month
		}
		System.out.println(current_year-birth_year+" Age");
		System.out.println(count+count1+count2-(ls[9]+ls[10]+ls[11])+" Days ");
		System.out.println((count+count1+count2-(ls[9]+ls[10]+ls[11]))*24+" Hours ");	
		}	
	}
}
