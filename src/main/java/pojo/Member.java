package pojo;

import java.util.List;

public class Member {
    private boolean hideSSN;
    private boolean hideTaxId;
    private boolean hidessnLength;
    private boolean hideTaxIdLength;
    private boolean isAlternateIdExists;
    private boolean SurchargeOverride;
    private boolean isShowHMO;
    private boolean isShowDEN;
    private boolean IsHMOInfoExists_Hlth;
    private boolean IsCurrentProvider_Hlth;
    private boolean IsHMOInfoExists_Den;
    private boolean IsCurrentProvider_Den;
    private boolean isValidCOBDate;
    private List<MemberAddress> MemberAddress;
  //  private List<Object> AlternateId;
    private String SSN;
    private String clientID;
    private String LastName;
    private String FirstName;
    private String MiddleInitial;
    private String DateOfBirth;
    private int Gender;


    public Member() {

    }

    public Member(boolean hideSSN, boolean hideTaxId, boolean hidessnLength, boolean hideTaxIdLength, boolean isAlternateIdExists, boolean surchargeOverride, boolean isShowHMO, boolean isShowDEN, boolean isHMOInfoExists_Hlth, boolean isCurrentProvider_Hlth, boolean isHMOInfoExists_Den, boolean isCurrentProvider_Den, boolean isValidCOBDate, List<pojo.MemberAddress> memberAddress, String SSN, String clientID, String LastName, String FirstName, String MiddleInitial, String DateOfBirth, int Gender) {
        this.hideSSN = hideSSN ;
        this.hideTaxId = hideTaxId;
        this.hidessnLength = hidessnLength;
        this.hideTaxIdLength = hideTaxIdLength;
        this.isAlternateIdExists = isAlternateIdExists;
        SurchargeOverride = surchargeOverride;
        this.isShowHMO = isShowHMO;
        this.isShowDEN = isShowDEN;
        IsHMOInfoExists_Hlth = isHMOInfoExists_Hlth;
        IsCurrentProvider_Hlth = isCurrentProvider_Hlth;
        IsHMOInfoExists_Den = isHMOInfoExists_Den;
        IsCurrentProvider_Den = isCurrentProvider_Den;
        this.isValidCOBDate = isValidCOBDate;
        MemberAddress = memberAddress;
      //  AlternateId = alternateId;
        this.SSN = SSN;
        this.clientID = clientID;
        this.LastName = LastName;
        this.FirstName = FirstName;
        this.MiddleInitial = MiddleInitial;
        this.DateOfBirth = DateOfBirth;
        this.Gender = Gender;
    }

    public boolean isHideSSN() {
        return hideSSN;
    }

    public void setHideSSN(boolean hideSSN) {
        this.hideSSN = hideSSN;
    }

    public boolean isHideTaxId() {
        return hideTaxId;
    }

    public void setHideTaxId(boolean hideTaxId) {
        this.hideTaxId = hideTaxId;
    }

    public boolean isHidessnLength() {
        return hidessnLength;
    }

    public void setHidessnLength(boolean hidessnLength) {
        this.hidessnLength = hidessnLength;
    }

    public boolean isHideTaxIdLength() {
        return hideTaxIdLength;
    }

    public void setHideTaxIdLength(boolean hideTaxIdLength) {
        this.hideTaxIdLength = hideTaxIdLength;
    }

    public boolean isAlternateIdExists() {
        return isAlternateIdExists;
    }

    public void setAlternateIdExists(boolean alternateIdExists) {
        isAlternateIdExists = alternateIdExists;
    }

    public boolean isSurchargeOverride() {
        return SurchargeOverride;
    }

    public void setSurchargeOverride(boolean surchargeOverride) {
        SurchargeOverride = surchargeOverride;
    }

    public boolean isShowHMO() {
        return isShowHMO;
    }

    public void setShowHMO(boolean showHMO) {
        isShowHMO = showHMO;
    }

    public boolean isShowDEN() {
        return isShowDEN;
    }

    public void setShowDEN(boolean showDEN) {
        isShowDEN = showDEN;
    }

    public boolean isHMOInfoExists_Hlth() {
        return IsHMOInfoExists_Hlth;
    }

    public void setHMOInfoExists_Hlth(boolean HMOInfoExists_Hlth) {
        IsHMOInfoExists_Hlth = HMOInfoExists_Hlth;
    }

    public boolean isCurrentProvider_Hlth() {
        return IsCurrentProvider_Hlth;
    }

    public void setCurrentProvider_Hlth(boolean currentProvider_Hlth) {
        IsCurrentProvider_Hlth = currentProvider_Hlth;
    }

    public boolean isHMOInfoExists_Den() {
        return IsHMOInfoExists_Den;
    }

    public void setHMOInfoExists_Den(boolean HMOInfoExists_Den) {
        IsHMOInfoExists_Den = HMOInfoExists_Den;
    }

    public boolean isCurrentProvider_Den() {
        return IsCurrentProvider_Den;
    }

    public void setCurrentProvider_Den(boolean currentProvider_Den) {
        IsCurrentProvider_Den = currentProvider_Den;
    }

    public boolean isValidCOBDate() {
        return isValidCOBDate;
    }

    public void setValidCOBDate(boolean validCOBDate) {
        isValidCOBDate = validCOBDate;
    }

    public List<pojo.MemberAddress> getMemberAddress() {
        return MemberAddress;
    }

    public void setMemberAddress(List<pojo.MemberAddress> memberAddress) {
        MemberAddress = memberAddress;
    }

   // public List<Object> getAlternateId() {
      //  return AlternateId;
    //}

   // public void setAlternateId(List<Object> alternateId) {
      //  AlternateId = alternateId;
    //}

    public String getSSN() {
        return SSN;
    }

    public void setSSN(String SSN) {
        this.SSN = SSN;
    }

    public String getClientID() {
        return clientID;
    }

    public void setClientID(String clientID) {
        this.clientID = clientID;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getMiddleInitial() {
        return MiddleInitial;
    }

    public void setMiddleInitial(String middleInitial) {
        MiddleInitial = middleInitial;
    }

    public String getDateOfBirth() {
        return DateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        DateOfBirth = dateOfBirth;
    }

    public int getGender() {
        return Gender;
    }

    public void setGender(int gender) {
        Gender = gender;
    }

    @Override
    public String toString() {
        return "Member{" +
                "hideSSN=" + hideSSN +
                ", hideTaxId=" + hideTaxId +
                ", hidessnLength=" + hidessnLength +
                ", hideTaxIdLength=" + hideTaxIdLength +
                ", isAlternateIdExists=" + isAlternateIdExists +
                ", SurchargeOverride=" + SurchargeOverride +
                ", isShowHMO=" + isShowHMO +
                ", isShowDEN=" + isShowDEN +
                ", IsHMOInfoExists_Hlth=" + IsHMOInfoExists_Hlth +
                ", IsCurrentProvider_Hlth=" + IsCurrentProvider_Hlth +
                ", IsHMOInfoExists_Den=" + IsHMOInfoExists_Den +
                ", IsCurrentProvider_Den=" + IsCurrentProvider_Den +
                ", isValidCOBDate=" + isValidCOBDate +
                ", MemberAddress=" + MemberAddress +
               // ", AlternateId=" + AlternateId +
                ", SSN='" + SSN + '\'' +
                ", clientID='" + clientID + '\'' +
                ", LastName='" + LastName + '\'' +
                ", FirstName='" + FirstName + '\'' +
                ", MiddleInitial='" + MiddleInitial + '\'' +
                ", DateOfBirth='" + DateOfBirth + '\'' +
                ", Gender=" + Gender +
                '}';
    }
}
