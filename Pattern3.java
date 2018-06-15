
class Pattern3
         {
           public static void main(String []x)
	     {   
		int i,j,a=1;
		for(i=1;i<=5;i++)
		{
			for(j=5;j>=i;j--)
			{
			  System.out.print(a);
			  a=a+1;
			}
                        a=a+1;
			System.out.println();
		}
	    }
         }