import java.util.*;
class reparr
{
    public static void main(String args[])
    {
        Set<String> hs=new LinkedHashSet<String>();
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
                hs.add(args[i]);
            }
        }
        if(hs.size()!=0)
        {
            for(String h:hs)
            System.out.println(h);
        }
        else
        System.out.print("no repeated element");
    }
}
