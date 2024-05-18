public class Icecek extends Urun{
    private String boy;

    public Icecek(String ad, double fiyat, String boy) {
        super(ad, fiyat);
        this.boy = boy;
    }
    @Override
    public void urunBilgisi()
    {
        System.out.println("İçecek Adı: " + ad);
        System.out.println("Fiyat: " + fiyat);
        System.out.println("Boyut: " + boy);
        System.out.println("----------------");  

    }
}
