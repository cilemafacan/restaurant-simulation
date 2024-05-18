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
    public void siparisBilgisi(){
        System.out.println("deneme");
    }

    public void siparisYazdir(PrintWriter yazici)
    {
        System.out.println("deneme2");
    }
}