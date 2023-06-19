package NguyenTruongGiang_21107821_tuan03;

public class demoCD {
	static Scanner sc = new Scanner(System.in);
    static void nhapAlbum(Album ab) {
        System.out.print("Nhập mã CD: ");
        ab.setMaCD(sc.nextInt());
        sc.nextLine();
        System.out.print("Nhập tên CD : ");
        ab.setTenCD(sc.nextLine());
        System.out.print("Nhập tên ca sĩ : ");
        ab.setCaSy(sc.nextLine());
        System.out.print("Nhập số lượng bài hát : ");
        ab.setSoBH(sc.nextInt());
        System.out.print("Nhập giá thành : ");
        ab.setGiaThanh(sc.nextFloat());
    }

}
