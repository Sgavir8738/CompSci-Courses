import java.util.Scanner;
public class MatrixMultiplication {

	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		
		System.out.print("Enter the number of columns in matrix1: ");
		
		int mat1_cols = key.nextInt();
		
		System.out.print("Enter the number of rows in matrix2: ");
		
		int mat2_rows = key.nextInt();
		
		System.out.print("Enter the number of columns in matrix2: ");
		
		int mat2_cols = key.nextInt();
		
		System.out.print("Enter the number of rows in matrix1: ");
		
		int mat1_rows = key.nextInt();
		
		int [][] matrix1 = new int[mat1_rows][mat1_cols];
		
		int [][] matrix2 = new int[mat2_rows][mat2_cols];
		
		
		for (int i = 0; i < mat1_rows; i ++)
		{
			for (int j = 0; j < mat1_cols; j ++)
			{
				System.out.print("Enter the value of the first matrix at position (" + i + ", " + j + "): ");
				
				matrix1[i][j] = key.nextInt();
			}
		}
		
		for (int i = 0; i < mat2_rows; i ++)
		{
			for (int j = 0; j < mat2_cols; j ++)
			{
				System.out.print("Enter the value of the second matrix at position (" + i + ", " + j + "): ");
				
				matrix2[i][j] = key.nextInt();
			}
		}
		
		
		//matrix multiplication
		int [][] productMatrix = new int[mat1_rows][mat2_cols];
		int sum = 0;
		for (int i = 0; i < mat1_rows; i ++)
		{
			for (int j = 0; j < mat2_cols; j ++)
			{
				for (int k = 0; k < mat1_cols; k ++)
				{
					sum += matrix1[i][k] * matrix2[k][j];
				}
				
				productMatrix[i][j] = sum;
				sum = 0;
			}
		}
		
		
		//print the product Matrix
		
		for (int i = 0, j = 0; i < mat1_rows; i ++)
		{
			System.out.print(productMatrix[i][j] + " ");
		}
			
		System.out.println();

	}

}
