public class Test {
    public static void main(String[] args) {
        Restoran restoran = new Restoran();
        Object[] yemekler_icecekler = {new Yemek("Kebap", 20, "Et"), 
                                       new Yemek("Pilav", 10, "Tavuk"), 
                                       new Yemek("Makarna", 15, "Makarna"), 
                                       new Icecek("Kola", 5, "Gazlı içecek"),
                                       new Icecek("Su", 2, "Su"),
                                       new Icecek("Çay", 3, "Sıcak içecek")};

        for(Object obj : yemekler_icecekler){
            if(obj instanceof Yemek){
                restoran.menuyeUrunEkle((Yemek)obj);
            }else if(obj instanceof Icecek){
                restoran.menuyeUrunEkle((Icecek)obj);
            }
        }

        Musteri musteriler[] = {new Musteri("Ali"), new Musteri("Veli"), new Musteri("Ahmet")};
        Garson garsonlar[] = {new Garson("Mehmet"), new Garson("Ayşe"), new Garson("Fatma")};

        for(Musteri m : musteriler){
            restoran.musteriEkle(m);
        }

        for(Garson g : garsonlar){
            restoran.garsonEkle(g);
        }

        restoran.menuyuGoster();

        restoran.rastgeleSiparislerOlustur(10);
    }
}
