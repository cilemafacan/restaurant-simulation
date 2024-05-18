import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

public class Restoran {
    private ArrayList<Urun> menu = new ArrayList<Urun>();
    private ArrayList<Siparis> siparisler = new ArrayList<Siparis>();
    private ArrayList<Musteri> musteriler = new ArrayList<Musteri>();
    private ArrayList<Garson> garsonlar = new ArrayList<Garson>();   // Garson class'ından nesneleri tutan ArrayList tanımlandı.

    public Restoran()   // Restoran class'ının constructor'ı.
    {

    }
    public void menuyeUrunEkle(Urun urun)   // menuyeUrunEkle methodu menu ArrayList'ine urun ekler.
    {
        menu.add(urun);
    }
    public void musteriEkle(Musteri musteri)    // musteriEkle methodu musteriler ArrayList'ine musteri ekler.
    {
        musteriler.add(musteri);
    }   
    public void garsonEkle(Garson garson)   // garsonEkle methodu garsonlar ArrayList'ine garson ekler.
    {
        garsonlar.add(garson);
    }
    public void menuyuGoster()  // menuyuGoster methodu menüdeki ürünleri ekrana yazdırır.
    {       
        System.out.println("----- MENÜ -----");
        for (Urun urun : menu) {
            urun.urunBilgisi();
            System.out.println("----------------");
        }
    }

    public void rastgeleSiparislerOlustur(int sayi) throws IOException {    // rastgeleSiparislerOlustur methodu rastgele sipariş oluşturur.
        Random rand = new Random(); // Random class'ından bir nesne oluşturuldu.
        for (int j = 0; j < sayi; j++) {    // sayi kadar döngü oluşturuldu.
            Musteri musteri = musteriler.get(rand.nextInt(musteriler.size()));  // musteriler ArrayList'inden rastgele bir müşteri seçildi.
            Garson garson = garsonlar.get(rand.nextInt(garsonlar.size()));  // garsonlar ArrayList'inden rastgele bir garson seçildi.
            Yemek yemek = null; 
            Icecek icecek = null;
            if (rand.nextBoolean()) {   // Random boolean değer üretildi.
                Urun urun = menu.get(rand.nextInt(menu.size()));    // menu ArrayList'inden rastgele bir ürün seçildi.
                if (urun instanceof Yemek) {    // Eğer seçilen ürün Yemek class'ından ise yemek değişkenine atanır.
                    yemek = (Yemek) urun;
                }
            }

            if (rand.nextBoolean()) {
                Urun urun = menu.get(rand.nextInt(menu.size()));    // menu ArrayList'inden rastgele bir ürün seçildi.
                if (urun instanceof Icecek) {   // Eğer seçilen ürün Icecek class'ından ise icecek değişkenine atanır.
                    icecek = (Icecek) urun;
                }
            }
            Date tarih = new Date();    // tarih değişkenine şu anki zaman atandı.
            Siparis siparis = new Siparis(yemek, icecek, garson, musteri, tarih);   // Siparis class'ından bir nesne oluşturuldu.
            garson.siparisAl(siparis, siparisler);  // Garson class'ının siparisAl methodu çağrıldı.
        }
    }

}