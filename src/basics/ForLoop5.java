package basics;
/**
 * The problem that we are going to resolve:
 * We have a temperature sensor and a
 * fan connected to a microcontroller.
 * We have to program our microcontroller
 * in the following way:
 * 1 whenever the temperature is greater 
 * than 40 degrees, turn on the fan
 * 2 otherwise turn it off
 * 
 * @author asier
 * Sep 24, 2026
 */
public class ForLoop5 {
	public static void main(String[] args) {

//		Le doy valores al sensor de temperatura
		int[] temperaturas = {25, 38, 42, 40, 45, 30};

//		Hago un bucle for
		for (int i = 0; i < temperaturas.length; i++) {

			int temperatura = temperaturas[i];
			boolean ventiladorEncendido;

			if (temperatura > 40) {
				ventiladorEncendido = true;
			} else {
				ventiladorEncendido = false;
			}

			System.out.println("Lectura " + (i + 1) + ": " + temperatura + " grados");

			if (ventiladorEncendido) {
				System.out.println("-> Ventilador ENCENDIDO");
			} else {
				System.out.println("-> Ventilador APAGADO");
			}
		}
	}
}