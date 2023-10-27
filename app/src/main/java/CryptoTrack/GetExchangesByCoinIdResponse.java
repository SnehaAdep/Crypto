package CryptoTrack;

import java.util.ArrayList;

public class GetExchangesByCoinIdResponse {
    public String id;
    public String name;
    public ArrayList<Fiat> fiats;
    public double adjusted_volume_24h_share;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Fiat> getFiats() {
        return fiats;
    }

    public void setFiats(ArrayList<Fiat> fiats) {
        this.fiats = fiats;
    }

    public double getAdjusted_volume_24h_share() {
        return adjusted_volume_24h_share;
    }

    public void setAdjusted_volume_24h_share(double adjusted_volume_24h_share) {
        this.adjusted_volume_24h_share = adjusted_volume_24h_share;
    }
}

