package constructor.model;

public class Addition {
    private int a;
    private int b;
    public Addition(double a, double b){
        this.a = (int) a;
        this.b = (int) b;
        System.out.println("Call Constructor double, double");
    }
    public Addition(int a, int b){
        this.a = a;
        this.b = b;
        System.out.println("Call Constructor int, int");
    }

    public Addition(String a, String b){
        this.a = Integer.parseInt(a);
        this.b = Integer.parseInt(b);
        System.out.println("Call Constructor String, String");
    }

    public void sum(){
        System.out.println("Value of a is : "+ this.a);
        System.out.println("Value of b is : "+ this.b);
        System.out.println("Addition of a and b is : " + (this.a + this.b));
    }
}
