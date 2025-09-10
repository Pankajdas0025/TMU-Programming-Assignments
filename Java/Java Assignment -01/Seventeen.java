// Write a program which illustrates the concept of super
// keyword at variable and method level.



public class Seventeen {
    int num = 100;
    void display()

    {
        System.out.println( "Display From parent: \n num= " +num);
    }

}

class Child extends Seventeen

{
    int num = 200 ;
    void display()

    {
  System.out.println( "Display From Child: \n num= " +super.num);
  super.display();
    }

    public static void main(String[] args)

    {
Child c = new Child();
c.display();
    }
}