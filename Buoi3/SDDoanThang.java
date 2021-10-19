package Buoi3;

import Buoi2.Diem;

public class SDDoanThang {

	public static void main(String[] args) {
		Diem a = new Diem(2, 5);
		Diem b = new Diem(20, 35);
		DoanThang ab = new DoanThang(a, b);
		ab.tinhTien(5, 3);
		ab.in();
		DoanThang cd = new DoanThang();
		cd.nhap();
		cd.in();
		System.out.println("Do dai cd: " + cd.doDai());
		
	}

}
