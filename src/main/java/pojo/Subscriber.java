package pojo;

import java.util.List;

public class Subscriber {

    private List<SubscriptionMembers> SubscriptionMembers;
    private boolean isCustomEffectiveDate;
    private String ClientID;
    private boolean isSubmit;

    public Subscriber(List<SubscriptionMembers> SubscriptionMembers, boolean isCustomEffectiveDate, String clientID, boolean isSubmit) {
        this.SubscriptionMembers = SubscriptionMembers;
        this.isCustomEffectiveDate = isCustomEffectiveDate;
        ClientID = clientID;
        this.isSubmit = isSubmit;
    }

    public List<SubscriptionMembers> getSubscriptionMembers() {
        return SubscriptionMembers;
    }

    public void setSubscriptionMembers(List<SubscriptionMembers> SubscriptionMembers) {
        this.SubscriptionMembers = SubscriptionMembers;
    }

    public boolean isCustomEffectiveDate() {
        return isCustomEffectiveDate;
    }

    public void setCustomEffectiveDate(boolean isCustomEffectiveDate) {
        this.isCustomEffectiveDate = isCustomEffectiveDate;
    }

    public String getClientID() {
        return ClientID;
    }

    public void setClientID(String clientID) {
        ClientID = clientID;
    }

    public boolean isSubmit() {
        return isSubmit;
    }

    public void setSubmit(boolean isSubmit) {
        this.isSubmit = isSubmit;
    }

    public Subscriber() {
    }

    @Override
    public String toString() {
        return "Subscriber{" +
                "SubscriptionMembers=" + SubscriptionMembers +
                ", isCustomEffectiveDate=" + isCustomEffectiveDate +
                ", ClientID=" + ClientID +
                ", isSubmit=" + isSubmit +
                '}';
    }
}
