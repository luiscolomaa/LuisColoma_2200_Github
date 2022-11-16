/************************************
 * 
 *@author Luis Coloma
 * 
 */
import java.util.Scanner;
public class Exercise06_04v2 {
	public static void main(String[] args) {
		System.out.print("Enter an integer: ");
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		reverse(number);
		input.close();	
	}
	public static int reverse(int n) {
		 boolean isNegative = n < 0 ? true : false;
	        if(isNegative){
	            n = n * -1;
	        }
	        int reverse = 0;
	        int lastDigit = 0;

	        while (n >= 1) {
	            lastDigit = n % 10;
	            reverse = reverse * 10 + lastDigit;
	            n = n / 10; 
	        }

	        return isNegative == true? reverse*-1 : reverse;
	        

		}

	}

