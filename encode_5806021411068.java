package encode;

import java.util.Scanner;

public class ec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ch1,ch2;
		char ch;
			
		Scanner sc= new Scanner(System.in);
		System.out.print("Input String : ");
		ch1=sc.nextLine();
		ch2=ch1.toUpperCase();
		
		sc.close();
		
		for(int i=ch2.length()-1;i>=0;i--){
			ch=ch2.charAt(i);
			
			if(ch=='R' && ch=='r'){
				ch='E';
			}
			else if(ch=='W' && ch=='w'){
				ch='R';
			}
			else if(ch=='E' && ch=='e'){
				ch='W';
			}
			System.out.print(ch);
		}
	}

}
