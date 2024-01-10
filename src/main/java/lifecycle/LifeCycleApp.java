package lifecycle;

import lifecycle.model.Method;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifeCycleApp {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("lifecycle.xml");
        Method method = (Method) context.getBean("m1");
        System.out.println(method);

        //Register Shutdown hook
        context.registerShutdownHook();
    }
}
