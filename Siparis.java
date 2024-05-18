import java.io.PrintWriter;
import java.util.Date;

public class Siparis{
    private Yemek yemek;
    private Icecek icecek;
    public Garson garson;
    private Musteri musteri;
    public Date tarih;
    public static long siparis_no;

    public Siparis(Yemek yemek, Icecek icecek, Garson garson, Musteri musteri, Date tarih)
    {
        this.yemek = yemek;
        this.icecek = icecek;
        this.garson = garson;
        this.musteri = musteri;
        this.tarih = tarih;
    }
    public void siparisBilgisi()
    {
        System.out.println("Sipariş Bilgileri:");
        System.out.println("Yemek: " + yemek.ad + " - " + yemek.fiyat);
        System.out.println("İçecek: " + icecek.ad + " - " + icecek.fiyat);
        System.out.println("Garson: " + garson.ad);
        System.out.println("Müşteri: " + musteri.ad);
        System.out.println("Zaman: " + tarih);
        System.out.println("Siparis alındı.");
    }

    public void siparisYazdir(PrintWriter yazici)
    {
    
    }
}