package Buoi4;

public class SDDiemMau {

	public static void main(String[] args) {
		DiemMau a = new DiemMau();
		a.GanMau(5, 10, "trang");
		a.in();
		DiemMau d = new DiemMau();
		d.nhap();
		d.in();
		System.out.println("Doi diem di 1 do doi (8, 10): ");
		d.doiDiem(8, 10);
		d.in();
		System.out.println("Gan mau vang cho diem: ");
		d.GanMau("vang");
		d.in();
	}

}
