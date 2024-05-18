public class Musteri extends Kisi{

    public Musteri(String ad) {
        super(ad);
    }
    public Siparis siparisVer(Yemek yemek, Icecek icecek)
    {
        Siparis siparis = new Siparis(yemek, icecek);
        return siparis;
    }
}
