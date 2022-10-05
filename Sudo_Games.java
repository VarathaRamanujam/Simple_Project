package Simple_Projects;

import java.util.Scanner;

public class Sudo_Games {

public static void main(String[] args) {
		Sudo_Games obj = new Sudo_Games();
		obj.Sudo_Games_1();
	}
Scanner sc = new Scanner (System.in);

	private void Sudo_Games_1() {
	int ls[] = new int[4];
//	for(int i=1;i<=9;i++) {
//		
//			ls[0]=i;
//			System.out.print(i+" This number is you imaged :");
//			String s = sc.next();
//			String yes="yes";
//			if(s.equalsIgnoreCase(yes)) {
//				i=10;
//			}
//	
//	}
//	System.out.println();
//	System.out.println();
//	for(int i=1;i<=9;i++) {
//		
//		ls[1]=i;
//		System.out.print(i+" This number is you imaged :");
//		String s = sc.next();
//		String yes="yes";
//		if(s.equalsIgnoreCase(yes)) {
//			i=10;
//		}
//
//}System.out.println();
//System.out.println();
//	for(int i=1;i<=9;i++) {
//		
//		ls[2]=i;
//		System.out.print(i+" This number is you imaged :");
//		String s = sc.next();
//		String yes="yes";
//		if(s.equalsIgnoreCase(yes)) {
//			i=10;
//		}
//
//}System.out.println();
//System.out.println();
//	for(int i=1;i<=9;i++) {
//		
//		ls[3]=i;
//		System.out.print(i+" This number is you imaged :");
//		String s = sc.next();
//		String yes="yes";
//		if(s.equalsIgnoreCase(yes)) {
//			i=10;
//		}
//
//}System.out.println();
//System.out.println();

int ls1[] = new int[ls.length];	
	ls[0]=3;
	ls[1]=4;
	ls[2]=7;
	ls[3]=9;
	
	for(int i=0;i<ls.length;i++) {
		System.out.print(ls[i]+"-"+(1)+"st  position wrong means type : ");
		String s= sc.next();
		String s1="wrong";
		ls1[0]=ls[i];
		if(s.equalsIgnoreCase(s1)) {

			int temp =ls[i];
			ls1[0]=ls[i];
			
		}
		else {
			ls[i]=0;
			i=i+10;
		}	
		//System.out.println(ls1[0]);		
	}

	for(int i=0;i<ls.length;i++) {
		if(ls[i]>0) {
			ls1[1]=ls[i];
		System.out.print(ls[i]+"-"+(2)+"st  position wrong means type : ");
		String s= sc.next();
		String s1="wrong";
		if(s.equalsIgnoreCase(s1)) {

			//int temp =ls[0];
			ls1[1]=ls[i];
		}else {
			ls[i]=0;
			i=i+10;
		}
		}else
			continue;
		//System.out.println(i);		
	}


	for(int i=0;i<ls.length;i++) {
		if(ls[i]>0) {
			ls1[2]=ls[i];
		System.out.print(ls[i]+"-"+(3)+"st  position wrong means type : ");
		String s= sc.next();
		String s1="wrong";
		if(s.equalsIgnoreCase(s1)) {

			//int temp =ls[0];
			ls1[2]=ls[i];
		}else {
			ls[i]=0;
			i=i+10;
		}}else
			continue;
		//System.out.println(i);		
	}
		
	for(int i=0;i<ls.length;i++) {
		if(ls[i]>0) {
			ls1[3]=ls[i];
		System.out.print(ls[i]+"-"+(4)+"st  position wrong means type : ");
		String s= sc.next();
		String s1="wrong";
		if(s.equalsIgnoreCase(s1)) {

			//int temp =ls[0];
			ls1[3]=ls[i];
		}else {
			ls[i]=0;
			i=i+10;
		}}else
			continue;
		//System.out.println(i);		
	}
	
	
	
for(int i=0;i<ls1.length;i++)
	System.out.println(ls1[i]);
	}

}
