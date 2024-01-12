package autowiringusingannotation;

import autowiringusingannotation.model.Emp;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutoWiringAnnotationApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("autoWiringAnnotation.xml");
        Emp emp = context.getBean("emp1", Emp.class);
        System.out.println(emp);
    }
}
