class Basic 
   {
    public static void main(String[] arg) 
    {
     int n=238,f=0;
     for(int i=2;i<237;i++)
      {
        if(n%i==0)
         {
           f=1;
           break;
          }
        if(f==0)
          {
            System.out.println("its prime");
          }
         else
          {
           System.out.println("its not a prime");
           }
      }
     }
   }