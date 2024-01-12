package lifecycle.model;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class InterFace implements InitializingBean, DisposableBean {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public InterFace(String name) {
        this.name = name;
    }

    public InterFace() {
        super();
    }

    @Override
    public String toString() {
        return "InterFace{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public void destroy() throws Exception {  //this method is provided by DisposableBean interface
        System.out.println("Inside destroy Method which is provided by DisposableBean interface");
    }

    @Override
    public void afterPropertiesSet() throws Exception { //this method is provided by InitializingBean interface
        System.out.println("Inside init Method which is provided by InitializingBean interface");
    }
}
