

public class Primenumber {
 public static void main(String []x)
  {
 	int i,j,f=0;
 	for(i=1;i<100;i++)
 	{
 		f=0;
 		for(j=2;j<i;j++)
 		{   
 			if(i%j==0)
 			{
 			f=1;
 			break;
 			}
}
 			if(f==0)
 			{
 				System.out.println(i);
 			}
 			
 			
 		}
 	}
  }

