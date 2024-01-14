package removecomponent.model;

public class Student {
    private Address address;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Student(Address address) {
        this.address = address;
    }

    public void study() {
        this.address.getAddress();
        System.out.println("Student is studying");
    }
}
