// Write a program to write a string in a text file using IO
// package.
class IoString

{

    public static void main(String args[])

    {
        String s="Welcome to Java Programming";

        try
        {
            java.io.FileWriter fw=new java.io.FileWriter("C:\\Users\\Dell\\OneDrive\\Attachments\\Desktop\\Programming_Assignments\\Java\\test.txt");

            fw.write(s);

            fw.close();

            System.out.println("String written to file successfully");

        }
        catch(Exception e)
        {

            System.out.println(e);

        }

    }

}