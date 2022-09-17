using System;

class Program
{
    static void Main(string[] args)
    {
         int count = 0;
         int n = 0,m=0;

         while (count<1)
        {
            Console.WriteLine("Pozitif bir tam sayi girin");
            n = int.Parse(Console.ReadLine());
            Console.WriteLine("Pozitif bir tam sayi girin");
            m = int.Parse(Console.ReadLine());
            if (n<=0 || m<=0)
            {
                Console.WriteLine("Lütfen pozitif bir sayı girin!");
            }else
            {
                count = 1;
            }
        }
        int[] numbs = new int[n];
        for (int i = 0; i < n; i++)
        {
            Console.WriteLine("Pozitif bir tam sayi girin");
            numbs[i] = int.Parse(Console.ReadLine());
        }
        Console.WriteLine(m+" sayısına tam bölünebilenler");
        foreach (var num in numbs)
        {
            if(m%num == 0)
                Console.Write(num+",");
        }
    }
}
