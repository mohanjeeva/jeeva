import java.util.*;
class rect
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int a[][]=new int[8][2];
        for(int i=0;i<8;i++)
        {
            for(int j=0;j<2;j++)
            {
                a[i][j]=s.nextInt();
            }
        }
        if((a[4][0]>=a[0][0]&&a[4][0]<=a[2][0])&&(a[4][1]>=a[0][1]&&a[4][1]<=a[2][1]))
        {
            System.out.print("overlap");
        }
        else 
        {
            if((a[7][0]>=a[0][0]&&a[7][0]<=a[2][0])&&(a[7][1]>=a[0][1]&&a[7][1]<=a[2][1]))
            System.out.print("overlap");
            else
            System.out.print("not overlap");
        }
    }
}
