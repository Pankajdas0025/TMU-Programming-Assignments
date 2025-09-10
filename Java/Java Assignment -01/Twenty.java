// Write program to demonstrate use of final keyword.

public class Twenty

{
final int x = 100 ;

final void display()
{
System.out.println("Method Final x : "+x);
}
}

class TestFinal

{

   public static void main (String [] args)

   {

     Twenty t = new Twenty();
    t.display();
   }
}
