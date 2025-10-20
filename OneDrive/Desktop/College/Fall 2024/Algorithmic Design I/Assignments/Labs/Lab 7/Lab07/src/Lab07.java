import java.util.Scanner;
public class Lab07 {

	public static void main(String[] args) {

		// Sebastian Gaviria
		
		// create a Scanner object
		Scanner key = new Scanner(System.in);
		
		System.out.print("Enter the number of rows in matrix 1. ");
		
		int mat1_rows = key.nextInt();

		System.out.print("Enter the number of columns in matrix 1. ");
		
		int mat1_cols = key.nextInt();
		
		// dimension validation
		int mat2_rows = 0;
		
		while (true)
		{
			System.out.print("Enter the number of rows in matrix 2. ");
			mat2_rows = key.nextInt();
			
			if (mat2_rows != mat1_rows)
			{
				System.out.println("Dimension mismatch.");
			}
			else
			{
				break;
			}
			
		}
		
		int mat2_cols = 0;
		
		while (true)
		{
			System.out.print("Enter the number of columns in matrix 2. ");
			mat2_cols = key.nextInt();
			
			if (mat2_cols != mat1_cols)
			{
				System.out.println("Dimension mismatch.");
			}
			else
			{
				break;
			}
		}
		
		System.out.println();
		
		// matrix creation
		int [][] matrix1 = new int[mat1_rows][mat1_cols];
		
		int [][] matrix2 = new int[mat2_rows][mat2_cols];
		
		for (int i = 0; i < mat1_rows; i ++)
		{
			for (int j = 0; j < mat1_cols; j ++)
			{
				System.out.print("Enter the value of matrix 1 at position (" + i + ", " + j + "): ");
				
				matrix1[i][j] = key.nextInt();
			}
			
			System.out.println();
		}
		
		for (int i = 0; i < mat2_rows; i ++)
		{
			for (int j = 0; j < mat2_cols; j ++)
			{
				System.out.print("Enter the value of matrix 2 at position (" + i + ", " + j + "): ");
				
				matrix2[i][j] = key.nextInt();
			}
			
			System.out.println();
		}
		
		// matrix addition
		int [][] sumMatrix = new int[mat1_rows][mat2_cols];
				
		for (int i = 0; i < mat1_rows; i ++)
		{
			for (int j = 0; j < mat2_cols; j ++)
			{
				sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
			}
		}
		
		// print result
		for (int i = 0; i < mat1_rows; i ++)
		{
			System.out.print("|   ");
			
			for (int j = 0; j < mat1_cols ; j ++)
			{	
				System.out.print(matrix1[i][j] + "   ");
			}
			
			System.out.print("|\n");
		}
		
		System.out.println("\n       +\n");
		
		for (int i = 0; i < mat2_rows; i ++)
		{
			System.out.print("|   ");
			
			for (int j = 0; j < mat2_cols ; j ++)
			{	
				System.out.print(matrix2[i][j] + "   ");
			}
			
			System.out.print("|\n");
		}
		
		System.out.println("\n       =\n");
		
		for (int i = 0; i < mat1_rows; i ++)
		{
			System.out.print("|   ");
			
			for (int j = 0; j < mat2_cols ; j ++)
			{	
				System.out.print(sumMatrix[i][j] + "   ");
			}
			
			System.out.print("|\n");
		}
		
	}

}
