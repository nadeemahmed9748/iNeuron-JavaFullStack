
public class Assignment1 {

	public static void main(String[] args) {
		// TODO INEURON Assignment 1
		
		System.out.println("---- 1. WAP to print INEURON ----\n");
		int n=7;
		for(int i=0; i<n; i++) {
			
			//Pattern I
			for(int j=0; j<n; j++) {
				if(	i==0 || i==n-1 ||
					j==(n-1)/2 ) {
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			
			System.out.print("\t"); //White space
			//Pattern N
			for(int j=0; j<n; j++) {
				if(	j==0 ||	j==(n-1) ||i==j){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			
			System.out.print("\t"); //White space
			//Pattern E
			for(int j=0; j<n; j++) {
				if(	j==0 || i==0 || i==(n-1)/2 || i==n-1){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			
			System.out.print("\t"); //White space
			//Pattern U
			for(int j=0; j<n; j++) {
				if(	(j==0 && i<n-1) || (j==(n-1) && i<n-1) || (i==n-1 && j>0 && j<n-1)){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			
			System.out.print("\t"); //White space
			//Pattern R
			for(int j=0; j<n; j++) {
				if(	j==0 || (i==0 && j<n-1) || (j==n-1 && i>0 && i<(n-1)/2) || (i==(n-1)/2 && j<n-1) || 
					(i-j == (n-1)/2)){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			
			System.out.print("\t"); //White space
			//Pattern O
			for(int j=0; j<n; j++) {
				if(	(j==0 && i>0 && i<n-1) || (i==0 && j>0 && j<n-1) || (j==n-1 && i>0 && i<n-1) || (i==n-1 && j>0 && j<n-1) ){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			
			System.out.print("\t"); //White space
			//Pattern N
			for(int j=0; j<n; j++) {
				if(	j==0 ||	j==(n-1) ||i==j){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			
			System.out.println();
		}
		
		/*	2. Write a program to print
				1 1 1 1
				2 2 2 2
				3 3 3 3
				4 4 4 4 		*/

		System.out.println("\n---- 2. WAP to print numbers ----\n");
		int n1=4;
		for(int i=1; i<=n1; i++) {
			for(int j=1; j<=n1; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		
		/*	3. Write a program to print pattern*/

		System.out.println("\n---- 3. WAP to print pattern ----\n");
		int m=14;
		for(int i=0; i<m; i++) {
			for(int j=0; j<m; j++) {
				if(	i==0 ||	j==0 || i==m-1 || j==m-1 ||
					(i+j <= (m-1)/2 || j-i >= (m-1)/2)	){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		/*	4. Write a program to print pattern*/

		System.out.println("\n---- 4. WAP to print pattern ----\n");
		int m1=14;
		for(int i=0; i<m1; i++) {
			for(int j=0; j<m1; j++) {
				if(	i==0 ||	j==0 || i==m1-1 || j==m1-1 ||
					i-j >= (m1-1)/2 || i+j >= m1-1 + (m1-1)/2 ){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		/*	5. Write a program to print pattern*/

		System.out.println("\n---- 5. WAP to print pattern ----\n");
		int num=14;
		for(int i=0; i<num; i++) {
			for(int j=0; j<num; j++) {
				if(	i==0 ||	j==0 || i==num-1 ||  
					(i+j <= (num-1)/2 || i-j >= (num-1)/2)	){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		
		
	}
}
