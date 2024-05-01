// ana ve chil sınıftan nesne oluşturup tanımlamalarla birlikte ekrana yazdırıldı.
public class Main {
    public static void main(String[] args) {
        //çalışan ekleyelim
        Employe e1 = new Employe("Emine","Taş");
        GeneralMenager g1 = new GeneralMenager("Emine","Taş");

        // ekrana yazıyoruz
        System.out.println("----------------------\n->Personel oluşturuldu \n---------------------------");
        e1.printInfo();

        System.out.println("-----------------------\n->Genel Müdür oluşturuldu\n-------------------------");
        g1.printInfo();

        System.out.println("-----------------------------------------------------");
    }
}