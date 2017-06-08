import java.util.*;
import java.io.*;
class lp
{
public static void main(String ar[])
{
Scanner s=new Scanner(System.in);
int j;
int n=s.nextInt();
String a[]=new String[100];
for(int i=0;i<n;i++)
{
a[i]=s.next();
}
String ln,check;
if(a.length>0)
ln=a[0];
for(int i=1;i<a.length;i++)
{
check=a[i];
for(j=0;j<Math.min(ln.length(),a[i].length());j++)
{
if(ln.charAt(j)!=check.charAt(j))
break;
}
ln=a[i].substring(0,j);
}
System.out.println("longest prefix is:"+ln);
}
}
