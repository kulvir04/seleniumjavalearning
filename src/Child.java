
public class Child extends Parent{
	String empName="Jai";
	int empNo=342334;
	public Child() {
		super(3);
	}
	public static void main(String[] args) {
		Child c=new Child();
		c.getData();
		
	}
	public void getData(){
		
	
	System.out.println(empName);
	System.out.println(empNo);
}
}