import java.util.Scanner;

public class Exercise43 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number or character: ");
		String userInput = input.nextLine();
		
		if (userInput.length() == 1) {
			char ch = userInput.charAt(0);
			if (ch <= 'F' && ch >= 'A') {
				int value = ch - 'A' + 10;
				String bin = Integer.toBinaryString(value);

				System.out.println("Decimal value is: " + value);
				System.out.println("Binary Value is: " + bin);	
			}
			else if (Character.isDigit(ch)) {
				int result = Integer.parseInt(userInput);
				String bin = Integer.toBinaryString(result);
				
				System.out.println("Decimal value is: " + ch);
				System.out.println("Binary Value is: " + bin);
			}	
			else {
				System.out.println("Invalid input");
			}
		} else if (Integer.parseInt(userInput) < 16) {
			int result = Integer.parseInt(userInput);

			String hex = Integer.toHexString(result);
			String bin = Integer.toBinaryString(result);
			
			System.out.println("Hex value is: " + hex);
			System.out.println("Binary value is: " + bin); 
			
			} else {
				System.out.println("Invalid input");
			}
		} 
	
	}
