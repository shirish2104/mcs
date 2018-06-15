interface fruit
{
   void mango();
   void apple();
}
class Grape implements fruit
{
   public void mango()
      {
      System.out.println("yellow");
      }
   public void apple()
      {
      System.out.println("red");
      }
}
class banana 
{
   void yellow()
     {
     System.out.println("It is a fruit");
     }
   void green()
     {
     System.out.println("It is not a fruit");
     }
}
class proma extends banana implements fruit
{
   public void yellow()
     {
     System.out.println("Just a fruit");
     }
   public void mango()
     {
     System.out.println("MANGO");
     }
   public void apple()
     {
     System.out.println("APPLE");
     }
}

class Inter
 {
  public static void main(String arg[])
   {
    fruit f=new Grape();
    f.mango();
    f.apple();
    banana b=new banana();
    b.yellow();
    b.green();
    b=new proma();
    b.yellow();
    proma p=new proma();
    p.yellow();
    p.green();
    f.mango();
    f.apple();   
   }
 }

    