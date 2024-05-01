// Employe sınıfından miras alarak ek özellikleri tanımladıpım bir sınıf oluşturdum
public class GeneralMenager extends Employe{
    GeneralMenager(String isim, String soyad){
        super(isim, soyad);
        bolum = "Genel Müdür";
        maas = 9000;
        izinGünü = 30;
    }
}
