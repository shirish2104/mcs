class ball
{
   
    void eagle()
       {
        System.out.println("ts");
       }
    void king()
       {
       System.out.println("america");
       }
    void rock()
       {
       System.out.println("india");
       }
}
class bam extends ball
{
       void eagle()
       {
     System.out.println("US");
       }
       
}

class Ram{
public static void main(String arg[])
{
   ball b=new ball();
   b.eagle();
   b=new bam();
   b.king();
   b.eagle();
   bam r=new bam();
   r.rock();
   
  
}
}