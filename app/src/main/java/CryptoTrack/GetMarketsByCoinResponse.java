package CryptoTrack;

import java.util.Date;

public class GetMarketsByCoinResponse {
    public String exchange_id;
    public String exchange_name;
    public String pair;
    public String base_currency_id;
    public String base_currency_name;
    public String quote_currency_id;
    public String quote_currency_name;
    public String market_url;
    public String category;
    public String fee_type;
    public boolean outlier;
    public double adjusted_volume_24h_share;
    public Quotes quotes;
    public Date last_updated;
}

