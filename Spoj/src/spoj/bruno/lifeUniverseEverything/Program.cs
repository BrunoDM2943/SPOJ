using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

{
    class Program
    {
        static void Main(string[] args)
        {
            int num = 0;
            do
            {
                num = Convert.ToInt32(Console.ReadLine());
                if (num != 42)
                    Console.WriteLine(num);
            } while (num != 42);
        }
    }
}
