package bai1;
import java.util.Scanner;
public class b1{
public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    float a,b;
    System.out.println("Nhap so a: ");
    a=scanner.nextFloat();
    System.out.println("Nhap so b: ");
    b=scanner.nextFloat();
    float tong=a+b;
    System.out.println(a+"+"+b+"="+tong);
    float hieu=a-b;
    System.out.println(a+"-"+b+"="+hieu);
    float tich=a*b;
    System.out.println(a+"*"+b+"="+tich);
    float thuong=a/b;
    System.out.println(a+"/"+b+"="+thuong);
    float du=a%b;
    System.out.println(a+"%"+b+"="+du);
        System.out.println("Ket qua so sanh bang 2 so " +a+ " va " + b + " la " + (a==b));
        System.out.println("Ket qua so sanh khong bang 2 so " +a+ " va " + b+ " la " + (a != b));
        System.out.println("Ket qua so sanh lon hon 2 so " + a + " va " + b + " la " + (a > b));
        System.out.println("Ket qua so sanh lon hon hoac bang 2 so " + a + " va " +  b + " la " + (a >= b));
        System.out.println("Ket qua so sanh nho hơn 2 so " + a + " va " + b + " la " + (a < b));
        System.out.println("Ket quả so sanh nho hon hoac bang 2 so " + a + " va " +b + " la " + (a <= b));
}
}