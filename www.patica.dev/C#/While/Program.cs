using System;

class Program
{
    public static void Main(string[] args)
    {
        // 1'den başlayıp girilen sayıya kadar (girilen sayı dahil) ortalama hesaplayıp ekrana yazdırma
        Console.WriteLine("Lütfen bir sayı girin: ");
        int sayi = int.Parse(Console.ReadLine());
        int sayac = 1;
        int toplam = 0;
        while (sayac<=sayi)
        {
            toplam += sayac;
            sayac++;
        }
        Console.WriteLine(toplam/sayi);

        // a' dan z'ye kadar tüm harfleri yazdır

        char character = 'a';

        while (character < 'z')
        {
            Console.WriteLine(character);
            character++;
        }

        // foreach

        string[] arabalar = {"ford","audi","mazda","nissan"};

        foreach (var araba in arabalar)
        {
            Console.WriteLine(araba);
        }   
    }
}
