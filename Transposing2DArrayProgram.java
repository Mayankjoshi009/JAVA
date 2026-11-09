import java.util.Scanner;

class Transposing2DArrayProgram 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter columns: ");
        int cols = sc.nextInt();

        int[][] arr = new int[rows][cols];
        System.out.println("Enter array elements:");
        for (int i = 0; i < rows; i++) 
        {
            for (int j = 0; j < cols; j++) 
            {
               arr[i][j] = sc.nextInt();
            }
        }

        int[][] transposed = new int[cols][rows];
        for (int i = 0; i < rows; i++) 
        {
            for (int j = 0; j < cols; j++) 
            {
               transposed[j][i] = arr[i][j];
            }
        }

        System.out.println("Original 2D Array elements:");
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < cols; j++)
            {
               System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Transposed 2D Array elements:");
        for (int i = 0; i < cols; i++)
        {
            for (int j = 0; j < rows; j++) 
            {
               System.out.print(transposed[i][j] + " ");
            }
            System.out.println();
        }
    }
}