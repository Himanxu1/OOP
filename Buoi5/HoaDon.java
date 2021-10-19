package Buoi5;

import java.util.Scanner;

import Buoi2.Date;

public class HoaDon {
	private String ms, tieude;
	private Date d;
	private KhachHang k;
	private ChiTiet c[];
	private int n;
	private long tongTien;
	public HoaDon() {
		ms = new String();
		tieude = new String();
		d = new Date();
		k = new KhachHang();
		c = new ChiTiet[20];
		n = 0;
		tongTien = 0L;
	}
	public HoaDon(HoaDon h) {
		ms = new String(h.ms);
		tieude = new String(h.tieude);
		d = new Date(h.d);
		k = new KhachHang(h.k);
		c = new ChiTiet[20];
		n = h.n;
		tongTien = h.tongTien;
		for(int i = 0; i < n; i++)
			c[i] = new ChiTiet(h.c[i]);
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap ma so: ");
		ms = sc.nextLine();
		System.out.print("Nhap tieu de: ");
		tieude = sc.nextLine();
		System.out.println("Nhap ngay thang nam: ");
		d.nhap();
		System.out.println("Nhap thong tin khach hang: Khach Hang Thuong(1)	Khach Hang Vip(2)");
		int check;
		check = sc.nextInt();
		if(check == 2)
			k = new KhachHangVip();
		k.nhap();
		System.out.println("Nhap thong tin hang hoa:");
		System.out.print("Nhap so luong hang: ");
		n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			c[i] = new ChiTiet();
			c[i].nhap();
			tongTien += c[i].layDonGia();
		}
	}
	public void in() {
		System.out.println();
		System.out.println("Ma so: " + ms);
		System.out.println("\t" + tieude);
		System.out.print("Ngay: ");
		d.in();
		System.out.println("Thong tin khach hang:");
		k.in();
		System.out.println("Thong tin hang hoa:");
		for(int i = 0; i < n; i++)
			c[i].in();
		System.out.println("Tong tien: " + tongTien + "d");
	}
}
