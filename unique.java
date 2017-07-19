import java.util.*;
class unique
{
    public static void main(String args[])
    {
        String s="";
        for(int i=0;i<args.length;i++)
        {
            s+=args[i];
        }
        for(int i=0;i<args.length;i++)
        {
            String ss=s.replace(args[i],"");
            if(ss.length()==(s.length()-args[i].length()))
            System.out.print(args[i]);
        }
    }
}
