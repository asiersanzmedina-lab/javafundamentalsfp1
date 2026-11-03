package oopmodellingExc;

public class Pine extends Tree {

    double needleLength;

    public Pine(String name, int age, String barkColor, double needleLength) {
        super(name, age, barkColor);
        this.needleLength = needleLength;
    }
}