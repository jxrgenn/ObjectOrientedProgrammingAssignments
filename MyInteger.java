public class MyInteger {
	int value;

	public MyInteger(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public boolean isEven() {
		return value%2==0;
	}

	public boolean isOdd() {
		return value%2!=0;
	}

	public boolean isPrime() {
		boolean isItPrime = true;

		if (value <= 1) {
			isItPrime = false;

			return isItPrime;
		} else {
			for (int i = 2; i <= value / 2; i++) {
				if ((value % i) == 0) {
					isItPrime = false;

					break;
				}
			}
		}
		return isItPrime;
	}
	
	public static boolean isEven(int x) {
		return x%2==0;
	}

	public static boolean isOdd(int x) {
		return x%2!=0;
	}
	
	public static boolean isPrime(int x) {
		boolean isItPrime = true;

		if (x <= 1) {
			isItPrime = false;

			return isItPrime;
		} else {
			for (int i = 2; i <= x / 2; i++) {
				if ((x % i) == 0) {
					isItPrime = false;

					break;
				}
			}
		}
		return isItPrime;
	
	}
	
	public static boolean isEven(MyInteger value) {
		return value.isEven();
	}
	
	public static boolean isOdd(MyInteger value){
		return value.isOdd();
	}
	
	public static boolean isPrime(MyInteger value) {
		return value.isPrime();
	}
	
	public static int parseInt(char[] a){
	    int result=0;
	    for(int i=0;i<a.length;i++){
	        result=result*10+(a[i]-'0');
	    }
	    return result;
	}
	
	public static int parseInt (String s)
	{
		return Integer.parseInt (s);
	}
}
