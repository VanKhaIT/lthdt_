package bai2taikhoan;

public class DanhSach {
	Account accKH[];
	public int soLuongAcc = 0;
	
	public DanhSach(int soLuongACC1) {
		accKH = new Account[soLuongACC1];
	}

	public void tangKichThuocMang() {
		Account tempAcc[] = new Account[accKH.length * 2];
		for (int i = 0; i < accKH.length; i++) {
			tempAcc[i] = accKH[i];
		}
		accKH = tempAcc;
	}

	public void themACC(Account acc) {
		if (soLuongAcc == accKH.length)
			tangKichThuocMang();
			accKH[soLuongAcc] = acc;
			soLuongAcc++;
		}


	public Account[] getDanhSach() {
		return accKH;
	}
}
