package bai6;
import java.util.Scanner;
public class B6 {
  public static void main(String[] args){
    Scanner scanner =new Scanner(System.in);
    int n;
    int gt=1;
    System.out.print("Nhap vao so nguyen duong: ");
    n=scanner.nextInt();
    do{                              
       gt=gt*n;
       n--;                        
    }while(n>0);
    if(n<0)
        System.out.println("Vui long nhap so nguyen duong !");
    else
    System.out.println("Giai thua cua so vua nhap la: "+gt);   
}
}


