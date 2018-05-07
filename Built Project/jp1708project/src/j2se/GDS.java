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
public interface GDS {
    boolean addEmployer(Employer e , Address addr);
    boolean editEmployer(Employer e , Address addr);
    boolean delEmployer(Employer e , Address addr);

    Employer[] seachEmployer(String name);
}
