package lifecycle.model;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Annotation {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("I am in SetName Method of Annotation class");
        this.name = name;
    }

    public Annotation(String name) {
        this.name = name;
    }
    public Annotation(){
        super();
    }

    @Override
    public String toString() {
        return "Annotation{" +
                "name='" + name + '\'' +
                '}';
    }
    @PostConstruct
    public void init(){
        System.out.println("Inside init Method which is provided by @PostConstruct annotation");
    }
    @PreDestroy
    public void destroy(){
        System.out.println("Inside destroy Method which is provided by @PreDestroy annotation");
    }
}
