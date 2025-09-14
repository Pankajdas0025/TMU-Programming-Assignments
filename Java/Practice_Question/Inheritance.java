public class Inheritance {

    public void Display(){
        System.out.println("We Implement all types of Inheritance Here....");
    }

}


class Multilevel extends Inheritance

{
 public void Display(){
        super.Display();
        System.out.println("We also Implement Multilevel Inheritance Here....");
    }
}

class Multilevel2 extends Multilevel

{
 public void Display(){
        super.Display();
        System.out.println("We also Implement Multilevel Inheritance with super Keyword....");
    }

    public static void main (String [] args)

    {
        Multilevel2 obj =  new Multilevel2();
        obj.Display();
    }
}