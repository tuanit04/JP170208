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
public class HePT {

    public static void main(String[] args) {

         float a1,b1,a2,b2,c1,c2;
         Scanner n=new Scanner(System.in);
         System.out.print("Nhap vao a1: ");
         a1=n.nextFloat();
         System.out.print("Nhap vao b1: ");
         b1=n.nextFloat();
         System.out.print("Nhap vao c1: ");
         c1=n.nextFloat();
         System.out.print("Nhap vao a2: ");
         a2=n.nextFloat();
         System.out.print("Nhap vao b2: ");
         b2=n.nextFloat();
         System.out.print("Nhap vao c2: ");
         c2=n.nextFloat();

         float x,y;
         float d = (a1 * b2) - (a2 * b1);
         float dx = (b1 * c2) - (b2 * c1);
         float dy = (a1 * c2) - (a2 * c1);

         if(d!=0){
             x=(dx/d);
             y=(dy/d);
             System.out.print("Hept co nghiem x=  "+x);
             System.out.print("\nHept co nghiem y=  "+y);
       }else{
           System.out.print("Hept vo nghiem.");
       }



    }
}
