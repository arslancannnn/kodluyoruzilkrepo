using System;

class Program
{
    static void Main(string[] args)
    {
        // out parametreler
        string sayi = "999";
        bool sonuc = int.TryParse(sayi, out int outsayi);

        if(sonuc)
        {
            Console.WriteLine("Başarılı");
            Console.WriteLine(outsayi);
        }else
        {
            Console.WriteLine("Başarısız");
        }
        Metotlar instance = new Metotlar();
        instance.topla(4,5, out int toplamsonucu);
        Console.WriteLine(toplamsonucu);

        // Metot aşırı yükleme = overloading
        int ifade = 999;
        instance.ekranaYazdir(Convert.ToString(ifade));
        instance.ekranaYazdir(ifade);
        instance.ekranaYazdir("Eren","Bakıcı");


    }
}
class Metotlar
{
    public void topla(int a, int b, out int toplam)
    {
        toplam = a+b;
    }
    public void ekranaYazdir(string veri)
    {
        Console.WriteLine(veri);
    }
    public void ekranaYazdir(int veri)
    {
        Console.WriteLine(veri);
    }
    public void ekranaYazdir(string veri1, string veri2)
    {
        Console.WriteLine(veri1+veri2);
    }
}
