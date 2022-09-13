using System;

class Program
{
    public static void Main(string[] args)
    {
        int a = 2;
        int b = 3;
        
        Console.WriteLine(a+b);

        int sonuc = topla(a,b);
        Console.WriteLine(sonuc);

        Metodlar ornek = new Metodlar();
        ornek.ekranaYazdir(Convert.ToString(sonuc));

        int sonuc2 = ornek.arttirVeTopla(ref a,ref b);
        ornek.ekranaYazdir(Convert.ToString(sonuc2));
        ornek.ekranaYazdir(Convert.ToString(a+b));

    }
    static int topla(int a, int b)
    {
        return a+b;
    }
}
class Metodlar
{
    public void ekranaYazdir(string veri)
    {
        Console.WriteLine(veri);
    }
    public int arttirVeTopla(ref int deger1,ref int deger2)
    {
        deger1 += 1;
        deger2 += 1;
        return deger1+deger2;
    }
}
