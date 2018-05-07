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


public class HinhTron {
    /**
     * Phuong thuc tinh chu vi hinh tron voi ban kinh r.
     * @param r float
     * @return float
     */
    public static float getCVHinhTron(float r) {
        float cv=0;
        if(r>0){
            cv=2*((float)(Math.PI)*r);
        }
        return cv;
    }
    /**
     * Phuong thuc tinh dien tich hinh tron voi ban kinh r.
     * @param r float
     * @return float
     */
    public static float getDTHinhTron(float r){
        float dt=0;
        if(r>0){
            dt=(float)(Math.PI)*r*r;
        }
        return dt;
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        //Nhap ban kinh r
       float r;
        System.out.print("Nhap vao r: ");
        r=s.nextFloat();

        //In ra
        System.out.print("Chu vi hinh tron la: "+HinhTron.getCVHinhTron(r));
        System.out.print("\n Dien tich hinh tron la: "+HinhTron.getDTHinhTron(r));
    }
}
