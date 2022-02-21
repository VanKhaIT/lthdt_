package baiTap1;

import java.util.Scanner;

public class HinhChuNhat {

private double chieuDai;
private double chieuRong;
public double getChieuDai() {
	return chieuDai;
}
public void setChieuDai(double d) {
	if (d>0) {
		this.chieuDai = d;
	} else {
		System.out.println("Loi chieu dai");
	}

}
public double getChieuRong() {
	return chieuRong;
}
public void setChieuRong(double r) {
	if (r>0) {
		this.chieuRong = r;
	} else {
		System.out.println("loi chieu rong");
	}
	
}
// Tinh dien tich va chu vi
public double getDienTich() {
	return getChieuDai()*getChieuRong();
}
public double getChuVi() {
	return (getChieuDai()+getChieuRong())*2;
}
// Ham tao dung khoi tao doi tuong
public HinhChuNhat(double d, double r) {
	this.chieuDai = d;
	this.chieuRong = r;
}
public HinhChuNhat() {
	
}
public static void main(String[] args) {
	HinhChuNhat hcn = new HinhChuNhat();
	// cap nhat cung ham tao
	HinhChuNhat hcnc = new HinhChuNhat(7,3);
	System.out.println("Dien tich: "+ hcnc.getDienTich());
	System.out.println("Chu vi : "+ hcnc.getChuVi());
	// Nhap tu ban phim
	Scanner sc = new Scanner(System.in);
	System.out.println("Nhap chieu dai: ");
	double d = sc.nextDouble();
	System.out.println("Nhap chieu rong: ");
	double r = sc.nextDouble();
	HinhChuNhat hc1 = new HinhChuNhat(d,r);
	System.out.println("dien tich : "+ hc1.getDienTich());
	System.out.println("Chu vi: "+ hc1.getChuVi());
	// Cach khac
	hcn.setChieuDai(d);
	hcn.setChieuRong(r);
	System.out.println("Dien dich: "+ hcn.getDienTich());
	System.out.println("Chu vi: "+ hcn.getChuVi());

}

}
