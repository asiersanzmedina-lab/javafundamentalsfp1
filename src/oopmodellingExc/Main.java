package oopmodellingExc;

public class Main {

    public static void main(String[] args) {
        Oak oak = new Oak("Roble", 50, "marrón", 200);
        Pine pine = new Pine("Pino", 30, "gris", 12.5);

        System.out.println(oak.name + " " + oak.age + " " + oak.barkColor + " " + oak.acorns);
        System.out.println(pine.name + " " + pine.age + " " + pine.barkColor + " " + pine.needleLength);
    }
}