import java.util.*;
class reverse
{
    public static void main(String args[])
    {
        String s2="",s=" ";
        for(int i=args.length-1;i>=0;i--)
            s2=s+s2+args[i];
        System.out.println(s2.trim());
    }
}
