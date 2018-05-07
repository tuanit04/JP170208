package Exercises;
import java.util.Scanner;
/**
 * <p>Title: JP1708 Project</p>
 *
 * <p>Description: </p>
 *
 * <p>Copyright: Copyright (c) 2018</p>
 *
 * <p>Company: </p>
 *
 * @author Quang
 * @version 1.0
 */
public class TamGiac {
    public static float  getChuViTamGiac(float a, float b, float c) {
        float cv=0;
        if(a+b>c && a+c>b && b+c>a){
            cv=a+b+c;
        }
        return cv;
    }

    public static float getDienTichTamGiac(float a, float b, float c){
        float s=0;
        float p=0;
        p=(a+b+c)/2;
        s=(float)(Math.sqrt(p*(p-a)*(p-b)*(p-c)));
        return s;
    }

    public static void main(String[] args) {
       float a,b,c;
       //Nhap vao 3 canh a,b,c.
       Scanner n=new Scanner(System.in);
       System.out.print("Nhap vao canh a: ");
       a=n.nextFloat();
       System.out.print("Nhap vao canh b: ");
       b=n.nextFloat();
       System.out.print("Nhap vao canh c: ");
       c=n.nextFloat();

       //In ra màn hình
       System.out.print("Chu vi tam giac la: "+TamGiac.getChuViTamGiac(a,b,c));
       System.out.print("\nDien tich tam giac la: "+TamGiac.getDienTichTamGiac(a,b,c));;

    }
}
