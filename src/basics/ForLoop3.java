package basics;
/**
 * Sep 22/09
 * @author asier
 *
 */
public class ForLoop3 {
	
	public static void main(String[] args) {
//		Print all evem numbers between 5 and 102
//		for (int i = 4; i <= 102; i = i + 1) {
//		System.out.println(i);
//		}

//		Print all evem numbers between 5 and 102
		for (int i = 5; i <= 102; i = i + 1) {
//			if the value of i is even, we print it
			if(i % 2 == 0) {
			System.out.println(i);
			}
		}
		
//		Print all evem numbers between 5 and 102
		for (int i = 5; i <= 102; i = i + 1) {
//			if the value of i is even, we print it
			/**	"i % 2 =0 1"
			 * is equivalent to
			 * "i % 2 != 0"
			 * "!=" means not equal
			 * "==" means equal
			 */
			if(i % 2 != 0) {
				System.out.println(i);
			}
		}
	}
}
