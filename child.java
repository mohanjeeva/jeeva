import java.util.*;

public class child
{
    public static void main(String[] args) 
    {
		   Scanner s=new Scanner(System.in);
		  System.out.println("ENTER THE NUMBER OF CHILDRENS");
		  int n=s.nextInt();
		  int[] a=new int[n];
		  System.out.println("ENTER THE RATING FOR EACH CHILDREN");
		  for(int i=0;i<n;i++)
		  {
			  a[i]=s.nextInt();
		   }
		  System.out.println("THE MINIMUM REQUIRED CANDIES ARE   ");
		  int count=n;
		  int v=0;
		  Arrays.sort(a);
		  for(int i=0;i<n-1;i++)
		  {
			  if(a[i]<a[i+1])
			  {
				  v++;
          count=count+v;
			  }
		  }
		  System.out.print(count);
    }
}
