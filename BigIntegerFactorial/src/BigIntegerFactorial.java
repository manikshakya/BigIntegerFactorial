import java.math.BigInteger;
import java.net.URL;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;


/*
	Calculate and print the factorial of a given integer.
*/

class BigIntegerFactorial{
	public static void main(String[] args) {
		// Find factorial.
		extraLongFactorials(25);
	}
	
	public static void extraLongFactorials(int n) {
		BigInteger re = new BigInteger(1 + "");
		
		if(n == 0) System.out.println(1);
		else {
			System.out.println(fac(new BigInteger(1 + ""), new BigInteger(1 + ""), new BigInteger(n + "")));
		}
		
	}
	private static BigInteger fac(BigInteger re, BigInteger c, BigInteger n) {
		if(c.equals(n)) return re;
		else {
			System.out.println(re.multiply(c.add(new BigInteger(1+""))));
			return fac(re.multiply(c.add(new BigInteger(1+""))), c.add(new BigInteger(1+"")), n);
		}
		
	}
}