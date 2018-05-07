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
 * @author Lo Tuan
 * @version 1.0
 */
public class Student extends Person{
    //Constants
    public static final String ID = "(2018)0000000000000";
    public static final String SPECIALLY = "NONE";

    //Student's Properties
    private String id;
    private String specially;

    //Constructor methods
    public Student(){
        this(Student.FIRSTNAME,Student.LASTNAME,Student.AGE,
             Student.ADDRESS,Student.ID,Student.SPECIALLY);
    }
    public Student(String fisrtName, String lastName, byte age, Address address,
            String id, String specially) {
        //Khoi tao doi tuong cha
        super(fisrtName,lastName,age,address);
        //Thiet lap thong tin doi tuong con
        this.id = id;
        this.specially = specially;
    }
    public String getId() {
            return id;
        }

    public String getSpecially() {
            return specially;
        }

    public void setId(String id) {
            this.id = id;
        }

    public void setSpecially(String specially) {
            this.specially = specially;
    }
    //Other methods
    public String toString(){
        return super.toString() + " - ID : " + this.id + " - Specially : " + this.specially;
    }
    public static void main(String[] args) {
        Address addr = new Address("Ha Noi","Cau Giay","Trung Kinh");
        Student student = new Student("Tuan","Pham Minh",(byte)20,addr,"(2018)0123055555","KTPM");
        System.out.print(student.toString());

    }

}
