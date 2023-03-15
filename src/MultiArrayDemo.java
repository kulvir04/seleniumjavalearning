
public class MultiArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[][] myMultiDimArray= new int[2][3];
MultiArrayDemo md= new MultiArrayDemo();
md.dologin();
md.addNumbers(7, 3);
myMultiDimArray[0][0]=2;
myMultiDimArray[0][1]=3;
myMultiDimArray[0][2]=4;
myMultiDimArray[1][0]=5;
myMultiDimArray[1][1]=6;
myMultiDimArray[1][2]=7;
System.out.println(myMultiDimArray[1][1]);
int myMultiDimArray1[][]= {{2,3,4},{5,6,7}};
System.out.println(myMultiDimArray1[1][1]);
for(int i=0;i<myMultiDimArray1.length;i++)
{
	for(int j=0;j<myMultiDimArray1[i].length;j++)
	{
		System.out.println(myMultiDimArray1[i][j]);
	}

	}
	}
	public char dologin() {
	System.out.println("this");
		return 'c';
	}
	public int addNumbers(int x, int y) {
		int z=x+y;
		return z;
	}

	public void diffaddNumbers(int x, String s, float y) {
		System.out.println(x);	
	System.out.println(s);
	System.out.println(y);}
}