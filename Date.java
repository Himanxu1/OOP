package Buoi2;

import java.util.Scanner;

public class Date {
	private int ngay, thang, nam;
	public Date(){
		ngay = 1;
		thang = 1;
		nam = 2021;
	}
	public Date(int ngay, int thang, int nam){
		this.ngay = ngay;
		this.thang = thang;
		this.nam = nam;
	}
	
	public Date(Date d){
		ngay = d.ngay;
		thang = d.thang;
		nam = d.nam;
	}
	
	public void in(){
		System.out.println(ngay + "/" + thang + "/" + nam);
	}
	
	public String toString(){
		return ngay + "/" + thang + "/" + nam;
	}
	
	public void nhap(){
		Scanner sc = new Scanner(System.in);
		do{
			System.out.print("Nhap ngay: ");
			ngay = sc.nextInt();
			System.out.print("Nhap thang: ");
			thang = sc.nextInt();
			System.out.print("Nhap nam: ");
			nam = sc.nextInt();
			if(!hopLe()){
				System.out.println("Nhap khong hop le, nhap lai!!!");
			}
		}while(!hopLe());
	}
	public boolean hopLe(){
		int max[] = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		if((nam % 4 == 0) && (nam % 100 != 0) || (nam % 400 == 0)){
			max[2] = 29;
		}
		boolean h = false;
		if(nam > 0 && thang > 0 && thang < 13 && ngay > 0 && ngay <= max[thang]){
			h = true;
		}
		return h;
	}
	public Date ngayHomSau(){
		Date d = new Date(ngay, thang, nam);
		d.ngay++;
		if(!d.hopLe()){
			d.ngay = 1;
			d.thang++;
			if(!d.hopLe()){
				d.thang = 1;
				d.nam++;
			}
		}
		return d;
	}
	public Date congNgay(int n){
		Date d = new Date(ngay, thang, nam);
		for(int i = 0; i < n; i++){
			d = d.ngayHomSau();
		}
		return d;
	}
}
