package autowiring.model;

public class Emp {
    private Address address;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
        System.out.println("Inside Set Address");
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
        return "Emp{" +
                "address=" + address +
                '}';
    }
}
