using System;
using System.Collections;

class Program
{
    static void Main(string[] arg)
    {
        int count = 0;
        int n=0;
        int sayi;


        ArrayList evenNumber = new ArrayList();

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
        while (n>0)
        {
            Console.WriteLine("Pozitif bir tam sayı girin:");
             sayi = int.Parse(Console.ReadLine());

            if(sayi<0)
            {
                Console.WriteLine("Lütfen pozitif bir sayı girin");
                continue;
            }else
            {
                if (sayi%2 == 0)
                {
                    evenNumber.Add(sayi);
                }
                n--;
            }

        }
        foreach (var num in evenNumber)
        {
            Console.Write(num+" ");
        }
    }
}