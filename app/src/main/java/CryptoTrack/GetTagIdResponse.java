package CryptoTrack;

import java.util.ArrayList;

// import com.fasterxml.jackson.databind.ObjectMapper; // version 2.11.1
// import com.fasterxml.jackson.annotation.JsonProperty; // version 2.11.1
/* ObjectMapper om = new ObjectMapper();
Root[] root = om.readValue(myJsonString, Root[].class); */
public class GetTagIdResponse {
    public String id;
    public String name;
    public int coin_counter;
    public int ico_counter;
    public String description;
    public String type;
    public ArrayList<String> coins;
    public ArrayList<String> icos;
}

