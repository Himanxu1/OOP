package Buoi5;

import java.util.Scanner;

import Buoi2.Date;
public class KhachHangVip extends KhachHang{
	private float tile;
	private Date d;
	public KhachHangVip() {
		super();
		tile = 0.15f;
		d = new Date();
	}
	public KhachHangVip(KhachHangVip KV) {
		super(KV);
		tile = KV.tile;
		d = new Date(KV.d);
	}
	public void nhap() {
		super.nhap();
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap ti le giam: ");
		tile = sc.nextFloat();
	}
	public void in() {
		super.in();
		System.out.println("Giam: " + tile);
	}
	public float giam() {
		ChiTiet c = new ChiTiet();
		float g = 1.0f;
		g = c.layDonGia() * tile;
		return g;
	}
}
