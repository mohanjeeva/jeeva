import java.io.*;
import java.util.*;
class vowel
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
char n= s.next().charAt(0);
if(n=='A'||n=='a'||n=='E'||n=='e'||n=='I'||n=='i'||n=='O'||n=='o'||n=='U'||n=='u')
System.out.println("vowel");
else
System.out.println("consonent");
}
}
