using System;

class Program
{
    static void Main(string[] args)
    {
         int count = 0;
         int n = 0;

         while (count<1)
        {
            Console.WriteLine("Pozitif bir tam sayi girin");
            n = int.Parse(Console.ReadLine());
            if (n<=0)
            {
                Console.WriteLine("Lütfen pozitif bir sayı girin!");
            }else
            {
                count = 1;
            }
        }
        string[] words = new string[n];
        for (int i = 0; i < n; i++)
        {
            Console.WriteLine("Bir kelime girin");
            words[i] = Console.ReadLine();
        }
        for (int i = n-1; i >=0; i--)
        {
            Console.WriteLine(words[i]);
        }
    }
}
