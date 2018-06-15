import java.util.*;
public class Switch {
	public static void main(String[] x)
	{
	   Scanner obj=new Scanner(System.in);
	   int n=obj.nextInt();
	   while(n<4)
	    {
	      System.out.println("Enter 1 to print HI");
	      System.out.println("Enter 2 to print how are you");
	      System.out.println("Enter 3 to print what doing");
	      System.out.println("Enter 4 to print exit");
	    }
	   switch(n)
	      {
	      case 1:System.out.println("HI");break;
	      case 2:System.out.println("how are you");break;       
       	  case 3:System.out.println("what doing");break; 
	      case 4:System.out.println("exit");break;
	      default:System.out.println("wrong option");
	      }
}}
