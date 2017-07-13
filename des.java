import java.util.*;
import java.lang.*;
class des
{
  public static void main(String args[])
  {
    int i,j;
    Scanner s=new Scanner(System.in);
    String st=s.nextLine();
    String sp[]=st.split(" ");
    int a[]=new int[sp.length];
    int b[]=new int[sp.length];
    int b2[]=new int[sp.length];
for(i=0;i<sp.length;i++)
{
a[i]=Integer.parseInt(sp[i]);
b[i]=Integer.bitCount(a[i]);
b2[i]=Integer.bitCount(a[i]);
}
Arrays.sort(b2);
for(i=b2.length-1;i>=0;i--)
{
for(j=0;j<b.length;j++)
{
if(b2[i]==b[j] && a[j]!=0)
{
System.out.println(a[j]);
a[j]=0;
}}}
}}
