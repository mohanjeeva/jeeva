import java.io.*;
import java.util.*;
 class sum
{
public static void main(String args[])
{
int s=0;
Scanner a=new Scanner(System.in);
int n=a.nextInt();
for(int i = 1;i <= n;i++)
{
s = s + i;
}
System.out.println("The Sum Of "+n+" Numbers are:" + s);
}
}
