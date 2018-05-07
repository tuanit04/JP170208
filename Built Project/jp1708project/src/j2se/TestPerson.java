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
public class TestPerson {
    public TestPerson() {
    }

    public static void main(String[] args) {
        TestPerson testperson = new TestPerson();

        Address addr = new Address("Ha Noi","Cau Giay","Trung Kinh");
        Address addr1 = new Address("Thai Binh","Hung Ha","Van Lang");

        Person employer = new Employer("Thu","Nguyen Thi",(byte)21,addr,50000,"Quan tri he thong");
        Person student = new Student("Tuan","Pham Minh",(byte)20,addr1,"(2018)0123055555","KTPM");
        System.out.println(employer.toString());
        System.out.print(student.toString());


    }
}
