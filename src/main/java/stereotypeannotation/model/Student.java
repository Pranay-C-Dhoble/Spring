package stereotypeannotation.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("obj")
//@Scope("prototype")
public class Student {
    @Value("Pranay Dhoble")
    private String name;
    @Value("Pune")
    private String city;
    @Value("#{list}")
    private List<String> Address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public List<String> getAddress() {
        return Address;
    }
    public void setAddress(List<String> address) {
        Address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", Address=" + Address +
                '}';
    }
}
