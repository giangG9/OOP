package NguyenTruongGiang_BaiTap03;

public class VehicleDemo {
	public static void main(String[] args) {
	Vehicle xe1 = new Vehicle("Nguyễn Trường Giang", "Toyota Camry 2.0", 700, 1100000000 );
	
	System.out.println(String.format("%-20s %-20s %12s %20s %20s", "Tên chủ xe", "Dung tích", "Trị giá", "Thuế trước bạ"));
	System.out.println("================================================================================================");
	System.out.println(xe1.toString());
}
}
