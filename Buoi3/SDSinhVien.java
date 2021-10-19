package Buoi3;
import java.util.Scanner;

public class SDSinhVien {

	public static void main(String[] args) {
//		SinhVien a = new SinhVien();
//		a.nhap();
//		a.dky("LTHDT");
//		a.nhapDiem();
//		a.in();
		SinhVien ds[];
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so sv: ");
		int n = sc.nextInt();
		ds = new SinhVien[n];
		for(int i = 0; i < n; i++)
			ds[i] = new SinhVien();
		sc.nextLine();
		for(int i = 0; i < n; i++){
			System.out.println("Nhap thong tin sinh vien thu " + (i+1) + ": ");
			ds[i].nhap(); 
		}
		System.out.println("Dang ky mon hoc");
		for(int i = 0; i < n; i++){
			System.out.print("Nhap so mon hoc dang ky cua sinh vien thu " + (i+1) + ": ");
			int m = sc.nextInt();
			sc.nextLine();
			for(int j = 0; j < m; j++){
				System.out.print("Nhap mon hoc thu " + (j+1) + ": ");
				String mon = sc.nextLine();
				ds[i].dky(mon);
			}
		}
		System.out.println("Nhap diem mon hoc: ");
		for(int i = 0; i < n; i++){
			System.out.println("Nhap diem cho sinh vien thu " + (i+1) + ": ");
			ds[i].nhapDiem();
		}
		System.out.println("Danh sach sinh vien: ");
		for(int i = 0; i < n; i++){
			System.out.println("Thong tin sinh vien thu " + (i+1) + ": ");
			ds[i].in();
		}
		System.out.println("Danh sach sinh vien bi canh bao hoc vu: ");
		for(int i = 0; i < n; i++)
			if(ds[i].trungBinh() < 1.0)
				System.out.println(ds[i]);
		System.out.println("Danh sach sinh vien gioi nhat lop: ");
		float max = Float.MIN_VALUE;
		for(int i = 0; i < n; i++)
			if(ds[i].trungBinh() > max)
				max = ds[i].trungBinh();
		for(int i = 0; i < n; i++)
			if(ds[i].trungBinh() == max)
				System.out.println(ds[i]);
		System.out.println("Danh sach sinh vien da sap xep theo ten: ");
		for(int i = 0; i < n; i++)
			for(int j = i+1; j < n; j++)
				if(ds[i].layTen().compareTo(ds[j].layTen()) > 0){
					SinhVien S = ds[i];
					ds[i] = ds[j];
					ds[j] = S;
				}
		for(int i = 0; i < n; i++)
			System.out.println("Sinh vien thu " + (i+1) + ": " + ds[i]);
		sc.close();
	}
}
