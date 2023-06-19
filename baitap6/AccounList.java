package NguyenTruongGiang_BaiTap04;

public class AccounList {
	private Account listTK[];
	private int count = 0;
	
	public AccountList(int n) {
		if(n > 0) listTK = new Account[n];
		else listTK = new Account[3];
	}
	
	public String addAccount(Account acc) {
		if(count < listTK.length) {
			listTK[count] = acc;
			count++;
			return "Thêm tài khoản thành công!";
		}
		
		return "Thêm tài khoản thất bại!";
	}
	
	public void xuatAllPhanTu() {
		for(int i = 0; i < count; i++) {
			System.out.println(listTK[i].toString());
		}
	}
}
