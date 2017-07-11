import java.util.*;
class panagram
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        String s1=s.next().replace(" ","");
        if(s1.length()<26)
            System.out.print("not a pangram");
        else
        {
            Set<Character> hs=new HashSet<Character>();
            for(int i=0;i<s1.length();i++)
            {
                hs.add(s1.charAt(i));
            }
            System.out.print((hs.size()==26)?"pangram":"not a pangram");
        }    
    }
}
