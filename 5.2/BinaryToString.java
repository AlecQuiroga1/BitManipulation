
public class BinaryToString {

	public static void main(String[] args) {
		
		double num = 0.625;
		
		System.out.println(doubleToBinary(num));

	}
	
	public static String doubleToBinary(double num) {
		String binary = ".";
		
		while (num != 0) {
			
			num = num*2;
			
			if (num >= 1.00) {
				num = num-1;
				binary = binary +"1";
			} else {
				
				binary = binary +"0";
			}
			
			
			// Checks that the length of the binary string is less than 32
			if(binary.length() >= 32) {
				binary = "ERROR";
				return binary;
			}
		}
		
		return binary;
		
	}

}
