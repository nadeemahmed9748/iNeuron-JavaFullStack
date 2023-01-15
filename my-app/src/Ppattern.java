
public class Ppattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("\n---- Assignment B ----\n");
		int m=11;
		for(int i=0; i<=m; i++) {
			for(int j=0; j<=m; j++) {
				
				if((i==0 && j<(m-1)/2) || (i==(m-1)/2 && j<(m-1)/2) || (i==m-1 && j<(m-1)/2) ||
						(j==0 && i<m-1) || (j==(m-1)/2 && i<m-1 && i>0 && i!=(m-1)/2)) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		System.out.println("\n---- Assignment H ----\n");
		
		int n1 = 11;
		for(int i=0; i<=n1; i++) {
			for(int j=0; j<=n1; j++) {
				
				if(j==0 || j==(n1-1)/2 || (i==(n1-1)/2 && j<(n1-1)/2)) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		System.out.println("\n---- Assignment O ----\n");
		int m1 = 11;
		for(int i=0; i<=m1; i++) {
			for(int j=0; j<=m1; j++) {
				
				if(	(i==0 && j>0 && j<(m1-1)/2) || (i==m1-1 && j>0 && j<(m1-1)/2) ||
					(j==0 && i>0 && i<(m1-1)) || (j==(m1-1)/2 && i>0 && i<m1-1)) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		System.out.println("\n---- Assignment G ----\n");
		int x = 11;
		for(int i=0; i<=x; i++) {
			for(int j=0; j<=x; j++) {
				
				if(	(i==0 && j>0 && j<(3*x)/4) || (i==x-1 && j>0 && j<(x-1)/2) ||
					(j==0 && i>0 && i<(x-1)) || (j==(x-1)/2 && i>=(x-1)/2 && i<x-1) ||
					(i==(x-1)/2 && j>=(x-1)/2 && j<(3*x)/4) || (j==(3*x)/4 && i>=(x-1)/2 && i<x-1)) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		System.out.println("\n---- Assignment P ----\n");
		
		int y = 11;
		for(int i=0; i<=y; i++) {
			
			for(int j=0; j<=y; j++) {
				
				if(j==0 || (j==(3*y)/4 && i>0 && i<(y-1)/2) || (i==0 && j<(3*y)/4) || (i==(y-1)/2 && j<(3*y)/4)) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			
			for(int j=0; j<=x; j++) {
				
				if(	(i==0 && j>0 && j<(3*x)/4) || (i==x-1 && j>0 && j<(x-1)/2) ||
					(j==0 && i>0 && i<(x-1)) || (j==(x-1)/2 && i>=(x-1)/2 && i<x-1) ||
					(i==(x-1)/2 && j>=(x-1)/2 && j<(3*x)/4) || (j==(3*x)/4 && i>=(x-1)/2 && i<x-1)) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
