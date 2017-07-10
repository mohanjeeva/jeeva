import java.util.*;
import java.math.*;
class nowo
{
    public static void main(String args[])
    {
        String s="";
        int sum=0,sum1=1,p1=0,q1=0;
        for(int i=0;i<args[0].length();i++)
        {
            if(Character.isDigit(args[0].charAt(i)))
                s+=args[0].charAt(i);
        }
        char ch[]=s.toCharArray();
        Arrays.sort(ch);
        int n=Integer.parseInt(Character.toString(ch[ch.length-1]));
        for(int i=0;i<ch.length;i++)
        {
            sum+=(n*Integer.parseInt(Character.toString(ch[i])));
        }
        int n1=Integer.parseInt(Character.toString(ch[0]));
        for(int i=0;i<ch.length;i++)
        {
            sum1*=(n1+Integer.parseInt(Character.toString(ch[i])));
        }
        while(sum>0&&sum1>0)
        {
            int p=sum%10;
            p1=p1+p;
            sum=sum/10;
            if(sum==0&&p1>9)
            {
                sum=p1;
                p1=0;
            }
        }
        while(sum1>0)
        {
            int q=sum1%10;
            q1=q1+q;
            sum1=sum1/10;
            if(sum1==0&&q1>9)
            {
                sum1=q1;
                q1=0;
            }
        }
        double d=Math.min(p1,q1);
        System.out.println((int)(d*d));
    }
}
