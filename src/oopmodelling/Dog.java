package oopmodelling;

// Clase Dog (Perro)
public class Dog {

    // Atributos de todos los perros (privados)
    private String nombre;
    private String raza;
    private int edad;
    private String color;
    private double peso;

    // Constructor 1: vacío
    public Dog() {
    }

    // Constructor 2: solo con nombre y raza
    public Dog(String nombre, String raza) {
        this.nombre = nombre;
        this.raza = raza;
    }

    // Constructor 3: con todos los datos
    public Dog(String nombre, String raza, int edad, String color, double peso) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.color = color;
        this.peso = peso;
    }

    // Aquí empieza el programa
    public static void main(String[] args) {

        // Perro creado con el constructor 1 (vacío)
        Dog perro1 = new Dog();

        // Perro creado con el constructor 2
        Dog perro2 = new Dog("Rex", "Pastor Alemán");

        // Perro creado con el constructor 3
        Dog perro3 = new Dog("Luna", "Labrador", 3, "Marrón", 25.5);

        System.out.println("Perros creados correctamente");
    }
}

