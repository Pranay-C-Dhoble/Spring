package stereotypeannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import stereotypeannotation.model.Student;
import stereotypeannotation.model.Teacher;

public class StereotypeApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("stereotype.xml");
        Student s = context.getBean("obj", Student.class);
        System.out.println(s);
        System.out.println(s.getAddress().getClass().getName());

        System.out.println(s.hashCode());

        Student s1 = context.getBean("obj", Student.class);
        System.out.println(s1.hashCode());

        System.out.println("--------------------------------------------------");

        Teacher t = context.getBean("teacher", Teacher.class);
        System.out.println(t);
        System.out.println(t.hashCode());

        Teacher t1 = context.getBean("teacher", Teacher.class);
        System.out.println(t1.hashCode());

    }

    //What is Spring Bean Scope?
    //Spring Bean Scope defines the life cycle and visibility of a bean instance.
    //Instance means object of the class.
    //In Spring, we can define the scope of a bean as Singleton or Prototype.

    //By default, the scope of the bean is Singleton.
    //Singleton: Only one instance of the bean will be created for each container.

    //Prototype: A new instance will be created every time the bean is requested.

    //Request: This is same as prototype scope, however it’s meant to be used for web applications.
    //Session: This is same as prototype scope, however it’s meant to be used for web applications.

    //Global-session: This is same as prototype scope, however it’s meant to be used for web applications.

}
