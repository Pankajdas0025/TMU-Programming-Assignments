// Write a program in java to search an element in the
// given 10 elements.

public  class Seventh {
    public static void main (String[] args)
     {

       int[] numbers ={10 ,40 , 50 ,60 ,70};
        for(int num: numbers)
        {
            System.out.println(num);
        }
        int searchElement = 60;
        boolean found = false;

        for(int snum : numbers)
        {
            if(snum == searchElement)
            {
        found=true;

            }
        }
        if(found){System.out.println("Number is Found");}

        else{System.out.println("NOT Found");}

    }
}