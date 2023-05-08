import java.util.*;
import java.util.Map.Entry;

public class CollectionHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Map hm=new HashMap();
		//jdk 1.2
		//order of insertioin is not preserved
		HashMap<Integer, String> hm=new HashMap<Integer, String>();
		hm.put(10, "Sachin");//Entry
		hm.put(7, "MSD");
		hm.put(18, "Kohli");
		
		System.out.println(hm);
		
		System.out.println(hm.get(10) +" after this");
		System.out.println(hm.get(7));
		System.out.println("********************");

		Collection<String> c=hm.values();
		Iterator<String> itr=c.iterator();
		while(itr.hasNext())
		{
			//System.out.println(itr.next());
			String o=(String) itr.next();
			System.out.println(o);
		
		}
		System.out.println("********************");

		Set<Integer> s=hm.keySet();
		
		Iterator<Integer> itr2=s.iterator();
		while(itr2.hasNext())
		{
//			System.out.println(itr2.next());
			Integer i=(Integer) itr2.next();
			System.out.println("key : " + i);
		
		}
		System.out.println("********************");
		
		Set<?> es=hm.entrySet();
		Iterator<?> itr3=es.iterator();
		while(itr3.hasNext())
		{
//			System.out.println(itr3.next());
			Map.Entry<?, ?> data =(Entry<?, ?>) itr3.next();
			System.out.println(data.getKey()+ " :" + data.getValue());
		}
		System.out.println("********************");
		//jdk 1.4
		//maintains order of insertion
		LinkedHashMap<Integer, String> lhm=new LinkedHashMap<Integer, String>();
		lhm.put(10, "Sachin");
		lhm.put(7, "MSD");
		lhm.put(18, "Kohli");
		
		System.out.println(lhm);
	}

}
