package javaders;
import java.util.Scanner;

public class Javaa {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		 
		 System.out.print("1. Sayiyi giriniz: ");
	        int sayi1 = scan.nextInt();
	       
	        System.out.print("2. Sayiyi giriniz: ");
	        int sayi2 = scan.nextInt();
	        
	        if (sayi1>sayi2)
	        {
	        	System.out.print(sayi1 + " " + "sayısı " + sayi2 + " " + "sayısından büyüktür");
	        }
	        
	        else if (sayi2>sayi1)
	        {
	        	System.out.print(sayi2 + " " + "sayısı " + sayi1 + " " + "sayısından büyüktür");
	        }
	        
	        else if (sayi1==sayi2)
	        {
	        	System.out.print(sayi1 + " " + "ve " + sayi2 + " " + "sayıları eşittir");
	        }
	        
	        else
	        {
	        	System.out.print("Hatali komut");
	        }

	}

}
