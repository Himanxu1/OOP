package Buoi4;

import java.util.Scanner;

public abstract class ConVat {
	private String giong, maulong;
	private float cannang;
	
	public abstract void Keu();
	
	public ConVat() {
		giong = new String();
		maulong = new String();
		cannang = 0.0f;
	}
	
	public ConVat(ConVat d) {
		giong = new String(d.giong);
		maulong = new String(d.maulong);
		cannang = d.cannang;
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap giong: ");
		giong = sc.nextLine();
		System.out.print("Nhap mau long: ");
		maulong = sc.nextLine();
		System.out.print("Nhap can nang: ");
		cannang = sc.nextInt();
	}
	
	public void in() {
		System.out.print(giong + ", mau: "  + maulong + ", can nang: " + cannang + " ");
	}
	
	public String toString() {
		return giong + ", mau: "  + maulong + ", can nang: " + cannang + " ";
	}
}


