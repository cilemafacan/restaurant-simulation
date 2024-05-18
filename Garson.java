import java.util.ArrayList;

public class Garson extends Kisi{

    public Garson(String ad) {
        super(ad);
    }
    public void siparisAl(Siparis s, ArrayList<Siparis> siparisler)
    {
        siparisler.add(s);
    }
}
