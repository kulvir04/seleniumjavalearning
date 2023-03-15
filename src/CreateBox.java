
public class CreateBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Common cm= new Common();
//int h=cm.length=10;
//int b=cm.breadth=-20;
//int l=cm.height=30;
int l=cm.setLength(-20);
int b=cm.setWidth(-20);
int h=cm.setHeight(10);
cm.setBoxDimension(l, b, h);
System.out.println(cm.getLength());
	}

}
