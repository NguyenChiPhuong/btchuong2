package bai12;
import java.util.Scanner;
public class B12 {
	public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        int n,l;
        do{
            System.out.println("Nhap so phan tu cua 2 mang:");
            System.out.print("Mang 1: ");
            n=scanner.nextInt();
            System.out.print("Mang 2: ");
            l=scanner.nextInt();
         }while(n<0||l<0);
         int A[][]=new int[n][l];
         for(int i=0;i<n;i++){
          for(int j=0;j<l;j++){
              System.out.print("Nhap phan tu thu A["+i+"]"+"["+j+"]:");
              A[i][j]=scanner.nextInt();
          }
        }
        int temp=A[0][0];
        for(int i=0;i<n;i++){
            for(int j=0;j<l;j++){
               if(A[i][j]>temp)
               temp=A[i][j];
            }
          } 
        System.out.println("Gia tri lon nhat cua mang la: "+temp);  
    }
}
