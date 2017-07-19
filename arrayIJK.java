import java.util.*;
class arrayIJK
{
    public static void main(String args[])
    {
        int a[]=new int[args.length];
        for(int i=0;i<args.length;i++)
        {
            a[i]=Integer.parseInt(args[i]);
        }
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length;j++)
            {
                for(int k=0;k<a.length;k++)
                {
                    if((a[i]+a[j]==a[k])&&(i!=j)&&(j!=k)&&(k!=i))
                    {
                        System.out.println(a[i]+"+"+a[j]+"="+a[k]);
                    }
                }
            }
        }
    }
}
