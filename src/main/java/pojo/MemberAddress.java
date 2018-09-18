package pojo;

public class MemberAddress {

   private boolean isMailingAdd;
   private int AddressTypeID;
   private boolean isActive;
   private int CountryID;
   private String CountryName;
   private String AddressLine1;
   private int ZipCode;
   private String City;
   private String State;


    public MemberAddress() {

    }

    public MemberAddress(boolean isMailingAdd, int AddressTypeID, boolean isActive, int CountryID, String CountryName, String AddressLine1, int ZipCode, String City, String State) {
        this.isMailingAdd = isMailingAdd;
        this.AddressTypeID = AddressTypeID;
        this.isActive = isActive;
        this.CountryID = CountryID;
        this.CountryName = CountryName;
        this.AddressLine1 = AddressLine1;
        this.ZipCode = ZipCode;
        this.City = City;
        this.State = State;
    }

    public boolean isMailingAdd() {
        return isMailingAdd;
    }

    public void setMailingAdd(boolean mailingAdd) {
        isMailingAdd = mailingAdd;
    }

    public int getAddressTypeID() {
        return AddressTypeID;
    }

    public void setAddressTypeID(int addressTypeID) {
        AddressTypeID = addressTypeID;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public int getCountryID() {
        return CountryID;
    }

    public void setCountryID(int countryID) {
        CountryID = countryID;
    }

    public String getCountryName() {
        return CountryName;
    }

    public void setCountryName(String countryName) {
        CountryName = countryName;
    }

    public String getAddressLine1() {
        return AddressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        AddressLine1 = addressLine1;
    }

    public int getZipCode() {
        return ZipCode;
    }

    public void setZipCode(int zipCode) {
        ZipCode = zipCode;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    @Override
    public String toString() {
        return "MemberAddress{" +
                "isMailingAdd=" + isMailingAdd +
                ", AddressTypeID=" + AddressTypeID +
                ", isActive=" + isActive +
                ", CountryID=" + CountryID +
                ", CountryName='" + CountryName + '\'' +
                ", AddressLine1='" + AddressLine1 + '\'' +
                ", ZipCode=" + ZipCode +
                ", City='" + City + '\'' +
                ", State='" + State + '\'' +
                '}';
    }
}
