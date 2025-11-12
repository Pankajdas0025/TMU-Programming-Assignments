// 6. Write a java program which will create a window and
// an empty area within that window (extends Frame
// class)


class Window extends java.awt.Frame

{

    Window()

    {
        setTitle("My First Window");

        setSize(400,400);

        setVisible(true);

    }

    public static void main(String args[])

    {
        Window w=new Window();

    }

}