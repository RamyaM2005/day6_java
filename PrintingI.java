import java.util.*;
class PrintingI
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
            if(i==n-1 || i==0 || j==(n/2))
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