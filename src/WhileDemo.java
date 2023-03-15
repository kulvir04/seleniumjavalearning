
public class WhileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i=1;

		do {
	
		System.out.println(i);
		i++;
	}	while (i<=10);
		System.out.println("go out");
		
		for(int d=1;d<=10;d++)
		{
			if(d==5)
			{
				continue;
			}
			System.out.println(d);
		}
}}