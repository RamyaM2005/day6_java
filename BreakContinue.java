import java.util.Scanner;
class BreakContinue
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Break example");
        for(int i=0;i<n;i++)
        {
            if(i==2)
            {
                break;
            }
            System.out.println(i);
        }
        System.out.println("Continue example");
        for(int i=0;i<n;i++)
        {
            if(i==2)
            {
                continue;
            }
            System.out.println(i);
        }
    }
}
