package Buoi4;

import java.util.Scanner;

public class SDSinhVienCNTT {

	public static void main(String[] args) {
		SinhVienCNTT sv[];
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so sinh vien: ");
		int n = sc.nextInt();
		sv = new SinhVienCNTT[n];
		for(int i = 0; i < n; i++)
			sv[i] = new SinhVienCNTT();
		for(int i = 0; i < n; i++) {
			System.out.println("Nhap thong tin sinh vien thu " + (i+1) + ": ");
			sv[i].nhap();
		}
		System.out.println("Danh sach sinh vien: ");
		for(int i = 0; i < n; i++) {
			System.out.println("Thong tin sinh vien thu " + (i+1) + ": ");
			sv[i].in();
		}
		sc.nextLine();
		System.out.print("Nhap dia chi email cua sinh vien can tim: ");
		String email = sc.nextLine();
		for(int i = 0; i < n; i++) 
			if(sv[i].layEmail().equals(email)) {
				System.out.println("Tai khoan: " + sv[i].layUser() + ", Diem TB: " + sv[i].trungBinh());
				break;
			}
		sc.close();
	}

}
