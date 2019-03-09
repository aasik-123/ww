import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	  int temp,num;
	  boolean prime=true;
	  Scanner s=new Scanner(System.in);
	  num=s.nextInt();
	  int arr[]=new int[1000];
	  s.close();
	  for(int i=2;i<=num/2;i++)
	  {
	    temp=num%i;
	    if(temp==0)
	    {
	    	prime=false;
	    	break;
	    	
	    }
	  }
	  if(prime)
	  {
	  	System.out.println("yes");
	  	
	  }
else
{
	System.out.println("no");
}}}
