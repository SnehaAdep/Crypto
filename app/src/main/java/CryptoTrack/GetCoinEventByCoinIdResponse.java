package CryptoTrack;


import java.util.Date;

public class GetCoinEventByCoinIdResponse {
    public String id;
    public Date date;
    public String date_to;
    public String name;
    public String description;
    public boolean is_conference;
    public String link;
    public String proof_image_link;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDate_to() {
        return date_to;
    }

    public void setDate_to(String date_to) {
        this.date_to = date_to;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isIs_conference() {
        return is_conference;
    }

    public void setIs_conference(boolean is_conference) {
        this.is_conference = is_conference;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getProof_image_link() {
        return proof_image_link;
    }

    public void setProof_image_link(String proof_image_link) {
        this.proof_image_link = proof_image_link;
    }
}


