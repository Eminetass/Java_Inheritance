<-- JAVA'da Kalıtım Nedir ?  -->

java'da Kalıtım(Inheritance): mevcut sınıflardaki elemanlarımızı kullanarak yeni sınıflar türetmemize olanak sağlar.
Miras alma olarak da bilinir .Sürekli kullanacağımız ortak özellikleri tekrar tekrar yazmamızı engeller.
Oluşturmuş olduğumuz bu sınıflar, türetildiği sınıfın özelliklerini ve ekstra olarak eklenecek yeni özelliklere sahip
olabilirler.
Özetle birçok sınıfla ortak özelliklere sahip bir sınıf olştururalım(Ana sınıf) daha sonra hem özelliklere
sahip hem de ek özellik oluşturuacağımız sınıflar oluşturmak istersek(çocuk sınıfları) ,ana sınıftan kalıtım(miras)
alırız böylece ana sınıftaki özellikleri her çocuk sınıfta oluştumamış oluruz .Hem kod okunabilirliği hem de bellek tasarufu
yapmış oluruz .
Bir sınıf üzerinden miras almak istediğimiz zaman kullanmamız gerekn kelime exdends 'dir.

class UstSinif{
    // kullanılacak kod satırı
}
class AltSinif extends UstSinif {
    // Kullanılacak kod satırları.
}

Önemli kavramlar:
Super Class (Üst Sınıf): İçerisinde bulunan özellikleri kalıtım yolu ile miras alınan temel sınıftır.
Sub Class (Alt Sınıf): Üst sınıftan türetilmiş bir sınıftır. Bağlı olunan üst sınıf içerisinden bir veriyi işlemek için
çekmek istediğimiz zaman super tanımını kullanır.

*** Üst sınıfın birden fazla alt sınıfı bulunabilir.Fakat bir alt(sub) sınıfın birden fazla üst(super) sınıfı bulunamaz.


