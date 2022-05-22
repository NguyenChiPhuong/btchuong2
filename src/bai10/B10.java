package bai10;
import java.util.Scanner;
public class B10 {
	public static void main(String[] args) {
		String chuoi;
	    char kyTu;
	    int dem= 0;
	    Scanner scanner = new Scanner(System.in);
	    do {
	        System.out.println("Nhap vao mot chuoi: ");
	        chuoi = scanner.nextLine();
	    } while (chuoi.length() > 80);         
	    System.out.print("ky tu muon dem: ");
	    kyTu = scanner.next().charAt(0);
	    for (int i = 0; i < chuoi.length(); i++) {
	        if (kyTu == chuoi.charAt(i)) {
	            dem++;
	        }
	    }     
	    System.out.println("so lan xuat hien ky tu " + kyTu +" trong chuoi " + chuoi + " = " + dem);
	}

}
