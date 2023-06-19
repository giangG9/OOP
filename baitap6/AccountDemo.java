package NguyenTruongGiang_BaiTap04;

public class AccountDemo {
	public static void main(String[] args) {
		Account acc1 = new Account();
		Account acc2 = new Account(6789, "Trung", 1000000000);
		Account acc3 = new Account(6789, "Teo", 50000);
		
		AccountList listTK = new AccountList(5);
		listTK.addAccount(acc3);
		listTK.addAccount(acc2);
		listTK.addAccount(acc1);
		
		acc1.setSoTien(3);
		acc1.setTenTK("");
		
		System.out.println(String.format("%-10s |%-20s |%20s |%-50s|", "Số TK", "Tên TK", "Số dư", "Trạng thái"));
		listTK.xuatAllPhanTu();
		
		System.out.println("\n" + acc2.rutTien(500000000));
		System.out.println(acc2.toString());
		
		System.out.println("\n" + acc2.chuyenTien(acc3, 50000));
		System.out.println(acc3.toString());
	}
}
