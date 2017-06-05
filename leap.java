import java.io.*;
import java.util.*;
class leap
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int a=s.nextInt();
if(a%4==0)
System.out.println("given year is a leap year");
else
System.out.println("given year is a nonleap year");
}
}
