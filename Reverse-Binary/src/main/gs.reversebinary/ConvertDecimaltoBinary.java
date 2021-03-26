package main.gs.reversebinary;

public class ConvertDecimaltoBinary {

	public static void main(String[] args) {

		String str = "47";

		String reversedDecimalNumber = BinaryReversal(str);
		
		System.out.println(reversedDecimalNumber);

	}

	private static String BinaryReversal(String str) {

   /*
	* Converting string representation of decimal number to binary number and padding to 8 bits
	*/
	String binaryNumber = String.format("%8s", Integer.toBinaryString(Integer.valueOf(str))).replaceAll(" ", "0");

	/*
	 * Reversing the binary number
	 */
	StringBuilder sb = new StringBuilder();

	for(int i=binaryNumber.length()-1; i>=0; i--) {
		sb.append(binaryNumber.charAt(i));
	}

	String reversedBinaryNum = sb.toString();

	/*
	* Converting he reversed binary number to decimal number
	*/
	String decimalNum = String.valueOf(Integer.parseInt(reversedBinaryNum, 2));

		return decimalNum;

	}

}
