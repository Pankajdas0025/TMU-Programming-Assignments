
public class Third {

    public static void main (String[] num)
    {
        int a=Integer.parseInt(num[0]);
        int b=Integer.parseInt(num[1]);
        int sum=a+b;
        if(num.length>0)
        {
 System.out.println(sum);
        }
        else
        {
            System.out.println("Enter two number for sum");
        }
    }
}
