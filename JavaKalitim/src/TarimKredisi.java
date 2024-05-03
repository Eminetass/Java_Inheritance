//Çeşitli indirim sağlamak için ödeneek tutar üzerinde ovveride yaparak yeni tutar oluşturduk
public class TarimKredisi extends KrediTurleri{

    TarimKredisi(double krediTutari,int vadeSayisi){
        this.krediTutari = krediTutari;
        this.vadeSayisi = vadeSayisi;
        verilenKredi = "Tarım Kredisi";
        krediTuru = "Kampanyalı Çiftçi";
        faizOrani = 0.14;
    }
    @Override
    double odenecekTutar(){
        return super.odenecekTutar()-(krediTutari*(faizOrani-0.02)+50);
    }
}
