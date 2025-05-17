
namespace DSA_Programs.Searching
{
    public class Linear_Search
    {

        public static void linearSearch(int[] array, int target)
        {
            int size = array.Length;
            for (int i = 0; i < size; i++)
            {
                if (array[i] == target)
                {
                    Console.WriteLine($"Element Found at index : {i}");
                    break;
                }
            }
        }

        public static void Run()
        {
            Console.Write("Enter the size of Array : ");
            int size = int.Parse(Console.ReadLine());
            int[] array = new int[size];

            Console.WriteLine("Enter the elements in Array :");
            for (int i = 0; i < size; i++)
            {
                array[i] = int.Parse(Console.ReadLine());
            }

            Console.WriteLine();
            Console.Write("Enter the target element : ");
            int target = int.Parse(Console.ReadLine());

            linearSearch(array, target);
        }
    }
}
