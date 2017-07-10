import java.util.*;
class pin
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        String fn=s.next(),su="";
        String ln=s.next();
        String pin=s.next();
        int n=s.nextInt();
        String ss[]={fn,ln};
        Arrays.sort(ss);
        su=((fn.length()>ln.length())?fn.substring(0,1)+ln:(fn.length()==ln.length())?(ss[0].substring(0,1)+ss[1]):ln.substring(0,1)+fn);
        for(int i=0;i<su.length();i++)
        {
            char ch=su.charAt(i);
            if(Character.isLowerCase(ch))
                System.out.print((Character.toString(ch)).toUpperCase());
            else
                System.out.print((Character.toString(ch)).toLowerCase());
        }
        System.out.print(pin.charAt(n-1)+""+pin.charAt(pin.length()-n));
    }
}

