import java.util.Scanner;
public class SymmetricMatrix
{
    public static void main(String[]args)
    {
        int i,j,r,flag=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the order of the matrix :\n");
        r = sc.nextInt();
        int A [][] = new int[r][r];
        System.out.print("Enter the elements :\n");
        for(i=0;i<r;i++)
        {
            for(j=0;j<r;j++)
            {
                A[i][j] = sc.nextInt();
            }
        }
        System.out.print("The entered Matrix is :\n");
        for(i=0;i<r;i++)
        {
            for(j=0;j<r;j++)
            {
                System.out.print(A[i][j] + "\t");
            }
            System.out.print("\n");
        }
        for(i=0;i<r;i++)
        {
            for(j=0;j<r;j++)
            {
              if(A[0][0] != A[i][j]) 
              {
                flag=1;
                break;
              } 
            }
        }
        if(flag==0)
        {
            System.out.println("The entered matrix is Symmetric");
        }
        else
        {
            System.out.println("The enetered matrix is not Symmetric");
        }
       
    }
}