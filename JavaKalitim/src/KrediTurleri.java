//Her kredide bulunacak belirli değişken ve metotlar tanımlandı
public class KrediTurleri {
    // değişken tanımlaması:
    String verilenKredi, krediTuru;
    int vadeSayisi;
    double krediTutari,faizOrani;

    //faiz hesaplayacak metot tanımlaması:
    double odenecekTutar(){
        return krediTutari+((krediTutari/vadeSayisi)*faizOrani*vadeSayisi);
    }
    String krediBilgileri(){
        return "->Kredi İsmi: "+verilenKredi+"\n->Kredi Türü:"+krediTuru+
                "\n->Alınan Kredi Miktarı: "+krediTutari+"\n->Faiz Oranı: "+
                faizOrani+"\t Vade Sayisi: "+vadeSayisi+"\n->Odenecek Tutar: "+
                odenecekTutar();
    }

}
