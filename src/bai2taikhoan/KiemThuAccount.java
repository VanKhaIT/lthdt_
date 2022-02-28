package bai2taikhoan;

import java.util.Scanner;

public class KiemThuAccount {

		static Scanner scanner = new Scanner(System.in);

		static String Header() {
			return String.format("%-10s %25s %15s", "Ma tai khoan", "ten chu tai khoan", "so du");
		}
		
		static void nhapCung(DanhSach accKH) {
			Account acc = new Account();
			acc = new Account(45982334, "NguyenVanA", 100000);
			accKH.themACC(acc);
			acc = new Account(72049857, "NguyenVanB");
			accKH.themACC(acc);
			acc = new Account(89760284, "NguyenThiC", 2200000);
			accKH.themACC(acc);
		}
		
		static void Menu() {
			System.out.println("\t*************************************");
			System.out.println("\t**         Quan Ly Thong Tin       **");
			System.out.println("\t* 1. Nhap Cung                      *");
			System.out.println("\t* 2. Xuat                           *");
			System.out.println("\t* 3. Thoat                          *");
			System.out.println("\t*************************************");
		}

		static DanhSach accKH;

		static void xuatDanhSach(Account accKH[], int soLuong) {
			for (int i = 0; i < soLuong; i++) {
				System.out.println(accKH[i]);
			}
			System.out.println("\n\n\n");
		}
		
		public static void main(String[] args) {
			try {
				int chon;
				DanhSach accKH = new DanhSach(3);
				do {
					Menu();
					System.out.println("Nhap lua chon cua ban: ");
					chon = scanner.nextInt();
					switch (chon) {
					case 1:
						nhapCung(accKH);
						break;
					case 2:
						System.out.println(Header());
						System.out.println("========================================================");
						xuatDanhSach(accKH.getDanhSach(), accKH.soLuongAcc);
						break;
					default:
						System.out.println("Cam on quy khach!!");
						System.exit(0);
					}
				} while (chon < 3);
			} catch (ArithmeticException e1) {
				System.out.println("Khong hop le" + e1.getMessage());
			} catch (ArrayIndexOutOfBoundsException e2) {
				System.out.println("Loi" + e2.getMessage());
			} catch (Exception e) {
				System.out.println("Loi khong xac dinh" + e.getMessage());
			}
		}
}

