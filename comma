import java.util.*;
class comma
{
    public static void main(String args[])
    {
        Arrays.sort(args);
        String s="",s1="";
        for(int i=0;i<args.length;i++)
        {
            StringBuffer sb=new StringBuffer(args[i]);
            s+=String.valueOf(sb.reverse());
        }
        for(int i=0;i<s.length();i+=3)
        {
            if(i<(s.length()-3))
            {
                String s2=s.substring(i,i+3);
                s1+=s2+",";
            }
            else
            {
                String s2=s.substring(i);
                s1+=s2;
            }
        }
        StringBuffer sb=new StringBuffer(s1);
        System.out.println(sb.reverse());
    }
}
