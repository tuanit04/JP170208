package j2se;

import java.util.*;



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
public class MyArrays {
    public MyArrays() {
    }

    public static int[] generateArray(int n){
        //Mang trung gian
        int[] arrInt = new int[n];

        //Sinh ngau nhien mot mang
        for(int i=0;i<n;i++){
            arrInt[i] = (int)(Math.random()*100);
        }


        return arrInt;
    }

    public static int[][] generateArray(int rows, int cols){
        //Mang trung gian
        int[][] arrInt = new int[rows][cols];
        for(int i=0; i<rows;i++){
            arrInt[i] = MyArrays.generateArray(cols);
        }

        return arrInt;
    }

    public static Person[] generatePerson(int n){
        // Khai bao mang ket qua
        Person[] list = new Person[n];

        //Danh sach ten
        String[] firstNames={"Tuan","Tuan Anh","Chung","Quang","Thu Trang","Ngoc Anh","Nam"
                           ,"Nam Anh","Bao Anh","Linh","Thuy Linh","My Linh","Huong","Hoang"
                           ,"Ngoc","Phuc","Thuy","Van","Yen","Huy","Quang Huy",
                           "Hai","Son","Hong Son","Trung","Don","Huan","Khanh Linh","Trang"
                           };

        String[] lastNames={"Cao","Tran","Vuong","Luong","Nguyen","Vu",
                          "Le","Trinh","Ho","Ly","Ma","Hoang",
                          "Dinh","Ngo","Duong","To","La","Luu",
                          };

        //Sinh cac phan tu danh sach
        int index;
        for(int i=0; i<n; i++){
            //Khoi tao bo nho cho phan tu mang
            list[i] = new Person();


            //Sinh ngau nhien ten
            index = (int)(Math.random()*firstNames.length);
            list[i].setFirstName(firstNames[index]);

            //Sinh ngau nhien ho
            index =(int)(Math.random()*lastNames.length);
            list[i].setLastName(lastNames[index]);

            index = (int)(Math.random()*120);
            list[i].setAge((byte)index);
        }
        return list;
    }


    public static int[] sortArray(int[] arrInt, boolean isINC){
        //Xac dinh huong sap xep
        int ori = isINC ?1:-1;

        //sap xep
        int tmp;
        for(int i=0; i<arrInt.length-1;i++){
            for(int j=i+1; j<arrInt.length;j++){
                if(arrInt[i]*ori > arrInt[j]*ori){
                    tmp=arrInt[i];//luu lai gia tri
                    arrInt[i]=arrInt[j];//gan gia tri moi
                    arrInt[j]=tmp;//lay gia tri cu
                }
            }
        }
        return arrInt;
    }

    //sap xep mang hai chieu
    public static int[][] sortMyArrays(int[][] arrInt,int rows, int cols ){
        int tmp;
        for(int i=0;i< rows ;i++){
            for(int j=0;j < cols;j++){
                for(int k=j+1;k<cols;k++){
                    if(arrInt[i][k]< arrInt[i][j]){
                        tmp=arrInt[i][k];
                        arrInt[i][k]=arrInt[i][j];
                        arrInt[i][j]=tmp;
                    }
                }
            }
        }
        return arrInt;
    }

    public static int[] filterArray(int[] arrInt, boolean isINC){

        //Sap xep
        arrInt = MyArrays.sortArray(arrInt, isINC);


        //Tach nguyen to
        int[] temp1 = new int[arrInt.length];//luu nguyen to
        int[] temp2 = new int[arrInt.length];///khong
        int t1=0,t2=0;

        for(int value: arrInt){
            if(Examples.checkValue(value)){
                temp1[t1++] = value;
            }else{
                temp2[t2++] = value;
            }
        }

        //Ghep mang
        for(int i=t1;i<temp1.length;i++){
            temp1[i] = temp2[i-t1];
        }

       return temp1;
    }

    //Tim kiem
    public static Person[] searchPerson(Person[] list, String name){
        //Khai bao mang ket qua
        Person[] results = null;

        //Dem so ket qua, contains=chua
        int count=0;
        for(Person p: list){
            if(p.getFirstName().contains(name)){
                count++;
            }
        }

        //Khoi tao mang ket qua
        results = new Person[count];

        //Ghi nhan lai ket qua
        count=0;
        for(Person p: list){
            if(p.getFirstName().contains(name)){
                results[count++]= p;

            }
        }

        return results;
    }

    //su dung arraylist de tim kiem
    public static ArrayList searchPersonV2(Person[] list, String name){
        ArrayList results = new ArrayList();
        for(Person p: list){
            if(p.getFirstName().contains(name)){
                results.add(p);
            }
        }
        return results;
    }





    //print methods
    public static void printArray(int[] arrInt){
        for(int value: arrInt){
            System.out.print(value+" ");
        }
        System.out.println();
    }

    //Ha thap n chieu ve n-1 chieu
    public static void printArray(int[][] arrInt){
        for(int[] rows: arrInt){
            MyArrays.printArray(rows);
        }
    }

    public static void printMyArray(int[][] arrInt){
        for(int[] rows: arrInt){
            MyArrays.printArray(rows);
        }
    }

    public static void printPerson(Person[] list){
        for(Person p: list){
            System.out.println(p);
        }
    }

    //Hien thi arraylist person, quan tam den chi so
    public static void printPerson(ArrayList persons){
        Person p;

        for(int i=0;i<persons.size();i++){
            p = (Person)persons.get(i);
            System.out.println(p);
        }
    }
    //quan tam den thanh phan du lieu
    public static void printPersonV2(ArrayList<Person> list){
        for(Person p: list){
            System.out.println(p);
        }
    }

    public static void main(String[] args) {

        //Sinh mang
       Person[] list = MyArrays.generatePerson(20);

        //in
        MyArrays.printPerson(list);


        System.out.print("\n\n--------------------------------------\n\n");

        ArrayList results = MyArrays.searchPersonV2(list,"Anh");

        MyArrays.printPerson(results);


         /*int[][] arrInt = MyArrays.generateArray(10,20);
         arrInt = MyArrays.sortMyArrays(arrInt,10,20);
         MyArrays.printArray(arrInt);*/





    }


}
