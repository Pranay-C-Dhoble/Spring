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

    //Spring Stanalone Collection Injection
    //it is used to inject the collection values into the bean class
    //Spring provides the following collection types
    //1. List
    //2. Set
    //3. Map
    //4. Properties  //properties means key value pair


    //Add Schema in the XML file
    //xmlns:util="http://www.springframework.org/schema/util"
}
