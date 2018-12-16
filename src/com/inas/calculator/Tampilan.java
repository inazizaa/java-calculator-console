package com.inas.calculator;

	import java.util.Scanner;
	
	public class Tampilan {

		 public static void main(String[] args)
		    {
	 Scanner input = new Scanner(System.in);

	 System.out.print("Selamat datang di kalkulator console, silahkan login untuk menghitung :)\n");
	 System.out.print("Username: ");
	 String user = input.next();

	 System.out.print("Password: ");
	 String pwd = input.next();
	 if (user.equals("admin") && pwd.equals("root"))
	 {
	     System.out.println("#######################");
	     System.out.println("= Anda berhasil login =");
	     System.out.println("#######################");
	     Main hitung = new Main();
	     hitung.getBilangan1();
	     hitung.getBilangan2();
	     hitung.getOperasi();
	     hitung.hitung();
	 }
	 else
	 {
	     System.out.println("=====================================");
	     System.out.println("= Username atau password anda salah =");
	     System.out.println("=====================================");
	     System.exit(0);
	 }
		}
}
