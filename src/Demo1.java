
public class Demo1 {
	public static void main(String[] args) {

		int j = 20;
		Demo1 dy = new Demo1();

		byte bt = -128;
		int myInt = 76546;
		long lng = 87789L;
		float myFloat = 2.4f;
		double myDouble = 1.4677899d;
		boolean boool = false;
		char ch = 'c';
		String str1 = "RCV";
		String str2 = "RCV";
		String str3 = new String("RCV");
		System.out.println(str1 == str2);
		System.out.println(str1 == str3);
		System.out.println(str1.equals(str3));
		int myNumber = 10;
		char ch1 = 'A';
		System.out.println(str1 + ch);
		int nyNum1 = 10;
		int myNum = 20;
		myNum++;
		boolean bool = !true;

		System.out.println(nyNum1 + myNum);
		myNum--;
		System.out.println(nyNum1 + myNum);

		System.out.println(bool);
		if (nyNum1 > myNum) {
			System.out.println("Numbers are equal");
		} else {
			System.out.println("Numbers are not equal");
		}
		if ((nyNum1 == 10) || (myNum == 20)) {
			System.out.println(true);
		}

		int a = 20;
		int b = 30;
		int c = 40;
		if (a > b) {
			System.out.println("a is gretaer than b");

			if (b < c) {
				System.out.println("b is greater");
			}

			else {
				System.out.println("c is greater");
			}

		}

		// Ternary operator
		String result = (a > b) ? "a>b" : "a<b";
		System.out.println(result);

	}

	/*
	 * switch(expression){ case1: Statement; case 2: Statement . ; default:
	 * statements
	 * 
	 * 
	 * 
	 * 
	 */


}