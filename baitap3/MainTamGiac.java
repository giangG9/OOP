package baitap3;

	import java.util.Scanner;

public class MainTamGiac {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Nhập giá trị cạnh a: ");
	        double a = scanner.nextDouble();
	        System.out.print("Nhập giá trị cạnh b: ");
	        double b = scanner.nextDouble();
	        System.out.print("Nhập giá trị cạnh c: ");
	        double c = scanner.nextDouble();

	        TamGiac tamGiac = new TamGiac(a, b, c);
	        
	        System.out.println("Thông tin về tam giác:");
	        System.out.println(tamGiac.toString());
	    }
	}

