package removexml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import removexml.model.Student;


public class RemoveMain {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("removexml.config");
        Student s = context.getBean("student", Student.class);
        System.out.println(s);
        s.study();
    }
}
