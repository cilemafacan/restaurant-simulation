public class Icecek extends Urun{   // Icecek class'ı Urun class'ından türetilmiştir.
    private String boy; 

    public Icecek(String ad, double fiyat, String boy) {    // Icecek class'ının constructor'ı. Ata sınıfın constructor'ını çağırır.
        super(ad, fiyat);
        this.boy = boy;
    }
    @Override
    public void urunBilgisi()   // Urun class'ının urunBilgisi methodu override edilmiştir.
    {
        System.out.println("İçecek Adı: " + getAd());
        System.out.println("Fiyat: " + getFiyat());
        System.out.println("Boyut: " + boy);
        System.out.println("----------------");  

    }
}
