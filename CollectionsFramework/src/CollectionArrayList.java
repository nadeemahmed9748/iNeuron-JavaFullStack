//To use any of the collection classes we need to import
import java.util.*;
public class CollectionArrayList 
{

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) 
	{
		ArrayList<Integer> al1=new ArrayList<Integer>();
		al1.add(10);
		al1.add(20);
		al1.add(30);
		//Homogeneous type of data is allowed
		System.out.println(al1);
		System.out.println("********************");
		
		ArrayList<Comparable> al2=new ArrayList<Comparable>();
		al2.add("iNeuron");
		al2.add(28);
		al2.add('b');
		al2.add(18.5);
		al2.add(18.5);
		
		System.out.println(al2);
		
		
		System.out.println("************************");
		
		// we can add entire collection into another collection
		ArrayList<Comparable> al3=new ArrayList<Comparable>();
		al3.addAll(al2);
		
		System.out.println(al3);
		
		System.out.println("*********************");
		
		ArrayList<Comparable> al4=new ArrayList<Comparable>();
		al4.add(11);
		al4.add(22);
		al4.add(33);
		al4.add(44);
		System.out.println("existing data " + al4);
		
		al4.add(2, 28);
		
		System.out.println("after adding in 2nd index "+al4);
		al4.add(0, 5);
		
		System.out.println("after adding in 0th index "+al4);
		
		al4.add(55);
		
		System.out.println("after adding in rear end "+al4);
		System.out.println("after adding in rear end "+al2);
		
		al4.addAll(2, al2);
		System.out.println(al4);
		
		System.out.println("------Element Contains--------");

		System.out.println(al4.contains(44));//true
		
		int index=al4.indexOf(22);
		System.out.println(index);//1
		
		System.out.println(al4.isEmpty());
		al4.ensureCapacity(10);
		System.out.println(al4.size());
		al4.trimToSize();
		System.out.println(al4.getClass());
		
		al4.clear();
		System.out.println(al4);
		System.out.println(al4.size());
		
		List<String> items = new ArrayList<>();

        items.add("coins");
        items.add("pens");
        items.add("keys");
        items.add("sheets");

        items.forEach((name) -> 
            System.out.println(name)
        );

		

	}

}
