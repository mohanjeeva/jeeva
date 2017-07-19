import java.util.*;
class subset
{
    public static void main(String args[])
    {
        Set<Integer> hs=new LinkedHashSet<Integer>();
        Scanner s=new Scanner(System.in);
        int n=s.nextInt(),y=0;
        int n1=s.nextInt();
        int a[]=new int[n],count=0;
        int b[]=new int[n1];
        for(int i=0;i<a.length;i++)
            a[i]=s.nextInt();
        for(int i=0;i<b.length;i++)
            b[i]=s.nextInt();
        for(int i=0;i<b.length;i++)
            hs.add(b[i]);
        int c[]=new int[hs.size()];
        for(int h:hs)
        {
            c[y]=h;
            y++;
        }
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<c.length;j++)
            {
                if(a[i]==c[j])
                {
                    count++;
                }
            }
        }
        if(count==a.length)
        System.out.print("array A is subset of B");
        else
        System.out.print("array A is not a subset of B");
    }
}
