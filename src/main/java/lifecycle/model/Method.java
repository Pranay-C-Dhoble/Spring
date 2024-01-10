package lifecycle.model;

public class Method {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("I am in SetName Method");
        this.name = name;
    }

    public Method(String name) {
        this.name = name;
    }
    public Method(){
        super();
    }

    @Override
    public String toString() {
        return "Method{" +
                "name='" + name + '\'' +
                '}';
    }
    public void init(){
        System.out.println("Inside init Method");
    }
    public void destroy(){
        System.out.println("Inside destroy Method");
    }
}
