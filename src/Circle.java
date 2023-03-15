
public class Circle {

	public Circle() {
		System.out.println("No args");
	}
	public Circle(int n) {
		System.out.println("oneargument");
	}
	public Circle(int l, int m) {
		System.out.println("two argum");
	}
	public Circle(int n, int m, String s) {
		System.out.println(" three args");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle nm =new Circle(1,2,"adc");
	}

}
