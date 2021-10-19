package Buoi5;

import java.util.Scanner;

import Buoi2.Date;

public class HangHoa {
	private String ten; 
	private Date nsx;
	public HangHoa() {
		ten = new String();
		nsx = new Date();
	}
	public HangHoa(HangHoa h) {
		ten = new String(h.ten);
		nsx = new Date(h.nsx);
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap ten hang: ");
		ten = sc.nextLine();
		System.out.println("Nhap ngay san xuat: ");
		nsx.nhap();
	}
	public void in() {
		System.out.println("\tTen hang: " + ten);
		System.out.println("\tNgay san xuat: " + nsx);
	}
}
