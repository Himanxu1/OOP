package Buoi5;

import java.util.Scanner;

import Buoi2.Date;;
public class KhachHang {
	private String hten, dchi;
	private boolean gtinh;
	private Date nsinh;
	public KhachHang() {
		hten = new String();
		dchi = new String();
		gtinh = true;
		nsinh = new Date();
	}
	public KhachHang(KhachHang K) {
		hten = new String(K.hten);
		dchi = new String(K.dchi);
		gtinh = K.gtinh;
		nsinh = new Date(K.nsinh);
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap ho ten khach hang: ");
		hten = sc.nextLine();
		System.out.print("Nhap dia chi: ");
		dchi = sc.nextLine();
		System.out.print("Nhap gioi tinh(nam = true/nu = false): ");
		gtinh = sc.nextBoolean();
		System.out.println("Nhap ngay thang nam sinh: ");
		nsinh.nhap();
	}
	public void in() {
		System.out.println("\tHo ten: " + hten);
		System.out.println("\tDia chi: " + dchi);
		if(gtinh)
			System.out.println("\tGioi tinh: Nam");
		else
			System.out.println("\tGioi tinh: Nu");
		System.out.print("\tNgay sinh: ");	nsinh.in();
	}
	public float giam() {
		return 1;
	}
}
