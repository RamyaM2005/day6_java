import java.util.*;
class PrintingH
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if((n&1)!=1)
                {
                    n--;
                }
            if(j==n-1 || j==0 || i==(n/2))
            {
                System.out.print("*");

            }
            else{
                System.out.print(" ");
            }
        }
        System.out.println();
    }
    sc.close();
    }
}