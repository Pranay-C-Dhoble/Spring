package reference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import reference.model.ARef;
import reference.model.BRef;

public class ReferenceApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ref.xml");
        ARef aRef = (ARef) context.getBean("aRef"); // aRef is the id of the bean in reference.xml
        System.out.println(aRef.getAbc());
        System.out.println(aRef.getXyz().getPqr());



//        ARef aRef = new ARef();
//        BRef bRef = new BRef();
//        bRef.setPqr(20);
//        aRef.setXyz(bRef);
//        aRef.setAbc(10);
////        aRef.getXyz().setPqr(20);
//        System.out.println(aRef.getAbc());
//        System.out.println(aRef.getXyz().getPqr());
    }
}
