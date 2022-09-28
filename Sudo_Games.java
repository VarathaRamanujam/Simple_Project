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
	for(int i=1;i<=9;i++) {
		
			ls[0]=i;
			System.out.print(i+" This number is you imaged :");
			String s = sc.next();
			String yes="yes";
			if(s.equalsIgnoreCase(yes)) {
				i=10;
			}
	
	}
	System.out.println();
	System.out.println();
	for(int i=1;i<=9;i++) {
		
		ls[1]=i;
		System.out.print(i+" This number is you imaged :");
		String s = sc.next();
		String yes="yes";
		if(s.equalsIgnoreCase(yes)) {
			i=10;
		}

}System.out.println();
System.out.println();
	for(int i=1;i<=9;i++) {
		
		ls[2]=i;
		System.out.print(i+" This number is you imaged :");
		String s = sc.next();
		String yes="yes";
		if(s.equalsIgnoreCase(yes)) {
			i=10;
		}

}System.out.println();
System.out.println();
	for(int i=1;i<=9;i++) {
		
		ls[3]=i;
		System.out.print(i+" This number is you imaged :");
		String s = sc.next();
		String yes="yes";
		if(s.equalsIgnoreCase(yes)) {
			i=10;
		}

}System.out.println();
System.out.println();

	
//	ls[0]=3;
//	ls[1]=4;
//	ls[2]=7;
//	ls[3]=9;
	int j=0;
	for(int i=0;i<ls.length;i++) {
		System.out.print(ls[j]+"-"+(j+1)+" number in wrong position means type wrong: ");
		String s= sc.next();
		String s1="wrong";
		if(s.equalsIgnoreCase(s1)) {
			j++;
			//int temp =ls[0];
			ls[j]=ls[0];
		}else
			i=i+10;
				
	}
	 j=0;
	for(int i=0;i<ls.length;i++) {
		System.out.print(ls[j+1]+"-"+(j+1)+" number in wrong position means type wrong: ");
		String s= sc.next();
		String s1="wrong";
		if(s.equalsIgnoreCase(s1)) {
			j++;
			//int temp =ls[0];
			ls[j]=ls[1];
		}else
			i=i+10;
				
	}
	 j=0;
		for(int i=0;i<ls.length;i++) {
			System.out.print(ls[j+2]+"-"+(j+1)+" number in wrong position means type wrong: ");
			String s= sc.next();
			String s1="wrong";
			if(s.equalsIgnoreCase(s1)) {
				j++;
				//int temp =ls[0];
				ls[j]=ls[1];
			}else
				i=i+10;
					
		}
		 j=0;
			for(int i=0;i<ls.length;i++) {
				System.out.print(ls[j+3]+"-"+(j+1)+" number in wrong position means type wrong: ");
				String s= sc.next();
				String s1="wrong";
				if(s.equalsIgnoreCase(s1)) {
					j++;
					//int temp =ls[0];
					ls[j]=ls[1];
				}else
					i=i+10;
						
			}
	
	
	
for(int i=0;i<ls.length;i++)
	System.out.println(ls[i]);
	}

}
