
public class ThisKeywordDemo {
int x;
int y;
String s;
public ThisKeywordDemo(){
	
	System.out.println("default");
}
public ThisKeywordDemo(int x, int y) {
	this.x=x;
	this.y=y;
	System.out.println(x+y);
	System.out.println("default");
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisKeywordDemo th= new ThisKeywordDemo(5,2);
		th.getData();
		//th.getData1();
	}
	public void getData() {
//		int x=50;
//		int y=40;
		System.out.println(this.x+this.y);
		//System.out.println(x+y);
	}
	public void getData1() {
		int x=50;
		int y=40;
		System.out.println(this.x+this.y);
		System.out.println(x+y);
		this.getData();
		getData();
	}

}
