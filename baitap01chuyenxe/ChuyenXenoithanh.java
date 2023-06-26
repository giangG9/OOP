package NguyenTruongGiang_BaiTap01;

public class ChuyenXenoithanh {
private int soTuyen,soKM;

	

	public ChuyenXeNoiThanh(String maSo, String hoTenTX, String soXe, double doanhThu, int soTuyen, int soKM) 
	throws Exception{
		super(maSo, hoTenTX, soXe, doanhThu);
		this.soTuyen = soTuyen;
		this.soKM = soKM;
	}
	

	public ChuyenXeNoiThanh() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	

	public int getSoTuyen() {
		return soTuyen;
	}

	


	public void setSoTuyen(int soTuyen) {
		this.soTuyen = soTuyen;
	}

	public int getSoKM() {
		return soKM;
	}

	public void setSoKM(int soKM) {
		this.soKM = soKM;
	}


	@Override
	public String toString() {
		return super.toString()+ "ChuyenXeNoiThanh [soTuyen=" + soTuyen + ", soKM=" + soKM + "]";
	}
	
}
