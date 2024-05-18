public class Yemek extends Urun{
    private String tur;

    public Yemek(String ad, double fiyat, String tur) 
    {
        super(ad, fiyat);
        this.tur = tur;
    }
    @Override
    public void urunBilgisi()
    {
        System.out.println("Yemek Adı: " + ad);
        System.out.println("Fiyat: " + fiyat);
        System.out.println("Tür: " + tur);
        System.out.println("----------------");
    }
    
}
