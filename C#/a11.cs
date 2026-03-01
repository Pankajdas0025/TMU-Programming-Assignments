//a11. WCP to find maximum element in array a of size n
using System;
namespace a11;
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

        int maxElement = FindMaxElement(a);
        Console.WriteLine("The maximum element in the array is: " + maxElement);
    }
    static int FindMaxElement(int[] arr)
    {
        int max = arr[0];
        for (int i = 1; i < arr.Length; i++)
        {
            if (arr[i] > max)
            {
                max = arr[i];
            }
        }
        return max;
    }
}