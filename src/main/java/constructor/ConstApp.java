package constructor;

import constructor.model.Addition;
import constructor.model.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("constructor.xml");
        Person person = (Person)context.getBean("person1");
        System.out.println(person);

        Addition addition = (Addition) context.getBean("add");
        addition.sum();
    }
}
