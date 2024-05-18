import java.util.ArrayList;

public class Restoran {
    private ArrayList<Urun> menu = new ArrayList<Urun>();
    private ArrayList<Siparis> siparisler = new ArrayList<Siparis>();
    private ArrayList<Musteri> musteriler = new ArrayList<Musteri>();
    private ArrayList<Garson> garsonlar = new ArrayList<Garson>();   

    public Restoran()
    {

    }
    public void menuyeUrunEkle(Urun urun)
    {
        menu.add(urun);
    }
    public void musteriEkle(Musteri musteri)
    {
        musteriler.add(musteri);
    }
    public void garsonEkle(Garson garson)
    {
        garsonlar.add(garson);
    }
    public void menuyuGoster()
    {   
        System.out.println("----- MENÜ -----");
        for (Urun urun : menu) {
            System.out.println(urun);
        }
    }
    public void rastgeleSiparislerOlustur(int sayi)
    {
        for (int i = 0; i < sayi; i++) {
            Musteri musteri = musteriler.get((int)(Math.random() * musteriler.size()));
            Garson garson = garsonlar.get((int)(Math.random() * garsonlar.size()));
            Yemek yemek = (Yemek)menu.get((int)(Math.random() * menu.size()));
            Icecek icecek = (Icecek)menu.get((int)(Math.random() * menu.size()));
            Siparis siparis = musteri.siparisVer(yemek, icecek);
        }
        
    }
   
}
