package trik;
import java.util.Scanner;
public class trik {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1,b=0,c=0,temp;
		String ch;
		Scanner scan = new Scanner(System.in);
		do{
		System.out.print("Enter Charactor ABC : ");
		ch = scan.next();
		}while(ch.length()>50 && ch.length() < 1);
		for(int i=0;i<ch.length();i++)
		{
			if(ch.charAt(i)=='A')
			{
				temp=a;
				a=b;
				b=c;
				c=temp;
			}else if(ch.charAt(i)=='B'){
				temp=b;
				b=c;
				c=a;
				a=temp;
			}else{
				temp=c;
				c=a;
				a=b;
				b=temp;
			}
		}
		if(a==1){System.out.print("Left");}
		else if(b==1){System.out.print("Center");}
		else {System.out.print("Right");}
	}

}
