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
public class HinhChuNhat {
    /**
     * Phuong thuc tinh chu vi hinh chu nhat voi chieu dai la a, chieu rong la b.
     * @param a int
     * @param b int
     * @return int
     */
    public static int getChuVi(int a, int b) {
        int p=0;
        if(a*b!=0){
            p=2*(a+b);
        }

        return p;
    }
    /**
     * Phuong thuc tinh dien tich hinh chu nhat voichieu dai la a, chieu rong la b.
     * @param a int
     * @param b int
     * @return int
     */
    public static int getDienTich(int a, int b){
        int s=0;
        if(a*b!=0){
            s=a*b;
        }
        return s;
    }


    public static void main(String[] args) {
        Scanner cd = new Scanner(System.in);
        //Nhap vao 2 canh a,b
        int a,b;
       System.out.print("Nhap vao so a: ");
       a = cd.nextInt();
       System.out.print("Nhap vso so b: ");
       b=cd.nextInt();

       //In ra
       System.out.print("Chu vi hcn la: "+HinhChuNhat.getChuVi(a,b));
       System.out.print("\nDien tich hcn la: "+HinhChuNhat.getDienTich(a,b));


    }
}
