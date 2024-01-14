package removecomponent.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import removecomponent.model.Address;
import removecomponent.model.Student;

@Configuration
public class JavaConfig {
    @Bean// @Bean use to create object of Address class and store it in container
    public Address getAddress() {
        Address address = new Address();
        return address;
    }
    @Bean(name = {"student", "getStudent", "getStudentBean", "temp"})
    public Student getStudent() {
        Student student = new Student(getAddress());
        return student;
    }
}
