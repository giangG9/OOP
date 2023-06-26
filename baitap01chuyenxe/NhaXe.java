package NguyenTruongGiang_BaiTap01;

import java.util.ArrayList;

private String tenNhaxe;
private ArrayList<ChuyenXe> listChuyenXe;
public NhaXe(String tenNhaxe) {
	super();
	this.tenNhaxe = tenNhaxe;
	

	listChuyenXe = new ArrayList<ChuyenXe>(); 
	}
public void themChuyenXe(ChuyenXe chuyen)  throws Exception {
if(listChuyenXe != null)
{
	if(!listChuyenXe.contains(chuyen)) listChuyenXe.add(chuyen);
	else System.out.println("them that bai.. da ton tai");
}
else {
	System.out.println(new Exception("chua khoi tao"));
}
}
public void xoaChuyenXe(ChuyenXe xe) {
	if(loai == 0) {
		for(ChuyenXe xe : listChuyenXe) {
			//System.out.println(xe.toString());
		}
	}
}
public void xuatChuyenxe(int loai) {
	if(loai == 0) {
		for(ChuyenXe xe : listChuyenXe) {
			System.out.println(xe.toString());
		}
	}
	if(loai == 1) {
		for(ChuyenXe xe : listChuyenXe) {
			if(xe instanceof ChuyenXeNoiThanh) System.out.println(xe.toString());
		}
	}
	
	if(loai == 2) {
		for(ChuyenXe xe : listChuyenXe) {
			if(xe instanceof ChuyenXeNgoaiThanh) System.out.println(xe.toString());
		}
	}
}
	public void tinhDoanhThu(int loai) {
		double tongDoanhThu = 0;
		if(loai == 0) 
		{for(ChuyenXe xe : listChuyenXe) {
			tongDoanhThu += xe.getDoanhThu();
			
		}
		System.out.println("tong doanh thu "+ tongDoanhThu);
	}
		if(loai == 1) {
			for(ChuyenXe xe : listChuyenXe) {
				if(xe instanceof  ChuyenXeNoiThanh) tongDoanhThu += xe.getDoanhThu();
			}
				System.out.println("tong doanh thu chuyen xe noi thanh"+ tongDoanhThu);
			}
		
		if(loai == 2) {
			for(ChuyenXe xe : listChuyenXe) {
				if(xe instanceof  ChuyenXeNgoaiThanh) tongDoanhThu += xe.getDoanhThu();
			}
				System.out.println("tong doanh thu chuyen xe ngoai thanh"+ tongDoanhThu);
			}
		
}




public String getTenNhaxe() {
	return tenNhaxe;
}
public void setTenNhaxe(String tenNhaxe) {
	this.tenNhaxe = tenNhaxe;
}

public class NhaXe {
	private String tenNhaxe;
	private ArrayList<ChuyenXe> listChuyenXe;
	public NhaXe(String tenNhaxe) {
		super();
		this.tenNhaxe = tenNhaxe;
		

		listChuyenXe = new ArrayList<ChuyenXe>(); 
		}
	public void themChuyenXe(ChuyenXe chuyen)  throws Exception {
	if(listChuyenXe != null)
	{
		if(!listChuyenXe.contains(chuyen)) listChuyenXe.add(chuyen);
		else System.out.println("them that bai.. da ton tai");
	}
	else {
		System.out.println(new Exception("chua khoi tao"));
	}
	}
	public void xoaChuyenXe(ChuyenXe xe) {
		if(loai == 0) {
			for(ChuyenXe xe : listChuyenXe) {
				//System.out.println(xe.toString());
			}
		}
	}
	public void xuatChuyenxe(int loai) {
		if(loai == 0) {
			for(ChuyenXe xe : listChuyenXe) {
				System.out.println(xe.toString());
			}
		}
		if(loai == 1) {
			for(ChuyenXe xe : listChuyenXe) {
				if(xe instanceof ChuyenXeNoiThanh) System.out.println(xe.toString());
			}
		}
		
		if(loai == 2) {
			for(ChuyenXe xe : listChuyenXe) {
				if(xe instanceof ChuyenXeNgoaiThanh) System.out.println(xe.toString());
			}
		}
	}
		public void tinhDoanhThu(int loai) {
			double tongDoanhThu = 0;
			if(loai == 0) 
			{for(ChuyenXe xe : listChuyenXe) {
				tongDoanhThu += xe.getDoanhThu();
				
			}
			System.out.println("tong doanh thu "+ tongDoanhThu);
		}
			if(loai == 1) {
				for(ChuyenXe xe : listChuyenXe) {
					if(xe instanceof  ChuyenXeNoiThanh) tongDoanhThu += xe.getDoanhThu();
				}
					System.out.println("tong doanh thu chuyen xe noi thanh"+ tongDoanhThu);
				}
			
			if(loai == 2) {
				for(ChuyenXe xe : listChuyenXe) {
					if(xe instanceof  ChuyenXeNgoaiThanh) tongDoanhThu += xe.getDoanhThu();
				}
					System.out.println("tong doanh thu chuyen xe ngoai thanh"+ tongDoanhThu);
				}
			
	}




	public String getTenNhaxe() {
		return tenNhaxe;
	}
	public void setTenNhaxe(String tenNhaxe) {
		this.tenNhaxe = tenNhaxe;
	}
}
