using System;

namespace  diziler
{
    class Program
    {
        public static void Main(string[] args)
        {
            // Dizi tanımlama
            string[] renkler = new string[5];

            string[] hayvanlar = {"kedi","köpek","kuş","maymun"};

            int[] dizi;
            dizi = new int[5];

            // Dizilere değer atama

            renkler[0] = "Mavi";
            dizi[3] = 10;

            Console.WriteLine(hayvanlar[1]);
            Console.WriteLine(dizi[3]);
            Console.WriteLine(renkler[0]);

            // Döngülerle dizi kullanımı
            // Klavyeden girilen n tane sayının ortalamasını hesaplayan program

            Console.WriteLine("Lütfen dizinin eleman sayısını girin: ");
            int dizi_uzunluğu = int.Parse(Console.ReadLine());
            int[] sayi_dizisi = new int[dizi_uzunluğu];

            for (int i = 0; i < dizi_uzunluğu; i++)
            {
                Console.WriteLine("Lütfen {0}. sayısı girin",i+1);
                sayi_dizisi[i] = int.Parse(Console.ReadLine());
            }
            int toplam = 0;
            
            foreach (var sayi in sayi_dizisi)
            {
                toplam += sayi;
            }
            Console.WriteLine("Ortalama: "+toplam/dizi_uzunluğu);
        }
    }
}
