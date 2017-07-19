import java.util.*;
class closezero
{
    public static void main(String args[])
    {
        String s="";
        int k=10000;
        for(int i=0;i<args.length;i++)
        {
            int n=Integer.parseInt(args[i]);
            for(int j=i+1;j<args.length;j++)
            {
                int n1=Integer.parseInt(args[j]);
                int sum=n+n1;
                if(k>sum)
                {
                    k=sum;
                    s=n+"+"+n1+"="+k;
                }
            }
        }
        System.out.println(s);
    }
}
