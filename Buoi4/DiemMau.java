package Buoi4;

import java.util.Scanner;

import Buoi2.Diem;
public class DiemMau extends Diem{
	private String mau;
	
	public DiemMau() {
		super();
		mau = new String();
	}
	
	public DiemMau(int x1, int y1, String mau) {
		super(x1, y1);
		mau = new String();
	}
	
	public DiemMau(DiemMau d) {
		super(d);
		mau = new String(d.mau);
	}
	
	public void GanMau(String m1) {
		 mau = new String(m1);
	}
	
	public void GanMau(int x1, int y1, String m1) {
		super.gan(x1, y1);
		mau = new String(m1);
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		super.nhapDiem();
		System.out.print("Nhap mau: ");
		mau = sc.nextLine();
	}
	
	public void in() {
		super.hienThi();
		System.out.println(", Voi mau: " + mau);
	}
	
	public String toString() {
		return super.toString() + ", Voi mau: " + mau;
	}

}
