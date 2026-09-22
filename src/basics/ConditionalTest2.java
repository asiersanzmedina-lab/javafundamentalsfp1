package basics;

public class ConditionalTest2 {

	public static void main(String[] args) {

		// step 1: crear variables para almacenar información
		float score = 150;
		// step 2: modelar el escenario de diferentes casos using condicionales
		if (score >= 100) {
			System.out.println("No, that score is not possible!!!!");
		} else {
			System.out.println("I am going to have a nice afternoon!!!");
		}

		// usar if, else if, else para modelar a scenario in wich
		// the cases are exclusive among them
		score = 70;
		if (score >= 100) {
			System.out.println("No, that score is not possible!!!!");
		} else if (score < 100 && score > 60) {
			System.out.println("The score is high, I am going to pass the exam");
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
