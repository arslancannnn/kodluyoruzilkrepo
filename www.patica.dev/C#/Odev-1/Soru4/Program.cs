using System;

class Program
{
    static void Main(string[] args)
    {
        Console.WriteLine("Bir cümle Yazınız:");
        string cumle=Console.ReadLine();
        char[] character= cumle.ToCharArray();
        string[] kelimeler=cumle.Split(" ");
        int count = 0;

        foreach (var kelime in kelimeler)
        {
           count += kelime.Length;
        }
            
        
        Console.WriteLine("Cümledeki kelime sayısı: "+kelimeler.Length);
        Console.WriteLine("Cümledeki harf sayısı: "+count);
    }
}