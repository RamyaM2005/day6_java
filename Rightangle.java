class Rightangle
{
    public static void main(String args[])
    {
        int n=5,i,j;
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
        if(j==n-1 || i==n-1 || i+j==n-1)
        {
            System.out.print("*");

        }
        else{
            System.out.print(" ");
        }
    }
    System.out.println();
}
    }
}