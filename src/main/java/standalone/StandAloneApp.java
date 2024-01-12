package standalone;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import standalone.model.Person;

public class StandAloneApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("standAlone.xml");
        Person person = context.getBean("person1",Person.class);
        System.out.println(person);
    }
}
