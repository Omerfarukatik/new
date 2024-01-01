package sistem;

import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

public class Aboneler1 implements Serializable {
    private static final long serialVersionUID = 1L;

    Aboneler1() {
        lastUpdatedEpochMiliSeconds = 0;
        abonelerListesi = new ArrayList<>();
        girisYapanlarListesi = new ArrayList<>();
    }

    public long getEpochMiliSeconds() {
        return lastUpdatedEpochMiliSeconds;
    }

    public void setEpochMiliSeconds(long lastUpdatedEpochMiliSeconds) {
        this.lastUpdatedEpochMiliSeconds = lastUpdatedEpochMiliSeconds;
    }

    long lastUpdatedEpochMiliSeconds;

    public List<Boolean> getAboneler() {
        return abonelerListesi;
    }

    public void setAboneler(List<Boolean> aboneler) {
        abonelerListesi = aboneler;
    }

    List<Boolean> abonelerListesi;

    public List<Boolean> getGirisYapanlarListesi() {
        return girisYapanlarListesi;
    }

    public void setGirisYapanlarListesi(List<Boolean> girisYapanlarListesi) {
        this.girisYapanlarListesi = girisYapanlarListesi;
    }

    List<Boolean> girisYapanlarListesi;
}
