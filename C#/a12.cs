//a12. WCP to find minimum element in array a of size n.

using System;
namespace a12;
class Program
{
    static void Main()
    {
        Console.WriteLine("Enter the size of the array:");
        int n = Convert.ToInt32(Console.ReadLine());
        int[] a = new int[n];

        Console.WriteLine("Enter the elements of the array:");
        for (int i = 0; i < n; i++)
        {
            a[i] = Convert.ToInt32(Console.ReadLine());
        }

        int minElement = FindMinElement(a);
        Console.WriteLine("The minimum element in the array is: " + minElement);
    }
    static int FindMinElement(int[] arr)
    {
        int min = arr[0];
        for (int i = 1; i < arr.Length; i++)
        {
            if (arr[i] < min)
            {
                min = arr[i];
            }
        }
        return min;
    }
}