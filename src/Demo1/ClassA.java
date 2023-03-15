package Demo1;

public class ClassA {

	
		// TODO Auto-generated method stub
		public int publicVariable=1;
		int defaultVariable=2;
		private int privateVariable=3;
		protected int protectedVariable=4;
		public static void main(String[] args) {
	}
	
	public void publicMethod() {
		System.out.println("public method");
		ClassA ca= new ClassA();
	}

	
 void defaultMethod() {
		System.out.println("Defaultmethod");
	}
	private void privateMethod() {
		System.out.println("private method");
	}
	protected void protectedMethod() {
		System.out.println("protected method");
	}
}
