package Buoi3;

import java.util.Scanner;

public class SDGach {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so luong gach lot nen: ");
		int n = sc.nextInt();
		Gach ds[];
		ds = new Gach[n];
		for(int i = 0; i < n; i++)
			ds[i] = new Gach();
		for(int i = 0; i < n; i++){
			System.out.println("Nhap loai gach thu " + (i+1) + ": ");
			ds[i].nhap();
		}
		System.out.println("Thong tin cac loai gach: ");
		for(int i = 0; i < n; i++){
			ds[i].in();
			System.out.println("Gia ban le cua 1 vien gach la: " + ds[i].giaBanLe() + "$");
			System.out.print("Dien tich toi da co the lot cua 1 hop gach la: ");
			System.out.println(ds[i].dienTichNen() + "cm2");
		}
		float max = Float.MIN_VALUE;
		for(int i = 0; i < n; i++){
			if(ds[i].chiPhiLot() > max)
				max = ds[i].chiPhiLot();
		}
		System.out.println("Loai gach co chi phi lot thap nhat:");
		for(int i = 0; i < n; i++){
			if(ds[i].chiPhiLot() == max)
				System.out.println(ds[i]);
		}
		sc.close();
	}

}
