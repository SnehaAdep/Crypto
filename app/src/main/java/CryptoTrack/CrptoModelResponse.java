package CryptoTrack;


import java.util.Date;

public class CrptoModelResponse {
        public String plan;

        public Date plan_started_at;
        public String plan_status;
        public String portal_url;
        public Usage usage;

    public String getPlan() {
        return plan;
    }

    public void setPlan(String plan) {
        this.plan = plan;
    }

    public Date getPlan_started_at() {
        return plan_started_at;
    }

    public void setPlan_started_at(Date plan_started_at) {
        this.plan_started_at = plan_started_at;
    }

    public String getPlan_status() {
        return plan_status;
    }

    public void setPlan_status(String plan_status) {
        this.plan_status = plan_status;
    }

    public String getPortal_url() {
        return portal_url;
    }

    public void setPortal_url(String portal_url) {
        this.portal_url = portal_url;
    }

    public Usage getUsage() {
        return usage;
    }

    public void setUsage(Usage usage) {
        this.usage = usage;
    }
}



