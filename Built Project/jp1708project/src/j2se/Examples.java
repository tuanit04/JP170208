package j2se;

/**BTVN
 * Giai he hai phuong trinh
 * tinh chu vi va dien tich hinh tron
 * tinh chu vi tam giac
 * tinh tich phan
 */
public class Examples {
    public Examples() {
    }

    /**
     * This method is used to check of value is <b>prime</b>?
     * <br/>
     * <i>update 08-03-2018</i>
     * <br/>
     *
     */
      public static boolean checkValue(int n){
        //khai bao bien trung gian
        boolean flag = true;

        //kiem tra
        if (n < 2) {
            flag = false;
        } else {
            for (int v = 2; v <= (int) (Math.sqrt(n)); v++) {
                if (n % v == 0) {
                    flag = false;
                    break;
                }
            }

        }
         return flag;
    }

    /**
     * This method is used to get UCLN form two params.
     * <br/>
     * <i>update 08-03-2018</i>
     * <br/>
     */

    //Tim uoc chung lon nhat
    public static int getUCLN(int a, int b){
        int UCLN = -1;

        if (a * b != 0) {
            while (a != b) {
                if (a > b) {
                    a -= b;
                } else {
                    b -= a;
                }
            }
             UCLN = a;
        }
        return UCLN;
    }

    /**
     * This method is used to get UCLN from three params.
     * <br/>
     * <i>update 08-03-2018</i>
     * <br/>

     * @param a int
     * @param b int
     * @param c int
     * @return int
     */
    public static int getUCLN(int a, int b, int c){

        return Examples.getUCLN(Examples.getUCLN(a,b),c);
    }







    public static void main(String[] args) {

            //sing ngau nhien mot gia tri
            int n = (int) (Math.random() * 100);
            int m= (int) (Math.random()*100);


            //In ra
            System.out.print("UCLN cua n= "+n);
            System.out.print(" UCLN cua m= "+m);
            System.out.print("UCLN= "+Examples.getUCLN(n,m));

        }
    }

