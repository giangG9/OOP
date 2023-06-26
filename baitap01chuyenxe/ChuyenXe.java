package NguyenTruongGiang_BaiTap01;

public class ChuyenXe {
	protected String MaSo, HoTenTX, SoXe;
	protected double DoanhThu;
	public String getMaSo() {
		return MaSo;
	}
	public ChuyenXe(String maSo, String hoTenTX, String soXe, double doanhThu) {
		super();
		MaSo = maSo;
		HoTenTX = hoTenTX;
		SoXe = soXe;
		DoanhThu = doanhThu;
	}
	
		
	@Override
	public String toString() {
		return "ChuyenXe [MaSo=" + MaSo + ", HoTenTX=" + HoTenTX + ", SoXe=" + SoXe + ", DoanhThu=" + DoanhThu + "]";
	}

	public void setMaSo(String maSo) {
		if(MaSo !=null || maSo.trim().length() >0 )this.MaSo= maSo;
		else System.out.println(new Exception("Ma so ko hop le"));
	}
	public String getHoTenTX() {
		return HoTenTX;
	}
	public void setHoTenTX(String hoTenTX) {
		this.HoTenTX = hoTenTX;
	}
	public String getSoXe() {
		return SoXe;
	}
	public void setSoXe(String soXe) {
		this.SoXe = soXe;
	}
	public double getDoanhThu() {
		return DoanhThu;
	}
	public void setDoanhThu(double doanhThu) {
		this.DoanhThu = doanhThu;
	}
	public ChuyenXe() {
		super();
	}
	
}
