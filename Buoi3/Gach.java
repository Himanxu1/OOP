package Buoi3;

import java.util.Scanner;

public class Gach {
	private String mso, mau;
	private int sl, cd, cn;
	private long gia;
	
	public Gach(){
		mso = new String();
		mau = new String();
		sl = 0;
		cd = 0;
		cn = 0;
		gia  = 0;
	}
	
	public Gach(Gach G){
		mso = new String(G.mso);
		mau = new String(G.mau);
		sl = G.sl;
		cd = G.cd;
		cn = G.cn;
		gia = G.gia;
	}
	
	public void nhap(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap ma so: ");					mso = sc.nextLine();
		System.out.print("Nhap mau: ");						mau = sc.nextLine();
		System.out.print("Nhap so luong vien gach: ");		sl = sc.nextInt();
		System.out.print("Nhap chieu dai vien gach: ");		cd = sc.nextInt();
		System.out.print("Nhap chieu ngang vien gach: ");	cn = sc.nextInt();
		System.out.print("Nhap gia 1 vien gach: ");			gia = sc.nextLong();
	}
	
	public void in(){
		System.out.println("Ma so: " + mso + ", mau: " + mau + ", so luong: " + sl + ", " + cd + "cm" + "x" + cn + "cm" + ", gia: " + gia + "$");
	}
	
	public String toString(){
		return "Ma so: " + mso + ", mau: " + mau + ", so luong: " + sl + ", " + cd + "cm" + "x" + cn + "cm" + ", gia: " + gia + "$";
	}
	
	public float giaBanLe(){
		return (float)gia*20/100 + gia;
	}
	
	public long dienTichNen(){
		return (cd*sl)*(cn*sl);
	}
	
	public float chiPhiLot(){
		return (float) gia / (cd*cn);
	}
}
