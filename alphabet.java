import java.io.*;
import java.util.*;
class alphabet
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
char n= s.next().charAt(0);
if((n>'A'&&n<'z')||(n>'a'&&n<'z'))
System.out.println("alphabet");
else
System.out.println("not an alphabet");
}
}
