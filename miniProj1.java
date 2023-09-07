//Mini project 1
//Kevin Johanson 9/1/2023




package Package1;

public class miniProj1 {

	public static void main(String[] args) {
			
		   java.io.PrintWriter pen = new java.io.PrintWriter(System.out, true);
		   
		   String cipherText = "dahhksknhz";
		   String plainText = "helloworld";
		   
		   
		   
		   decode(cipherText);
		   
		   encode(plainText);
	}
	public static void decode(String cipherText) {
		java.io.PrintWriter pen = new java.io.PrintWriter(System.out, true);
		pen.println("Decode: ");
		
		for (int n = 0; n <= 25; n++) {
			pen.print("n = " + n + ": ");
			
			for (int i = 0; i <= (cipherText.length()-1); i++) {
				char currentVar = cipherText.charAt(i); // gets the string[i]
				int currentInt = (int) currentVar; // converts char to int
				int newInt = ((currentInt - n) - 97) ; // subtracts the shifter and the base ascii value for lowercase #'s
				int wrapInt = ((((newInt % 26) + 26) % 26) + 97); // wraps the int around
				pen.print(  (char) wrapInt + " ");
			}
			pen.println();
		}
		
	}
	public static void encode(String plainText) {
		java.io.PrintWriter pen = new java.io.PrintWriter(System.out, true);
		pen.println("Encode: ");
		
		for (int n = 0; n <= 25; n++) {
			pen.print("n = " + n + ": ");
			
			for (int i = 0; i <= (plainText.length()-1); i++) {
				char currentVar = plainText.charAt(i); // gets the string[i]
				int currentInt = (int) currentVar; // converts char to int
				int newInt = ((currentInt - n) - 97) ; // subtracts the shifter and the base ascii value for lowercase #'s
				int wrapInt = ((((newInt % 26) + 26) % 26) + 97); // wraps the int around
				pen.print(  (char) wrapInt + " ");
			}
			pen.println();
		}		
	
	}
}









 
