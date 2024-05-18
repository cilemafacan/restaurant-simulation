import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Garson extends Kisi{   // Garson class'ı Kisi class'ından türetilmiştir.

    public Garson(String ad) {  // Garson class'ının constructor'ı. Ata sınıfın constructor'ını çağırır.
        super(ad);
    }
    public void siparisAl(Siparis s, ArrayList<Siparis> siparisler) throws IOException  // siparisAl methodu Siparis class'ından bir nesne ve siparisler ArrayList'ini alır.
    {
        siparisler.add(s);  // siparisler ArrayList'ine s nesnesi eklenir.
        s.siparisBilgisi(); // Siparis class'ının siparisBilgisi methodu çağrılır.

        File folder = new File("Siparisler");   // Siparisler adında bir klasör oluşturulur.
        if (!folder.exists()) { // Eğer klasör yoksa klasör oluşturulur.
            folder.mkdir();
        }
        File file = new File(folder + "/" + String.valueOf(Siparis.siparis_no) + ".txt");   // Siparis_no adında bir dosya oluşturulur.
        
        PrintWriter yazici = new PrintWriter(new FileWriter(file)); // Dosyaya yazma işlemi için PrintWriter nesnesi oluşturulur.
        s.siparisYazdir(yazici);    // Siparis class'ının siparisYazdir methodu çağrılır.
        yazici.close(); // Yazıcı kapatılır.
    }
}
