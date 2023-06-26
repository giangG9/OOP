package NguyenTruongGiang_BaiTap01;

public class ChuyenXengoaithanh {
	private String noiDen;
	private int soNgay;
	public ChuyenXeNgoaiThanh() {
		super();
		
	}

	public ChuyenXeNgoaiThanh(String maSo, String hoTenTX, String soXe, double doanhThu, String noiDen, int soNgay) {
		super(maSo, hoTenTX, soXe, doanhThu);
		this.noiDen = noiDen;
		this.soNgay = soNgay;
	}


	@Override
	public String toString() {
		return super.toString()+"ChuyenXeNgoaiThanh [noiDen=" + noiDen + ", soNgay=" + soNgay + "]";
	}




	public String getNoiDen() {
		return noiDen;
	}
	public void setNoiDen(String noiDen) {
		this.noiDen = noiDen;
	}
	public int getSoNgay() {
		return soNgay;
	}
	public void setSoNgay(int soNgay) {
		this.soNgay = soNgay;
	}

}
