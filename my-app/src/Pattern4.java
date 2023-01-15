
public class Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=10;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				
				if((i==0 && j<n) || j==0 ||(i==n-1 && j<n-1)|| (j==n-1 &&i>0 &&i<n-1) )
				{
				System.out.print("*");
				}
				else
				{
				System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		//Method 2
		System.out.println("\n---- Method 2 ----\n");
		for(int x=0; x<n;x++) {
			
			for(int y=0; y<n; y++) {
				
				if(y==0 || y == n-1 || x==0 || x==n-1) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println(" ");
		}
		
		//Method 3
				
		System.out.println("\n---- Method 3 ----\n");
		for(int x=0; x<n;x++) {
			
			for(int y=0; y<n; y++) {
				
				if(y==0 || y == n-1 || x == (n-1)/2) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println(" ");
		}

	}

}
