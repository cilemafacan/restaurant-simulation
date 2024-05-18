import java.io.PrintWriter; // Klasör ve dosya işlemleri için gerekli kütüphane.
import java.util.Date;  // Tarih ve saat işlemleri için gerekli kütüphane.

public class Siparis{       
    private Yemek yemek;
    private Icecek icecek;
    public Garson garson;
    private Musteri musteri;
    public Date tarih;
    public static long siparis_no;  

    public Siparis(Yemek yemek, Icecek icecek, Garson garson, Musteri musteri, Date tarih)  // Siparis class'ının constructor'ı. Yemek, icecek, garson, musteri ve tarih parametrelerini alır.
    {
        this.yemek = yemek;
        this.icecek = icecek;
        this.garson = garson;
        this.musteri = musteri;
        this.tarih = tarih;
        siparis_no++;
    }
    public void siparisBilgisi()    // siparisBilgisi methodu sipariş bilgilerini konsola yazdırır.
    {
        System.out.println("Sipariş Bilgileri:");
        if (yemek != null) {
            System.out.println("Yemek: " + yemek.getAd() + " - " + yemek.getFiyat());
        } else {
            System.out.println("Yemek: Bos - 0.0");
        }
        if (icecek != null) {
            System.out.println("İcecek: " + icecek.getAd() + " - " + icecek.getFiyat());
        } else {
            System.out.println("İcecek: Bos - 0.0");
        }
        System.out.println("Garson: " + garson.getAd());
        System.out.println("Müşteri: " + musteri.getAd());
        System.out.println("Zaman: " + tarih);
        System.out.println("Siparis alındı.");
    }

    public void siparisYazdir(PrintWriter yazici) { // siparisYazdir methodu sipariş bilgilerini dosyaya yazdırır.
        yazici.println("Sipariş Bilgileri:");
        if (yemek != null) { // Eğer yemek null değilse yemek adı ve fiyatı yazdırılır.
            yazici.println("Yemek: " + yemek.getAd() + " - " + yemek.getFiyat());
        } else {    // Eğer yemek null ise "Bos - 0.0" yazdırılır.
            yazici.println("Yemek: Bos - 0.0");
        }
        if (icecek != null) {   // Eğer icecek null değilse icecek adı ve fiyatı yazdırılır.
            yazici.println("İcecek: " + icecek.getAd() + " - " + icecek.getFiyat());
        } else {    // Eğer icecek null ise "Bos - 0.0" yazdırılır.
            yazici.println("İcecek: Bos - 0.0");
        }
        yazici.println("Garson: " + garson.getAd());    // Garson adı yazdırılır.
        yazici.println("Müşteri: " + musteri.getAd());  // Müşteri adı yazdırılır.
        yazici.println("Zaman: " + tarih);  // Sipariş zamanı yazdırılır.
        yazici.println("Siparis alındı.");  // Sipariş alındı yazdırılır.
    }
}