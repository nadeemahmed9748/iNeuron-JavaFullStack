import java.util.*;
public class CollectionPriorityQueue 
{

	public static void main(String[] args) 
	{
		
        PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
        pq.add(100);
        pq.add(50);
        pq.add(150);
        pq.add(25);
        pq.add(75);
        pq.add(125);
        pq.add(175);
        System.out.println(pq);
        pq.add(25);
        System.out.println(pq);
        
	}

}
