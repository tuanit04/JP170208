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
 * @author Quang
 * @version 1.0
 */
public class Address {
    //Constant-1
    public static final String CITYNAME = "No CityName";
    public static final String DISTRICTNAME = "No DistrictName";
    public static final String STREETNAME = "No StreetName";

    //Object properties - 0
    private String cityName;
    private String districtName;
    private String streetName;


    //Constructor methods - 2
    public Address() {
        this(Address.CITYNAME, Address.DISTRICTNAME, Address.STREETNAME);
    }

    public Address(String cityName, String districtName, String streetName) {
        this.cityName = cityName;
        this.districtName = districtName;
        this.streetName = streetName;
    }
    // Constructor dac biet
    public Address (Address addr){
        this(addr.getCityName(),addr.getDistrictName(), addr.getStreetName());
    }

    //Getter mehtods - 4
    public String getCityName() {
        return this.cityName;
    }

    public String getDistrictName() {
        return this.districtName;
    }

    public String getStreetName() {
        return this.streetName;
    }

    //Setter methods-3
    public Address setCityName(String cityName) {
        this.cityName = cityName;
        return this;
    }

    public Address setDistrictName(String districtName) {
        this.districtName = districtName;
        return this;
    }

    public Address setStreetName(String streetName) {
        this.streetName = streetName;
        return this;
    }

    //Other's methods - 4
    public String toString() {
        return cityName + "," + districtName + "," + streetName;
    }

    public static void main(String[] args) {
        //Tao doi tuong
        Address a;
        Address a1 = new Address();
        Address a2 = new Address("Ha Noi", "Nha 23", "Kim Ma");

        System.out.println(a1);
        System.out.println(a2);
    }
}
