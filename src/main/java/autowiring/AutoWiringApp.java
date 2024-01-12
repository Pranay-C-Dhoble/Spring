package autowiring;

import autowiring.model.Emp;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutoWiringApp {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("autoWiring.xml");
        Emp emp = context.getBean("emp1", Emp.class);
        System.out.println(emp);
    }
}
