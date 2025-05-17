

using DSA_Programs.Searching;
using DSA_Programs.Sorting;

namespace DSA_Programs
{
    internal class Program
    {
        public static void Main(string[] args)
        {
            Console.WriteLine("Choose a program to run:");
            Console.WriteLine("1. Linear Search");
            Console.Write("Enter choice: ");
            int choice = int.Parse(Console.ReadLine());
            switch (choice) {
                case 1: 
                    Console.WriteLine("Launching Linear Search...\n");
                    Linear_Search.Run(); 
                    break;
            }
        }
    }
}
