import java.io.*;
import java.util.*;
class armstrong
{  
public static void main(String[] args)
{  
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int c=0,a,t;    
t=n;  
while(n>0)  
{  
a=n%10;   
c=c+(a*a*a);  
n=n/10; 
}  
if(t==c)  
System.out.println("given no is armstrong number");   
else  
System.out.println("given no not a armstrong number");   
}  
}  
