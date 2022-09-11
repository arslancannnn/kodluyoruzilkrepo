using System;

namespace hata_yonetimi
{
    class Program
    {
        static void Main(string[] args)
        {

           

            try
            {
                Console.WriteLine("Bir sayı girin: ");
                int sayi = Convert.ToInt32(Console.ReadLine());
                Console.WriteLine("Girdiğiniz sayı: "+sayi);
            }
            catch (Exception ex)
            {
                
                Console.WriteLine("Hata: "+ex.Message);
            }
            finally
            {
                Console.WriteLine("İşlem tamamlandı.");
            }

            try
            {
                //int a = int.Parse(null);
                //int a = int.Parse("test");
                int a = int.Parse("-200000000000");
            }
            catch (ArgumentNullException ex)
            {
                Console.WriteLine("Boş değer girdiniz");
                Console.WriteLine(ex);
            }
            catch(FormatException ex)
            {
                Console.WriteLine("Veri tipi uygun değil");
                Console.WriteLine(ex);
            }
            catch(OverflowException ex)
            {
                Console.WriteLine("Çok küçük veya Çok büyük bir değer girdiniz");
                Console.WriteLine(ex);   
            }
            finally
            {
                Console.WriteLine("İşlem başarıyla tanımlandı.");
            }

        }
    }
}