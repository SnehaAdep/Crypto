package CryptoTrack;

import java.util.Date;


public class GetOHLCLastFullDayResponse {
    public Date time_open;
    public Date time_close;
   // @JsonProperty("open")
    public double myopen;
    public double high;
    public double low;
    public double close;
    public int volume;
    public long market_cap;
}


