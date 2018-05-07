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
public interface CTT extends CTX,TPGD,GDS{
    boolean setEmployer(Employer e);
    boolean setEmployer(Employer e, Address addr);

    boolean addCTX(Person p);
    boolean addTPGD(Person p);
    boolean addGDS(Person p);

}
