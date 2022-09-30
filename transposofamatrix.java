import java.util.Scanner;
public class transposofamatrix {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int row,column;
		int A[][];
		
		System.out.println("Enter the no of rows of the matrix");
		 row = sc.nextInt();
		 System.out.println("Enter the number of columns");
		 column = sc.nextInt();
		 A=new int[row][column];
		 System.out.println("Enter  matrix ");
		 for(int i=0;i<row;i++)
		 {
			 for(int j=0;j<column;j++)
			 {
			 A[i][j] = sc.nextInt();
			 }
			 }
		 System.out.println("Transposed matrix is ");
		 for(int i=0;i<column;i++)
		 {
			 for(int j=0;j<row;j++)
			 {
		 
		 System.out.print(""+A[j][i]);
		 }
		System.out.println();
		 }
		 }
		 

	}


