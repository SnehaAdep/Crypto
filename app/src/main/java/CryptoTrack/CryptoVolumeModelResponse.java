package CryptoTrack;

import java.util.Date;

// import com.fasterxml.jackson.databind.ObjectMapper; // version 2.11.1
// import com.fasterxml.jackson.annotation.JsonProperty; // version 2.11.1
/* ObjectMapper om = new ObjectMapper();
Root root = om.readValue(myJsonString, Root.class); */
public class CryptoVolumeModelResponse {
    public long market_cap_usd;
    public long volume_24h_usd;
    public double bitcoin_dominance_percentage;
    public int cryptocurrencies_number;
    public long market_cap_ath_value;
    public Date market_cap_ath_date;
    public long volume_24h_ath_value;
    public Date volume_24h_ath_date;
    public double market_cap_change_24h;
    public double volume_24h_change_24h;
    public int last_updated;

    public long getMarket_cap_usd() {
        return market_cap_usd;
    }

    public void setMarket_cap_usd(long market_cap_usd) {
        this.market_cap_usd = market_cap_usd;
    }

    public long getVolume_24h_usd() {
        return volume_24h_usd;
    }

    public void setVolume_24h_usd(long volume_24h_usd) {
        this.volume_24h_usd = volume_24h_usd;
    }

    public double getBitcoin_dominance_percentage() {
        return bitcoin_dominance_percentage;
    }

    public void setBitcoin_dominance_percentage(double bitcoin_dominance_percentage) {
        this.bitcoin_dominance_percentage = bitcoin_dominance_percentage;
    }

    public int getCryptocurrencies_number() {
        return cryptocurrencies_number;
    }

    public void setCryptocurrencies_number(int cryptocurrencies_number) {
        this.cryptocurrencies_number = cryptocurrencies_number;
    }

    public long getMarket_cap_ath_value() {
        return market_cap_ath_value;
    }

    public void setMarket_cap_ath_value(long market_cap_ath_value) {
        this.market_cap_ath_value = market_cap_ath_value;
    }

    public Date getMarket_cap_ath_date() {
        return market_cap_ath_date;
    }

    public void setMarket_cap_ath_date(Date market_cap_ath_date) {
        this.market_cap_ath_date = market_cap_ath_date;
    }

    public long getVolume_24h_ath_value() {
        return volume_24h_ath_value;
    }

    public void setVolume_24h_ath_value(long volume_24h_ath_value) {
        this.volume_24h_ath_value = volume_24h_ath_value;
    }

    public Date getVolume_24h_ath_date() {
        return volume_24h_ath_date;
    }

    public void setVolume_24h_ath_date(Date volume_24h_ath_date) {
        this.volume_24h_ath_date = volume_24h_ath_date;
    }

    public double getMarket_cap_change_24h() {
        return market_cap_change_24h;
    }

    public void setMarket_cap_change_24h(double market_cap_change_24h) {
        this.market_cap_change_24h = market_cap_change_24h;
    }

    public double getVolume_24h_change_24h() {
        return volume_24h_change_24h;
    }

    public void setVolume_24h_change_24h(double volume_24h_change_24h) {
        this.volume_24h_change_24h = volume_24h_change_24h;
    }

    public int getLast_updated() {
        return last_updated;
    }

    public void setLast_updated(int last_updated) {
        this.last_updated = last_updated;
    }
}

