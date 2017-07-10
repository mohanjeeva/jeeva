import java.util.*;
class dup
{
    public static void main(String args[])
    {
        Set<Character> st=new LinkedHashSet<Character>();
        for(int i=0;i<args[0].length();i++)
        {
            st.add(args[0].charAt(i));
        }
        for(char j:st)
            System.out.print(j);
    }
}
