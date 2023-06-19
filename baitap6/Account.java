package NguyenTruongGiang_BaiTap04;

public class Account {
	private long soTK;
	private String tenTK;
	private double soTien;
	private String trangThai ="";
	private float laiSuat = 0.035f;
	
	public Account() {
		super();
		// TODO Auto-generated constructor stub
		this.soTK = 999999;
		this.tenTK = "Chưa xác định";
		this.soTien = 50;
	}

	public Account(long soTK, String tenTK, double soTien) {
		super();
		setSoTK(soTK);
		setTenTK(tenTK);
		setSoTien(soTien);
	}
	
	public String rutTien(double soTienCanRut) {
		if(soTienCanRut > 0 && soTienCanRut < soTien) {
			soTien -= soTienCanRut;
			return "Giao dịch rút tiền thành công. Số tiền còn lại trong tài khoản là: " + soTien;
		}
		
		return "Giao dịch rút tiền thất bại";
	}
	
	public String napTienVaoTK(double soTienCanNap) {
		if(soTienCanNap > 0) {
			soTien += soTienCanNap;
			return "Giao dịch nạp tiền thành công. Số tiền còn lại trong tài khoản là: " + soTien;
		}
		
		return "Giao dịch nạp tiền thất bại!";
	}
	
	public String chuyenTien(Account tkNhan, float soTienChuyen) {
		if(tkNhan != null && soTienChuyen > 0 && soTienChuyen < soTien) {
			rutTien(soTienChuyen);
			tkNhan.napTienVaoTK(soTienChuyen);
			return "Giao dịch chuyển tiền thành công. Số tiền còn lại trong tài khoản là: " + soTien;
		}
		
		return "Giao dịch chuyển tiền thất bại!";
	}

	@Override
	public String toString() {
		return String.format("%-10d |%-20s |%20.2f |%-50s|", soTK, tenTK, soTien, trangThai);
	}

	public long getSoTK() {
		return soTK;
	}

	public void setSoTK(long soTK) {
		if(soTK > 0 && soTK != 9999) this.soTK = soTK;
		else {
			soTK = 999999;
			trangThai += "Số tài khoản không hợp lệ| ";
		}
	}

	public String getTenTK() {
		return tenTK;
	}

	public void setTenTK(String tenTK) {
		if(tenTK != "") this.tenTK = tenTK;
		else {
			tenTK = "Chưa xác định";
			trangThai += "Tên tài khoản không hợp lệ| ";
		}
	}

	public double getSoTien() {
		return soTien;
	}

	public void setSoTien(double soTien) {
		if(soTien >= 50) this.soTien = soTien;
		else {
			soTien = 50;
			trangThai += "Số tiền không hợp lệ| ";
		}
	}

	public String getTrangThai() {
		return trangThai;
	}

	public void setTrangThai(String trangThai) {
		this.trangThai = trangThai;
	}
}
