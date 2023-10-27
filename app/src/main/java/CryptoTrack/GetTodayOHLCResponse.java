package CryptoTrack;

import java.util.Date;

// import com.fasterxml.jackson.databind.ObjectMapper; // version 2.11.1
// import com.fasterxml.jackson.annotation.JsonProperty; // version 2.11.1
/* ObjectMapper om = new ObjectMapper();
Root[] root = om.readValue(myJsonString, Root[].class); */
public class GetTodayOHLCResponse {
    public Date time_open;
    public Date time_close;
  //  @JsonProperty("open")
    public double myopen;
    public double high;
    public double low;
    public double close;
    public int volume;
    public long market_cap;
}

