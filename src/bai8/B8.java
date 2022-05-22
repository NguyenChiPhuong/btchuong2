package bai8;
import java.util.Scanner;
public class B8 {
	   public static void main(String[] args) {
	    int n, sum = 0, so;
	    float avg;
	     Scanner scanner = new Scanner(System.in); {
	        System.out.print("Nhap vao so cac so nguyen: ");
	        n=scanner.nextInt();
	        for(int i=1;i<=n;i++){
	            System.out.println("Nhap vao so thu "+i+": ");
	            so=scanner.nextInt();
	            sum+=so;
	        }
	    }
	    avg=(float) sum/n;
	    System.out.println("Trung binh cong cua "+n+" so tren la: "+avg );
	}
}


