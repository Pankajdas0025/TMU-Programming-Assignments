public class varargs


{
public int Sum( int ...arr)
        {

int l = arr.length;
int sum = 0 ;

for(int x: arr)

{
    sum+=x;

}
return sum;
        }

    public static void main  (String [] args)

    {

   varargs obj = new varargs();

   System.out.print("The Sum Of Numbers are : " +obj.Sum(1100,2,3,4));
    }

}
