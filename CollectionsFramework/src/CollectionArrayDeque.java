import java.util.ArrayDeque;

public class CollectionArrayDeque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayDeque<Integer> ad=new ArrayDeque<Integer>();
		ad.add(10);
		ad.add(20);
		ad.add(30);
		ad.add(30);
		System.out.println(ad);
		ad.addFirst(5);
		ad.addLast(35);
		System.out.println(ad);
		System.out.println(ad.contains(20));
		

	}

}
