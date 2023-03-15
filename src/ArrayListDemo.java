import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList al= new ArrayList();
al.add(10);
al.add("RCV");
al.add(true);
al.add(20);
al.add(20);
System.out.println(al.size());

System.out.println(al);
int k=(Integer)al.get(0);
al.remove(0);
al.add("RCV");
al.add(true);
System.out.println(al);
System.out.println(al.get(0));
for(int i=0;i<al.size();i++)
{
	System.out.println(al.get(i));
}
for(Object obj:al) {
	System.out.println(obj);
}

Iterator itr =al.iterator();
while(itr.hasNext()) {
	System.out.println(itr.next());
}


	}

}
