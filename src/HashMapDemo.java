import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//HashMap contains data as Key, Value pairs
HashMap<String, String> hm1= new HashMap<String, String>();
hm1.put("ga","http://qa.com");
hm1.put("uat","http://uat.com");

hm1.put("prepod","http://prepod.com");
hm1.put("prod","http://prod.com");
System.out.println(hm1);
hm1.remove("ga");
System.out.println(hm1);
hm1.remove("uat", "http://uat.com");
System.out.println(hm1);
//Set s=hm1.keySet();
for(String key:hm1.keySet()) {
	System.out.println("Key is"+key+ " Value is  "+hm1.get(key));
}

Set s= hm1.keySet();
Iterator<String> itr=s.iterator();
while(itr.hasNext()) {
	String key=itr.next();
System.out.println("Key is"+key+"Value is"+hm1.get(key));


	}

}}
