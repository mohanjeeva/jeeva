import java.util.*;
class least
{
    public static void main(String a[])
    {
        String s[]=a[0].split("");
        Arrays.sort(s);
        int k=Integer.parseInt(a[1]);
        for(int i=0;i<(s.length-k);i++)
            System.out.print(s[i]);
    }
}
