package CryptoTrack;

import java.util.Date;

public class TwitterTimelineResponse {
    public Date date;
    public String user_name;
    public String user_image_link;
    public String status;
    public boolean is_retweet;
    public int retweet_count;
    public int like_count;
    public String status_link;
    public String status_id;
    public String media_link;
    public String youtube_link;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_image_link() {
        return user_image_link;
    }

    public void setUser_image_link(String user_image_link) {
        this.user_image_link = user_image_link;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public boolean isIs_retweet() {
        return is_retweet;
    }

    public void setIs_retweet(boolean is_retweet) {
        this.is_retweet = is_retweet;
    }

    public int getRetweet_count() {
        return retweet_count;
    }

    public void setRetweet_count(int retweet_count) {
        this.retweet_count = retweet_count;
    }

    public int getLike_count() {
        return like_count;
    }

    public void setLike_count(int like_count) {
        this.like_count = like_count;
    }

    public String getStatus_link() {
        return status_link;
    }

    public void setStatus_link(String status_link) {
        this.status_link = status_link;
    }

    public String getStatus_id() {
        return status_id;
    }

    public void setStatus_id(String status_id) {
        this.status_id = status_id;
    }

    public String getMedia_link() {
        return media_link;
    }

    public void setMedia_link(String media_link) {
        this.media_link = media_link;
    }

    public String getYoutube_link() {
        return youtube_link;
    }

    public void setYoutube_link(String youtube_link) {
        this.youtube_link = youtube_link;
    }
}


