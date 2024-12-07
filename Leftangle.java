class Leftangle
{
    public static void main(String args[])
    {
        int n=5,i,j;
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
        if(j==0 || i==n-1 || i==j)
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