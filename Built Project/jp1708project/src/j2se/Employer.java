package j2se;

/**
 * <p>Title: JP1708 Project</p>
 *
 * <p>Description: </p>
 *
 * <p>Copyright: Copyright (c) 2018</p>
 *
 * <p>Company: </p>
 *
 * @author L? Tu?n
 * @version 1.0
 */
public class Employer extends Person{
    public static final int NET = 0;
    public static final String POSITION = "NONE";
    private int net;
    private String position;

    public Employer(){
        this(Employer.FIRSTNAME,Employer.LASTNAME,Employer.AGE,
             Employer.ADDRESS,Employer.NET,Employer.POSITION);
    }
    public Employer(String fisrtName, String lastName, byte age, Address address,
            int net, String position) {
        super(fisrtName, lastName, age, address);
        this.net = net;
        this.position = position;
    }
    public int getNet() {
        return net;
    }

    public String getPosition() {
        return position;
    }

    public void setNet(int net) {
        this.net = net;
    }

    public void setPosition(String position) {
        this.position = position;
    }
    public String toString(){
        return super.toString() + " - Net : " + this.net + " - Position : " + this.position;
    }
    public static void main(String[] args) {
      Address addr = new Address("Thai Binh","Hung Ha","Van Lang");
      Employer employer = new Employer("Thu","Nguyen Thi",(byte)21,addr,50000,"Quan tri he thong");
      System.out.print(employer.toString());
  }

}
