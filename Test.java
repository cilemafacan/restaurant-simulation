import java.io.IOException;  // Bunu koymayınca ide hata veriyor. 

public class Test {     
    public static void main(String[] args) throws IOException {
        Restoran restoran = new Restoran(); // Restoran class'ından bir restoran nesnesi oluşturuldu.
        Object[] yemekler_icecekler = {new Yemek("Kebap", 20, "Et"), 
                                       new Yemek("Pilav", 10, "Tavuk"), 
                                       new Yemek("Makarna", 15, "Makarna"), 
                                       new Icecek("Kola", 5, "Gazlı içecek"),
                                       new Icecek("Su", 2, "Su"),
                                       new Icecek("Çay", 3, "Sıcak içecek")}; // Yemek ve Icecek class'larından nesneler oluşturuldu.

        for(Object obj : yemekler_icecekler){   // yemekler_icecekler dizisindeki nesneler restoran nesnesine eklendi.
            if(obj instanceof Yemek){
                restoran.menuyeUrunEkle((Yemek)obj);
            }else if(obj instanceof Icecek){
                restoran.menuyeUrunEkle((Icecek)obj);
            }
        }

        Musteri musteriler[] = {new Musteri("Ali"), new Musteri("Veli"), new Musteri("Ahmet")}; // Musteri class'ından nesneler oluşturuldu.
        Garson garsonlar[] = {new Garson("Mehmet"), new Garson("Ayşe"), new Garson("Fatma")}; // Garson class'ından nesneler oluşturuldu.

        for(Musteri m : musteriler){
            restoran.musteriEkle(m);    // musteriler dizisindeki nesneler restoran nesnesine eklendi.
        }

        for(Garson g : garsonlar){
            restoran.garsonEkle(g);    // garsonlar dizisindeki nesneler restoran nesnesine eklendi.
        }

        restoran.menuyuGoster();    // Menüdeki ürünler ekrana yazdırıldı.

        restoran.rastgeleSiparislerOlustur(10); // 10 adet rastgele sipariş oluşturuldu.
    }
}
