//Kullanıcıdan istediği kredi tutarı,vade sayısı ve almak istediği kredi türünü sorarak işleme tabi tuttum
import java.util.Scanner;
public class main2 {
    public static void main(String[] args){
        //Sacanner tanımlaması:
        Scanner scanner = new Scanner(System.in);
        //değiken tanımlaması:
        double krediTutari;
        int vadeSayisi,krediTuru;

        //Ekrana yazdırma işlemleri:
        System.out.println("------------------");
        System.out.print("-> Almak istediğini Kredi Tutarı: ");
        krediTutari = scanner.nextDouble();
        System.out.print("->İstediğiniz vade: ");
        vadeSayisi = scanner.nextInt();
        System.out.println("------------------\nAlmak İstediğiniz kredi " +
                "türü: \n1-İhtiyaç Kredisi \n2->Tarım Kredisi\n------------------");
        System.out.println("->Kredi Türü: ");
        krediTuru = scanner.nextInt();

        //kredi tanımlamaları:
        IhtiyacKredisi ihtiyacKredisi = new IhtiyacKredisi(krediTutari,vadeSayisi);
        TarimKredisi tarimKredisi = new TarimKredisi(krediTutari,vadeSayisi);
        //kredi hesaplamaları:
        switch (krediTuru){
            case 1:
                System.out.println("------------------\n"+ihtiyacKredisi.krediBilgileri()
                       +"\n------------------");
                break;
            case 2:
                System.out.println("------------------\n"+tarimKredisi.krediBilgileri()
                       +"\n------------------");
                break;
            default:
                System.out.println("-------------------\n->TANIMSIZ BİR DEĞER GİRDİNİZ."
                        +"\n------------------");
                break;
        }
    }
}
