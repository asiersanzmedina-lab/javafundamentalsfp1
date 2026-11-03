package oopmodellingExc;

public class Oak extends Tree {

    int acorns;

    public Oak(String name, int age, String barkColor, int acorns) {
        super(name, age, barkColor);
        this.acorns = acorns;
    }
}