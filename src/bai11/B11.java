package bai11;
import java.util.Scanner;
public class B11 {
	public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int n;
       do{
           System.out.print("Nhap vao so phan tu cua mang: ");
           n=scanner.nextInt();
       } while(n<0);
        int A[]=new int[n];
        System.out.println("Nhap cac phan tu cho mang  ");
        for(int i=0;i<n;i++){
            System.out.print("Nhap phan tu thu "+i+": ");
            A[i]=scanner.nextInt();
        }
        System.out.println("Mang khi chua sap xep la: ");
        for(int i=0;i<n;i++){
            System.out.println(A[i]);
        }
        int tg;
        for(int i = 0; i < n - 1; i++){
            for(int j = i + 1; j < n; j++){
                if(A[i] > A[j]){
                    tg = A[i];
                    A[i] = A[j];
                    A[j] = tg;        
                }
            }
        }
        System.out.println("Mang tang dan sau khi sap xep la: ");
        for(int i=0;i<n;i++)
        System.out.println(A[i]);
    }
}

