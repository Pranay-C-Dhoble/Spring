package reference.model;

public class ARef {
    private int abc;
    private BRef xyz;

    public int getAbc() {
        return abc;
    }

    public void setAbc(int abc) {
        this.abc = abc;
    }

    public BRef getXyz() {
        return xyz;
    }

    public void setXyz(BRef xyz) {
        this.xyz = xyz;
    }

    public ARef(int abc, BRef xyz) {// parameterized constructor
        this.abc = abc;
        this.xyz = xyz;
    }
    public ARef() { // default constructor
        super();
    }
}
