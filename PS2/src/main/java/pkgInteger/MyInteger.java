package pkgInteger;

public class MyInteger {
	public static void main(String[]args) {
	}
	public MyInteger(int iValue) {
		super();
		MyInteger.iValue = iValue;
	}

	public static int iValue;
	

	public int get() {
		return iValue;
	}

	public void setiValue(int iValue) {
		MyInteger.iValue = iValue;
	}

	public boolean isEven() { 
		return isEven(iValue);
	}

	public boolean isOdd() {
		return isOdd(iValue); 
	}

	public boolean isPrime() {
		return isPrime(iValue);
	}

	public static boolean isEven(int x) {
		if (x % 2 == 0)
			return true;
		else
			return false;
	}
	public static boolean isOdd(int x) {
		if (x % 2 == 1)
			return true;
		else
			return false;
	}
	public static boolean isPrime(int x) {
	    for (int i=3; i*i<=x; i+=2) {
	        if ((x%i) == 0)
	            return false;
	    }
	    return true;
	}
	public boolean isEven(MyInteger m) {
		return isEven(MyInteger.iValue);
	}
	public boolean isOdd(MyInteger m) {
		return isOdd(MyInteger.iValue);
	}
	public boolean isPrime(MyInteger m) {
		return isPrime(MyInteger.iValue);
	}
	public static boolean equals(int x) {
		if (x ==iValue) {
			return true; }
		else
			return false;
	}
	public static boolean equals(MyInteger m) {
		if (MyInteger.iValue == iValue)
			return true;
		else
			return false;
	}

}