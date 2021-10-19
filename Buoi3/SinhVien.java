package Buoi3;

import java.util.Scanner;

import Buoi2.Date;

public class SinhVien {
	private String mssv, hten;
	private Date nsinh;
	private int sl;
	private String tenhp[], diem[];
	
	public SinhVien(){
		mssv = new String();
		hten = new String();
		nsinh = new Date();
		sl = 0;
		tenhp = new String[100];
		diem = new String[100];
	}
	public SinhVien(SinhVien S){
		mssv = new String(S.mssv);
		hten = new String(S.hten);
		nsinh = new Date(S.nsinh);
		sl = S.sl;
		tenhp = new String[100];
		diem = new String[100];
		for(int i = 0; i < S.sl; i++){
			tenhp[i] = new String(S.tenhp[i]);
			diem[i] = new String(S.diem[i]);
		}
	}
	
	public void nhap(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap ma so sinh vien: ");
		mssv = sc.nextLine(); 
		System.out.print("Nhap ho ten: ");
		hten = sc.nextLine();
		System.out.println("Nhap ngay thang nam sinh: ");
		nsinh.nhap();
	}
	

	public void dky(String mon){
		if(sl < tenhp.length){
			tenhp[sl] = new String(mon);
			sl++;
		}
		else
			System.out.println("Mang day! Khong the them");
	}
	
	public void nhapDiem(){
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < sl; i++){
			System.out.print("Nhap diem mon hoc " + tenhp[i] + ": ");
			diem[i] = sc.nextLine();
		}
	}
	
	public void in(){
		System.out.print("[mssv: " + mssv + ", ho ten: " + hten + ", nam sinh: " + nsinh);
		for(int i = 0; i < sl; i++)
			System.out.print(", " + tenhp[i] + ": " + diem[i]);
		System.out.println("]");
	}
	
	public String toString(){
		String s = "[" + mssv + ", " + hten + ", " + nsinh;
		for(int i = 0; i < sl; i++)
			s += ", " + tenhp[i] + ": " + diem[i];
		s += "]";
		return s;
	}
	
	public float trungBinh(){
		float f = 0.0f;
		for(int i = 0; i < sl; i++){
			if(diem[i].equals("A"))
				f += 4.0f;
			else if(diem[i].equals("B+"))
				f += 3.5f;
			else if(diem[i].equals("B"))
				f += 3.0f;
			else if(diem[i].equals("C+"))
				f += 2.5f;
			else if(diem[i].equals("C"))
				f += 2.0f;
			else if(diem[i].equals("D+"))
				f += 1.5f;
			else if(diem[i].equals("D"))
				f += 1.0f;
			else
				f += 0.0f;
		}
		return f/sl;
	}
	
	
	public void xoa(String mon){
		int i = 0;
		for(; i < sl; i++)
			if(tenhp[i].equals(mon))
				break;
		if(i < sl){
			for(int j = 0; j < sl-1; j++){
				tenhp[j] = new String(tenhp[j+1]);
				diem[j] = new String(diem[j+1]);
				sl--;
			}
		}
		else
			sl--;
	}
	
	public String layTen(){
		String h = hten.trim();
		return (h.substring(h.lastIndexOf(" ")+1));
	}
	
	public String layEmail() {
		return "";
	}
	
	public String layUser() {
		return "";
	}
}