package removecomponent;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import removecomponent.model.Student;

public class RemoveComponentMain {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("removecomponent.config");
        Student s = context.getBean("temp", Student.class);
        System.out.println(s);
        s.study();
    }
}
