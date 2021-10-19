package Buoi4;

import java.util.Scanner;

public class SDConVat {

	public static void main(String[] args) {
		ConVat ds[];
		System.out.print("Nhap so dong vat: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ds = new ConVat[n];
		for(int i = 0; i < n; i++) {
			System.out.println("Chon : Bo(1), Heo(2), De(3), Ga(4)");
			int c = sc.nextInt();
			if(c == 1) {
				ds[i] = new Bo();
				ds[i].nhap();
			}
				
			else if(c == 2) {
				ds[i] = new Heo();
				ds[i].nhap();
			}	
			else if(c == 3) {
				ds[i] = new De();
				ds[i].nhap();
			}
			else {
				ds[i] = new Ga();
				ds[i].nhap();
			}		
		}
		
		for(int i = 0; i < n; i++) {
			ds[i].in();
			System.out.println();
		}
		System.out.println();
		for(int i = 0; i < n; i++) {
			ds[i].Keu();  	
			System.out.println();
		}
		sc.close();
	}

}
