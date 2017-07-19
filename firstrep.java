import java.util.*;
class firstrep
{
    public static void main(String args[])
    {
        String s="",s1="";
        int flag=0;
        for(int i=0;i<args.length;i++)
        {
            s+=args[i];
        }
        for(int i=0;i<args.length;i++)
        {
            String ss=s.replace(args[i],"");
            if(ss.length()<=(s.length()-args[i].length()*2))
            {
                s1=args[i];
                flag=1;
                break;
            }
        }
        System.out.print((flag==1)?s1:"There is no repeated element");
    }
}
