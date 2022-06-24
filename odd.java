
/* 2: WAP find the difference /between even and odd number  from 201 to 400;
    Total Even Number :
    Total Odd Number :
     Difference 
    Count of Even Number  :
    Count of Odd Number: */
	
  
  
class odd
{
	public static void main(String[] args)
	{
     		int i= 201;
		    int c= 0;
		int f = 0;
		int sum = 0;
 		int s = 0;
		
		while(i<=400)
		{
			if(i%2==0)
			{
				sum = sum + i;
				c++;
			}
			else
			{
				s = s + i;
				f++;
			}

		   i++;
		}
		 	System.out.println("\t\t\t total Even Number = "+sum);
			System.out.println("\t\t\t total Odd Number = "+s);
	  		int diff = sum-s;
			System.out.println("\t\t\t difference = "+diff);
			System.out.println("\t\t\ total Even Number = "+c);
			System.out.println("\t\t\t total Odd Number = "+f);
	}
}