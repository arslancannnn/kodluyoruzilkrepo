# kNN ve SVM
Makine öğrenmesine girişte gözterilen en popüler algoritmalar şüphesiz kNN ve SVM algoritmalarıdır.
 Bu yazımda bu algoritmaların bazı özelliklerini kendimce anlatmak istedim.

## kNN
En yakın komşu algoritması olarak bilinir ve en basit makine öğrenmesi algoritmasıdır. Geniş veri setlerini işlemede yetersiz kalır. algoritma iki temel değer üzerinden tahmin yapar uzaklık ve komşu sayısı.
uzaklık; minkowski fonksiyonu kullanılarak tahmin edilecek noktanın diğer noktalara uzaklığı hesaplanır.
Komşu sayısı; en yakın kaç komşu üzerinden hesaplama yapılacağıdır. K değeri bu algoritma için en önemli ölçüttür. eğer k değerini 1 alırsak overfit ihtimali yüksek olur öte yandan K değerini yüksek alırsak sonuçlar genel olacaktır.

## SVM
Küçük ve orta ölçekli veri setleri için daha uygundur. Bir düzlem üzerine yerleştirilmiş noktaları ayırmak için bir doğru çizer. Bu doğrunun iki sınıfın noktaları içinde maksimum uzaklıkta olması amaçlanır. SVM algoritmasında önemli noktalardan birisi de karnel tricktir. Karnel trick düşük boyutların yetersiz kaldığı yerde elimizdeki kordinatları karnel fonksiyonlarıyla çarparak daha anlamlı hale getirmesidir. en çok kullanılan karnel fonksiyonları Polynomial ve Gaussian RBF karnel fonksiyonlarıdır.
Polynomial karnel; bu yöntemle 2. boyutta değilde 3 veya daha fazla boyutta işlem yapıyormuşuz gibi davranırız
Gaussian RBF karnel; sonsuz boyuttaki Destek Vektör Makinelerini bulur ve her bir noktanın belirli bir noktaya ne kadar benzediğini normal dağılım ile hesaplar ve ona göre sınıflandırır. Dağılımın genişliğini gamma hiperparametresi ile kontrol ederiz. Gamma ne kadar küçükse dağılım o kadar geniş olur


