package NguyenTruongGiang_BaiTap01;

public class Demo {
	public static void main(String[] args)  throws Exception{
		NhaXe nhaXe1 = new NhaXe("Nhaxe IUh");
		
		ChuyenXeNoiThanh chuyennoiThanh1 =new ChuyenXeNoiThanh("NT01", "Teo","50A1-123.05",7000000,300,10);
		ChuyenXeNoiThanh chuyennoiThanh2 =new ChuyenXeNoiThanh("NT02", "Trung","50A1-123.06",700000,300,10);
		
	ChuyenXeNgoaiThanh chuyenngoaiThanh1 = new ChuyenXeNgoaiThanh("nt05","tung","50A-655.5",1200000,"Vung Tau",3);
	ChuyenXeNgoaiThanh chuyenngoaiThanh2 = new ChuyenXeNgoaiThanh("nt03","quoc","50A-655.6",700000,"Nha Trang",3);
		nhaXe1.themChuyenXe(chuyennoiThanh1 );
		nhaXe1.themChuyenXe(chuyenngoaiThanh1  );
		nhaXe1.themChuyenXe(chuyennoiThanh2 );
		nhaXe1.themChuyenXe(chuyenngoaiThanh2  );
		System.out.println("xuat tat ca");
		nhaXe1.xuatChuyenxe(0);
		System.out.println("xuat noi thanh");
		nhaXe1.xuatChuyenxe(1);
		System.out.println("xuat ngloai thanh");
nhaXe1.xuatChuyenxe(2);
System.out.println("Tong doanh thu");
nhaXe1.tinhDoanhThu(0);
System.out.println("doanh thu noi thanh");
nhaXe1.tinhDoanhThu(1);
System.out.println("doanh thu ngoai thanh");
nhaXe1.tinhDoanhThu(2);
		}
}
