package Buoi5;

import java.util.Scanner;

public class ChiTiet {
	private HangHoa h;
	private int sl;
	private long dg;
	public ChiTiet() {
		h = new HangHoa();
		sl = 0;
		dg = 0L;
	}
	public ChiTiet(ChiTiet c) {
		h = new HangHoa(c.h);
		sl = c.sl;
		dg = c.dg;
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		h.nhap();
		System.out.print("Nhap so luong: ");
		sl = sc.nextInt();
		System.out.print("Nhap don gia: ");
		dg = sc.nextLong();
	}
	public void in() {
		h.in();
		System.out.println("\tSo luong: " + sl);
		System.out.println("\tDon gia: " + dg*sl + "d");
	}
	public long layDonGia() {
		return dg;
	}
}
