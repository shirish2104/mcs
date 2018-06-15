import java.util.*;
class Prime
{
    public static void main(String[] x){

    int a, i, flag = 0;
    Scanner sc=new Scanner(System.in);

    System.out.print("Enter a number");
     a=sc.nextInt();

    for(i=2; i<=a/2; ++i)
    {
        // condition for nonprime number
        if(a%i==0)
        {
            flag=1;
            break;
        }
    }

    if (flag==0)
        System.out.println("prime number");
    else
        System.out.println("not a prime number");
    
    
}}