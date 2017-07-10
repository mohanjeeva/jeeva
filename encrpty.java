import java.util.*;
class encrpty
{
    public static void main(String arg[])
    {
        Scanner s1=new Scanner(System.in);
        String args=s1.next();
        String args1=s1.next(),s="";
        for(int i=0;i<args.length();i++)
            System.out.print((Character.isLowerCase(args.charAt(i)))?(((int)(args.charAt(i)))+10>122)?(char)(((((int)(args.charAt(i)))+10)-122)+96):(char)(((int)(args.charAt(i)))+10):(((int)(args.charAt(i)))+10>90)?(char)(((((int)(args.charAt(i)))+10)-90)+64):(char)(((int)(args.charAt(i)))+10));
        System.out.print(" ");
        String sb=args1.substring(1,args1.length()-1);
        for(int i=0;i<sb.length();i++)
        {
            int n=((int)(sb.charAt(i)));
            s=s+Character.valueOf((Character.isLowerCase(sb.charAt(i)))?(((int)(sb.charAt(i)))+10>122)?(char)(((((int)(sb.charAt(i)))+10)-122)+96):(char)(((int)(sb.charAt(i)))+10):(((int)(sb.charAt(i)))+10>90)?(char)(((((int)(sb.charAt(i)))+10)-90)+64):(char)(((int)(sb.charAt(i)))+10));
        }
        System.out.print(args1.charAt(0)+s+args1.charAt(args1.length()-1));
    }
}
