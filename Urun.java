public abstract class Urun {  // Urun class'ı abstract tanımlanmıştır.
    protected String ad;      // ad ve fiyat değişkenleri protected olarak tanımlanmıştır.
    protected double fiyat;

    public Urun(String ad, double fiyat) {  // Urun class'ının constructor'ı. ad ve fiyat parametrelerini alır.
        this.ad = ad;
        this.fiyat = fiyat;
    }
    public String getAd() {  // getAd ve getFiyat methodları ad ve fiyat değişkenlerinin değerlerini döndürür.
        return ad;
    }
    public double getFiyat() {
        return fiyat;
    }
    public abstract void urunBilgisi();  // urunBilgisi methodu abstract olarak tanımlanmıştır. Türetilen sınıflar bu methodu override etmek zorundadır.
}
