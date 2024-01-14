package springexpressionlanguage.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {
    @Value("#{10+20}") //this is called spring expression language
    private int x;
    @Value("#{10+20+30+40}") //this is called spring expression language
    private int y;
    @Value("#{T(java.lang.Math).sqrt(25)}") //this is called spring expression language
    private int z;
    //T is a class
    //java.lang.Math is a class
    //sqrt is a method of Math class
    //25 is the argument of sqrt method
    @Value("#{T(java.lang.Math).PI}") //Here PI is a static variable of Math class
     private double a;
    @Value("#{new java.lang.String('Pranay')}") //Here new java.lang.String('Pranay') is a object of String class
    private String name;
    @Value("#{8>2}") //Here 8>2 is a boolean expression
    private boolean isActive;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Demo{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                ", a=" + a +
                ", name='" + name + '\'' +
                ", isActive=" + isActive +
                '}';
    }
}
