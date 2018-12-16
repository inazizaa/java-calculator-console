package com.inas.calculator;

import java.util.Scanner;

public class Main {
	double bil1;
	 double bil2;
	 double hasil;
	 int Operasi;
	 Scanner input;
	 
	 public void getBilangan1() {
		 System.out.println("Masukkan Bilangan 1 : ");
		 input = new Scanner(System.in);
		 bil1 = input.nextDouble();
	 }
	 
	 public void getBilangan2() {
		 System.out.println("Masukkan Bilangan 2 : ");
		 input = new Scanner(System.in);
		 bil2 = input.nextDouble();
	 }
	 
	 public void getOperasi() {
		 System.out.println("Masukkan Operasi : ");
		 System.out.println(" 1.Tambah \n 2.Kurang \n 3.Kali \n 4.Bagi ");
		 input = new Scanner(System.in);
		 Operasi = input.nextInt();
	 }
	 
	 public void hitung() {
		 double result = 0;
		 if(Operasi == 1) {
			 result = bil1 + bil2;
		 }else if(Operasi == 2) {
			 result = bil1 - bil2;
		 }else if(Operasi == 3) {
			 result = bil1 * bil2;
		 }else if(Operasi == 4) {
			 result = bil1 / bil2;
		 }
		 System.out.println("Hasil hitungnya adalah : " + result);
		 
		 
	 }
}
