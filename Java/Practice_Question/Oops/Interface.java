
//Single interface
interface A { void Display(); }

class CallInterface implements A

{

    public void Display()

    {
        System.out.println("Call Interface Method using Implement");
    }

    public static void main (String[] args) {

        CallInterface obj = new CallInterface();
        obj.Display();

    }
}
