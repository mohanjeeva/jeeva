import java.io.*;
import java.util.*;
class palindrome
{  
public static void main(String args[])
{
Scanner s=new Scanner(System.in);  
int r,s1=0,temp;  
int n=s.nextInt();  
temp=n;    
while(n>0)
{    
r=n%10; 
s1=(s1*10)+r;    
n=n/10;    
}    
if(temp==s1)    
System.out.println("The given number is palindrome number ");    
else    
System.out.println("The given number is not a palindrome");    
}  
}  
