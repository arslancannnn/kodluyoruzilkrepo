using System;

class Program
{
    public static void Main(string[] args)
    {
        // Sort
        int[] sayi_dizisi = {23,12,4,86,72,3,11,17};

        Console.WriteLine("***Sırasız dizi***");
        foreach (var sayi in sayi_dizisi)
            Console.WriteLine(sayi);
        
        Console.WriteLine("***Sıralı dizi***");
        Array.Sort(sayi_dizisi);
        foreach (var sayi in sayi_dizisi)
            Console.WriteLine(sayi);
        
        // Clear
        Console.WriteLine("***Array Clear***");
        // sayi_dizisi elamanlarını kullanarak 2. indexten itibaren 2 tane elemanını sıfırlar
        Array.Clear(sayi_dizisi,2,2);

        foreach (var sayi in sayi_dizisi)
            Console.WriteLine(sayi);
        
        // Reverse
        Console.WriteLine("***Array Reverse***");
        Array.Reverse(sayi_dizisi);

        foreach (var sayi in sayi_dizisi)
            Console.WriteLine(sayi);
        
            
        // IndexOf
        Console.WriteLine("***Arrray IndexOf");
        Console.WriteLine(Array.IndexOf(sayi_dizisi,23));

        // Resize
        Console.WriteLine("***Array Resize");
        Array.Resize<int>(ref sayi_dizisi,9);
        sayi_dizisi[8] = 99;

        foreach (var sayi in sayi_dizisi)
            Console.WriteLine(sayi);        
            
            
            
        
    }
}
