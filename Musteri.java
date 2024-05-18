import java.util.Date;

public class Musteri extends Kisi{  // Musteri class'ı Kisi class'ından türetilmiştir.

    public Musteri(String ad) { // Musteri class'ının constructor'ı. Ata sınıfın constructor'ını çağırır.
        super(ad);
    }
    public Siparis siparisVer(Yemek yemek, Icecek icecek)   // siparisVer methodu yemek ve icecek parametrelerini alır ve Siparis class'ından bir nesne oluşturur.
    {
        Date tarih = new Date();    // tarih değişkenine şu anki zaman atandı.
        return new Siparis(yemek, icecek, null, this, tarih);   // Siparis class'ından bir nesne oluşturuldu ve geri döndürüldü.
    }
}
