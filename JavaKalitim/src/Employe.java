// Employe isminde bir üst sınıf oluşturarark eleman ve metot tanımlamaları yapıldı
//Her çalışan için bulunması gereken standart özellikler tanımlandı
public class Employe {
    // gerekli değişkenler :
    String isim ,soyad ,bolum = "Çalişan",calisanBilgileri;
    int izinGünü = 14;
    double maas = 2500;
    //yapılacak metot tanımlaması:
    Employe(String isim ,String soyad){
        this.isim =isim;
        this.soyad = soyad;
    }
    //yazdırılacak metin değişkenleri:
    void printInfo(){
        calisanBilgileri = "-> İsim ve Soyisim: "+ isim +" "+ soyad +"\n->" +
                "Bölüm: "+ bolum + "\n->İzin Günü: "+ izinGünü +" Gün" + "\n->"+
                "Maaş: "+ maas +" TL";
        System.out.println(calisanBilgileri);
    }
}
