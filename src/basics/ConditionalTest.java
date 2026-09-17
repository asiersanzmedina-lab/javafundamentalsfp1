package basics;
/**
 * To format your code
 * Ctrl + shift + f
 * Sep 17 09
 */
public class ConditionalTest {
	public static void main(String[] args) {
 
		// step 1: crear variables para almacenar información
		float temperature = 150;
		// step 2: modelar el escenario de diferentes casos using condicionales
		if (temperature >= 100) {
			System.out.println("No, we are going to be cooked!!!!");
		} else {
			System.out.println("I am going to have a nice afternoon!!!");
		}
 
		// usar if, else if, else para modelar a scenario in wich
		// the cases are exclusive among them
		temperature = 70;
		if (temperature >= 100) {
			System.out.println("No, we are going to be cooked!!!!");
		} else if (temperature < 100 && temperature > 60) {
			System.out.println("The temperature is too high, I am going to get water");
		} else {
			System.out.println("I am going to have a nice afternoon!!!");
		}
 
		// robotaxi
		boolean isAdvancing = true;
 
		if (isAdvancing) {
			System.out.println("El robotaxi está avanzando...");
		}
	}
}