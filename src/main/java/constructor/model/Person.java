package constructor.model;

import java.util.List;

public class Person {
    private String name;
    private int personId;
    private Certificate certi;
    private List<String> list;
    public Person(String name, int personId, Certificate certi, List<String>list){
        this.name = name;
        this.personId = personId;
        this.certi = certi;
        this.list = list;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", personId=" + personId +
                ", certi=" + certi.certi1 +
                ", list=" + list +
                '}';
    }
}
