package pojo;

public class SubscriptionMemberPlans {

    private Boolean isDelete;
    private Boolean isPlanSelected;
    private Boolean isReEnroll;
    private Boolean isPlanReEnroll;
    private Boolean isPriorPlanEdit;
    private Boolean isNotFirstOfMonth;
    private String ClientPlanID;
    private String InsType;
    private String Benefits;
    private String AllowedEnrollment;
    private String DirectBillFlag;
    private String EffStartDate;

    public SubscriptionMemberPlans() {

    }

    public SubscriptionMemberPlans(Boolean isDelete, Boolean isPlanSelected, Boolean isReEnroll, Boolean isPlanReEnroll, Boolean isPriorPlanEdit, Boolean isNotFirstOfMonth, String ClientPlanID, String InsType, String Benefits, String AllowedEnrollment, String DirectBillFlag, String EffStartDate) {
        this.isDelete = isDelete;
        this.isPlanSelected = isPlanSelected;
        this.isReEnroll = isReEnroll;
        this.isPlanReEnroll = isPlanReEnroll;
        this.isPriorPlanEdit = isPriorPlanEdit;
        this.isNotFirstOfMonth = isNotFirstOfMonth;
        this.ClientPlanID = ClientPlanID;
        this.InsType = InsType;
        this.Benefits = Benefits;
        this.AllowedEnrollment = AllowedEnrollment;
        this.DirectBillFlag = DirectBillFlag;
        this.EffStartDate = EffStartDate;
    }

    public Boolean getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Boolean isDelete) {
        this.isDelete = isDelete;
    }

    public Boolean getIsPlanSelected() {
        return isPlanSelected;
    }

    public void setIsPlanSelected(Boolean isPlanSelected) {
        this.isPlanSelected = isPlanSelected;
    }

    public Boolean getIsReEnroll() {
        return isReEnroll;
    }

    public void setIsReEnroll(Boolean isReEnroll) {
        this.isReEnroll = isReEnroll;
    }

    public Boolean getIsPlanReEnroll() {
        return isPlanReEnroll;
    }

    public void setIsPlanReEnroll(Boolean isPlanReEnroll) {
        this.isPlanReEnroll = isPlanReEnroll;
    }

    public Boolean getIsPriorPlanEdit() {
        return isPriorPlanEdit;
    }

    public void setIsPriorPlanEdit(Boolean isPriorPlanEdit) {
        this.isPriorPlanEdit = isPriorPlanEdit;
    }

    public Boolean getIsNotFirstOfMonth() {
        return isNotFirstOfMonth;
    }

    public void setIsNotFirstOfMonth(Boolean isNotFirstOfMonth) {
        this.isNotFirstOfMonth = isNotFirstOfMonth;
    }

    public String getClientPlanID() {
        return ClientPlanID;
    }

    public void setClientPlanID(String clientPlanID) {
        this.ClientPlanID = clientPlanID;
    }

    public String getInsType() {
        return InsType;
    }

    public void setInsType(String insType) {
        this.InsType = insType;
    }

    public String getBenefits() {
        return Benefits;
    }

    public void setBenefits(String benefits) {
        this.Benefits = benefits;
    }

    public String getAllowedEnrollment() {
        return AllowedEnrollment;
    }

    public void setAllowedEnrollment(String allowedEnrollment) {
        this.AllowedEnrollment = allowedEnrollment;
    }

    public String getDirectBillFlag() {
        return DirectBillFlag;
    }

    public void setDirectBillFlag(String directBillFlag) {
        this.DirectBillFlag = directBillFlag;
    }

    public String getEffStartDate() {
        return EffStartDate;
    }

    public void setEffStartDate(String effStartDate) {
        this.EffStartDate = effStartDate;
    }

    @Override
    public String toString() {
        return "SubscriptionMemberPlans{" +
                "isDelete=" + isDelete +
                ", isPlanSelected=" + isPlanSelected +
                ", isReEnroll=" + isReEnroll +
                ", isPlanReEnroll=" + isPlanReEnroll +
                ", isPriorPlanEdit=" + isPriorPlanEdit +
                ", isNotFirstOfMonth=" + isNotFirstOfMonth +
                ", ClientPlanID='" + ClientPlanID + '\'' +
                ", InsType='" + InsType + '\'' +
                ", Benefits='" + Benefits + '\'' +
                ", AllowedEnrollment='" + AllowedEnrollment + '\'' +
                ", DirectBillFlag='" + DirectBillFlag + '\'' +
                ", EffStartDate='" + EffStartDate + '\'' +
                '}';
    }

}
