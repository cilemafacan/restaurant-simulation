public class Yemek extends Urun{   // Yemek class'ı Urun class'ından türetilmiştir.
    private String tur;

    public Yemek(String ad, double fiyat, String tur)   // Yemek class'ının constructor'ı. Ata sınıfın constructor'ını çağırır. Ekstra olarak tur parametresini alır.
    {
        super(ad, fiyat);
        this.tur = tur;
    }
    @Override
    public void urunBilgisi()  // Urun class'ının urunBilgisi methodu override edilmiştir.
    {
        System.out.println("Yemek Adı: " + getAd());
        System.out.println("Fiyat: " + getFiyat());
        System.out.println("Tür: " + tur);
        System.out.println("----------------");
    }
    
}
