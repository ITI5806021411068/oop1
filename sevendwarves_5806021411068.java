package sevendwarves;
import java.util.Scanner;
public class sevendwarves {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pN1,pN2,pN3,pN4,pN5,pN6,pN7,pN8,pN9;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter PN1 : ");
		pN1 = scan.nextInt();
		while(pN1<0 || pN1 >100){
			System.out.print("Enter PN1 Again : ");
			pN1 = scan.nextInt();
		}
		//
		System.out.print("Enter PN2 : ");
		pN2 = scan.nextInt();
		while(pN2<0 || pN2 >100){
			System.out.print("Enter PN2 Again : ");
			pN2 = scan.nextInt();
		}
		//
		System.out.print("Enter PN3 : ");
		pN3 = scan.nextInt();
		while(pN3<0 || pN3 >100){

			System.out.print("Enter PN3 Again : ");
			pN3 = scan.nextInt();
		}
		//
		System.out.print("Enter PN4 : ");
		pN4 = scan.nextInt();
		while(pN4<0 || pN4 >100){

			System.out.print("Enter PN4 Again : ");
			pN4 = scan.nextInt();
		}
		//
		System.out.print("Enter PN5 : ");
		pN5 = scan.nextInt();
		while(pN5<0 || pN5 >100){

			System.out.print("Enter PN5  Again : ");
			pN5 = scan.nextInt();
		}
		//
		System.out.print("Enter PN6 : ");
		pN6 = scan.nextInt();
		while(pN6<0 || pN6 >100){

			System.out.print("Enter PN6 Again : ");
			pN6 = scan.nextInt();
		}
		//
		System.out.print("Enter PN7 : ");
		pN7 = scan.nextInt();
		while(pN7<0 || pN7 >100){

			System.out.print("Enter PN7 Again : ");
			pN7 = scan.nextInt();
		}
		//
		System.out.print("Enter PN8 : ");
		pN8 = scan.nextInt();
		while(pN8<0 || pN8 >100){

			System.out.print("Enter PN8 Again : ");
			pN8 = scan.nextInt();
		}
		//
		System.out.print("Enter PN9 : ");
		pN9 = scan.nextInt();
		while(pN9<0 || pN9 >100){

			System.out.print("Enter PN9 Again : ");
			pN9 = scan.nextInt();
		}
		//
		if(pN3+pN4+pN5+pN6+pN7+pN8+pN9 == 100){
			System.out.print("pN1 And pN2  No stunt");}
		else if(pN2+pN7+pN3+pN4+pN5+pN8+pN9 == 100){
			System.out.print("pN1 And pN3  No stunt");}
		else if(pN5+pN2+pN3+pN6+pN7+pN8+pN9 == 100){
			System.out.print("pN1 And pN4  No stunt");}
		else if(pN2+pN4+pN3+pN6+pN7+pN8+pN9 == 100){
			System.out.print("pN1 And pN5  No stunt");}
		else if(pN2+pN3+pN5+pN4+pN7+pN8+pN9 == 100){
			System.out.print("pN1 And pN6  No stunt");}
		else if(pN2+pN3+pN5+pN6+pN4+pN8+pN9 == 100){
			System.out.print("pN1 And pN7  No stunt");}
		else if(pN2+pN3+pN5+pN6+pN7+pN4+pN9 == 100){
			System.out.print("pN1 And pN8  No stunt");}
		else if(pN2+pN3+pN5+pN6+pN7+pN8+pN4 == 100){
			System.out.print("pN1 And pN9  No stunt");}
		else if(pN5+pN1+pN3+pN6+pN7+pN8+pN9 == 100){
			System.out.print("pN2 And pN4  No stunt");}
		else if(pN1+pN4+pN3+pN6+pN7+pN8+pN9 == 100){
			System.out.print("pN2 And pN5  No stunt");}
		else if(pN1+pN3+pN5+pN4+pN7+pN8+pN9 == 100){
			System.out.print("pN2 And pN6  No stunt");}
		else if(pN1+pN3+pN5+pN6+pN4+pN8+pN9 == 100){
			System.out.print("pN2 And pN7  No stunt");}
		else if(pN1+pN3+pN5+pN6+pN7+pN4+pN9 == 100){
			System.out.print("pN2 And pN8  No stunt");}
		else if(pN1+pN3+pN5+pN6+pN7+pN8+pN4 == 100){
			System.out.print("pN2 And pN9  No stunt");}
		else if(pN5+pN2+pN1+pN6+pN7+pN8+pN9 == 100){
			System.out.print("pN3 And pN4  No stunt");}
		else if(pN2+pN4+pN1+pN6+pN7+pN8+pN9 == 100){
			System.out.print("pN3 And pN5  No stunt");}
		else if(pN2+pN1+pN5+pN4+pN7+pN8+pN9 == 100){
			System.out.print("pN3 And pN6  No stunt");}
		else if(pN2+pN1+pN5+pN6+pN4+pN8+pN9 == 100){
			System.out.print("pN3 And pN7  No stunt");}
		else if(pN2+pN1+pN5+pN6+pN7+pN4+pN9 == 100){
			System.out.print("pN3 And pN8  No stunt");}
		else if(pN2+pN1+pN5+pN6+pN7+pN8+pN4 == 100){
			System.out.print("pN3 And pN9  No stunt");}
		else if(pN2+pN3+pN1+pN6+pN7+pN8+pN9 == 100){
			System.out.print("pN4 And pN5  No stunt");}
		else if(pN2+pN1+pN5+pN3+pN7+pN8+pN9 == 100){
			System.out.print("pN4 And pN6  No stunt");}
		else if(pN2+pN1+pN5+pN6+pN3+pN8+pN9 == 100){
			System.out.print("pN4 And pN7  No stunt");}
		else if(pN2+pN1+pN5+pN6+pN7+pN3+pN9 == 100){
			System.out.print("pN4 And pN8  No stunt");}
		else if(pN2+pN1+pN5+pN6+pN7+pN8+pN3 == 100){
			System.out.print("pN4 And pN9  No stunt");}
		else if(pN2+pN1+pN4+pN3+pN7+pN8+pN9 == 100){
			System.out.print("pN5 And pN6  No stunt");}
		else if(pN2+pN1+pN4+pN6+pN3+pN8+pN9 == 100){
			System.out.print("pN5 And pN7  No stunt");}
		else if(pN2+pN1+pN4+pN6+pN7+pN3+pN9 == 100){
			System.out.print("pN5 And pN8  No stunt");}
		else if(pN2+pN1+pN4+pN6+pN7+pN8+pN3 == 100){
			System.out.print("pN5 And pN9  No stunt");}
		else if(pN2+pN1+pN4+pN5+pN3+pN8+pN9 == 100){
			System.out.print("pN6 And pN7  No stunt");}
		else if(pN2+pN1+pN4+pN5+pN7+pN3+pN9 == 100){
			System.out.print("pN6 And pN8  No stunt");}
		else if(pN2+pN1+pN4+pN5+pN7+pN8+pN3 == 100){
			System.out.print("pN6 And pN9  No stunt");}
		else if(pN2+pN1+pN4+pN5+pN6+pN3+pN9 == 100){
			System.out.print("pN7 And pN8  No stunt");}
		else if(pN2+pN1+pN4+pN5+pN6+pN8+pN3 == 100){
			System.out.print("pN7 And pN9  No stunt");}
		else if(pN2+pN1+pN4+pN5+pN6+pN7+pN3 == 100){
			System.out.print("pN8 And pN9  No stunt");
		}
	}

}
