package Buoi4;

import java.util.Scanner;

import Buoi3.SinhVien;
public class SinhVienCNTT extends SinhVien{
	private String taikhoan, matkhau, email;
	
	public SinhVienCNTT() {
		super();
		taikhoan = new String();
		matkhau = new String();
		email = new String();
	}
	
	public SinhVienCNTT(SinhVienCNTT S) {
		super(S);
		taikhoan = new String(S.taikhoan);
		matkhau = new String(S.matkhau);
		email = new String(S.email);
	}
	
	@Override
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		super.nhap();
		System.out.print("Nhap so mon hoc: ");
		int n = sc.nextInt();
		sc.nextLine();
		for(int i = 0; i < n; i++) {
			System.out.print("Nhap mon hoc: ");
			String mon = sc.nextLine();
			super.dky(mon);
		}	
		super.nhapDiem();
		System.out.print("Nhap tai khoan: ");
		taikhoan = sc.nextLine();
		System.out.print("Nhap mat khau: ");
		matkhau = sc.nextLine();
		System.out.print("Nhap email: ");
		email = sc.nextLine();
		
	}
	
	@Override
	public void in() {
		super.in();
		System.out.println("Tai khoan: " + taikhoan + ", Email: " + email);
	}
	
	public String toString() {
		return "tai khoan: " + taikhoan + " email: " + email;
	}
	
	public void doiMK(String m1) {
		matkhau = new String(m1);
	}
	
	@Override
	public String layEmail() {
		return email;
	}
	
	@Override
	public String layUser() {
		return taikhoan;
	}
	

}
