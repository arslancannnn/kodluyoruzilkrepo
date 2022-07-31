l = [[1,'a',['cat'],2],[[[3]],'dog'],4,5] #örnek verilen liste
sonuc = [] # sonuç listesi

def flatten(l2):
   for i in l2:  
    if isinstance(i,list):# i ye denk gelen eleman liste ise flatten fonksiyonunu mevcut eleman için çalıştırır
        flatten(i)
    else:
        sonuc.append(i)  #eğer eleman liste değilse sonuç listesine ekle

flatten(l)  # fonksiyonu çağır ve sonucu ekrana yazdır
print(sonuc)