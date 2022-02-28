package baiTap1;

public class DanhSachHCN 
{
	HinhChuNhat DSHCN[];
	public int count=0;
	
	public DanhSachHCN(int soLuongH) 
	{
		DSHCN = new HinhChuNhat[soLuongH];
	}
	
	public void tangKichThuocMang() 
	{
		HinhChuNhat tempHCN[] = new HinhChuNhat[DSHCN.length * 2]
		for (int i = 0; i < DSHCN.length; i++) {
			tempHCN[i] = DSHCN[i];
		}
		DSHCN = tempHCN;
	}
	
	public void themHinhCN( HinhChuNhat CN)
	{
		DSHCN[count] = CN;
		count+=1;
	}
	public void xoa(int getIndex) {
		for (int i = getIndex; i < DSHCN.length - 1; i++) {
			dsXe[i] = dsXe[i + 1];
		}
	}

	static void Menu() {
		System.out.println("\t****************************************");
		System.out.println("\t* 1. Nhập cứng                         *");
		System.out.println("\t* 2. Thêm                              *");
		System.out.println("\t* 6. Xuất                              *");
		System.out.println("\t* 7. Thoát                             *");
		System.out.println("\t****************************************");
	} 
	 
}


