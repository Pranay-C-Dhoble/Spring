package autowiringusingannotation.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {
    @Autowired
    @Qualifier("address2") // This is used to specify the bean name if there are multiple beans of same type
    private Address address;
    public Address getAddress() {
        System.out.println("Inside Get Address of Emp Class");
        return address;
    }
    public void setAddress(Address address) {
        System.out.println("Inside Set Address of Emp Class");
        this.address = address;
    }

    public Emp(Address address) {
        this.address = address;
        System.out.println("Inside the Constructor");
    }
    public Emp(){
        super();
    }

    @Override
    public String toString() {
        System.out.println("Inside the toString Method of Emp Class");
        return "Emp{" +
                "address=" + address +
                '}';
    }
}
