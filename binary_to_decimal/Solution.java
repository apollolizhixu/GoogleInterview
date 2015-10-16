package binary_to_decimal;

public class Solution {

	public static void main(String[] args) {

        for (int number = 1; number < 100; number++) {
        	//System.out.println(printBinary(number));
        	System.out.println(printHex(number));
        }

            
        //System.out.println(printHex(35));
   }
	
	private static String printHex(int number){
		String rst = "";
		while (number > 0){
			int tmp = number % 16;
			char exten;
			
			switch(tmp){
				case 10: 
					exten = 'A';
					break;
				case 11:
					exten = 'B';
					break;
				case 12:
					exten = 'C';
					break;
				case 13:
					exten = 'D';
					break;
				case 14:
					exten = 'E';
					break;
				case 15:
					exten = 'F';
					break;
				default:
					exten = (char)(48 + tmp);
			}
			rst = exten + rst;
			number /= 16;
		}
		return rst;
	}
	public String printHex1(int num) {
		if (num < 16) {
			return Integer.toString(num);
		}
		StringBuilder sb = new StringBuilder();
		char c;
		while (num > 0) {
			int digit = num % 16;
			switch(digit) {
				case 10:
					c = 'A';
					break;
				case 11:
					c = 'B';
					break;
				case 12:
					c = 'C';
					break;
				case 13:
					c = 'D';
					break;
				case 14:
					c = 'E';
					break;
				case 15:
					c = 'F';
					break;
				default:
					c = (char)(48 + digit);
			}
			sb.insert(0, c);
			num /= 16;
		}
		return sb.toString();
	}

    private static void printBinaryform(int number) {
        int remainder;

        if (number <= 1) {
            System.out.print(number);
            return;   // KICK OUT OF THE RECURSION
        }

        remainder = number %2; 
        printBinaryform(number >> 1);
        System.out.print(remainder);
    }
    	public static String printBinary(int num) {
    		StringBuilder sb = new StringBuilder();
    		return printBinary(num, sb);
    	}
    	public static String printBinary(int num, StringBuilder sb) {
    		if (num <= 1) {
    			sb.insert(0, num % 2);
    			return sb.toString();
    		}
    		sb.insert(0, num % 2);
    		return printBinary(num >> 1, sb);
    	}
}
