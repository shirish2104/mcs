 class Prac
{
     public static void main(String args[])
     {
     try
       {
        int a=Integer.parseInt(args[0]);
        int b=Integer.parseInt(args[1]);
        System.out.println("SUM:"+(a+b));
        System.out.println("MUL:"+(a*b));
       }
     catch(ArrayIndexOutOfBoundsException ae)
       {
        System.out.println("wrong");
       }
      catch(NumberFormatException ne)
       {
        System.out.println("wrong formate");
       }
         catch(Exception e)
       {
        System.out.println("problem");
       }
     }
}

        