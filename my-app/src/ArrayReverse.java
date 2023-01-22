class Reverse{
	
	void FuncRev(int[] arr) {
		for(int i=arr.length-1; i>=0 ;i--)
		{
			System.out.print(arr[i] + " ");
		}
	}
}

public class ArrayReverse {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] ar= {44,25,10,20,30,40};
		Reverse obj = new Reverse();
		obj.FuncRev(ar);
	}
}
