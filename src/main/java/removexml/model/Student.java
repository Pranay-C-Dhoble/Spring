package removexml.model;

import org.springframework.stereotype.Component;

@Component //Using @Component annotation we can remove the bean definition from the xml file
// @Component("student") //We can also give the name of the bean using @Component annotation
//@Component we Say Create the bean with the name of the class with the first letter in lower case
public class Student {
    public void study() {
        System.out.println("Student is studying");
    }
}
