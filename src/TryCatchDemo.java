
public class TryCatchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
int i=10;
System.out.println("Before Division");
System.out.println(i/2);

		}
	catch(Throwable t) {
		
		System.out.println(t.getMessage());
		System.out.println(t.getCause());
	t.getStackTrace();
	t.printStackTrace();
	}
		finally {
			System.out.println("This is finally");
		}
	System.out.println("After Division");
	}

}
