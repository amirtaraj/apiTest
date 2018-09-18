package pojo;

import java.util.List;

public class SubscriptionMembers {

   private boolean isPrimany;
   private boolean isBoardMember;
   private boolean isAddressCopy;
   private boolean isContactCopy;
   private boolean showDepEligiblePlan;
   private boolean isLife;
   private Object medicalCertDate;
   private boolean islifeCertDate;
   private boolean isdentalCertDate;
   private boolean ismedicalCertDate;
   private boolean isvisionCertDate;
   private boolean isEdit;
   private boolean isDeptCertApplicable;
   private boolean IsFreezeRelationship;
   private boolean IsHideEdit;
   private boolean IsExistAsSubscriber;
   private boolean isCobra;
   private Member Member;
   private List<SubscriptionMemberPlans> SubscriptionMemberPlans;
   private RelationTypes RelationTypes;
   private int CobraCode;
   private boolean isAutoPopulate;
   private boolean isNewMember;
   private Object ssnBind;
   private boolean isMasterEffectiveDate;
   private Object masterEffectiveDate;
   private boolean isActive;
   private boolean isSelected;

    public SubscriptionMembers() {

    }

    public SubscriptionMembers(boolean isPrimany, boolean isBoardMember, boolean isAddressCopy, boolean isContactCopy, boolean showDepEligiblePlan, boolean isLife, Object medicalCertDate, boolean islifeCertDate, boolean isdentalCertDate, boolean ismedicalCertDate, boolean isvisionCertDate, boolean isEdit, boolean isDeptCertApplicable, boolean isFreezeRelationship, boolean isHideEdit, boolean isExistAsSubscriber, boolean isCobra, pojo.Member Member, List<pojo.SubscriptionMemberPlans> SubscriptionMemberPlans, pojo.RelationTypes RelationTypes, int CobraCode, boolean isAutoPopulate, boolean isNewMember, Object ssnBind, boolean isMasterEffectiveDate, Object masterEffectiveDate, boolean isActive, boolean isSelected) {
        this.isPrimany = isPrimany;
        this.isBoardMember = isBoardMember;
        this.isAddressCopy = isAddressCopy;
        this.isContactCopy = isContactCopy;
        this.showDepEligiblePlan = showDepEligiblePlan;
        this.isLife = isLife;
        this.medicalCertDate = medicalCertDate;
        this.islifeCertDate = islifeCertDate;
        this.isdentalCertDate = isdentalCertDate;
        this.ismedicalCertDate = ismedicalCertDate;
        this.isvisionCertDate = isvisionCertDate;
        this.isEdit = isEdit;
        this.isDeptCertApplicable = isDeptCertApplicable;
        IsFreezeRelationship = isFreezeRelationship;
        IsHideEdit = isHideEdit;
        IsExistAsSubscriber = isExistAsSubscriber;
        this.isCobra = isCobra;
        this.Member = Member;
        this.SubscriptionMemberPlans = SubscriptionMemberPlans;
        this.RelationTypes = RelationTypes;
        this.CobraCode = CobraCode;
        this.isAutoPopulate = isAutoPopulate;
        this.isNewMember = isNewMember;
        this.ssnBind = ssnBind;
        this.isMasterEffectiveDate = isMasterEffectiveDate;
        this.masterEffectiveDate = masterEffectiveDate;
        this.isActive = isActive;
        this.isSelected = isSelected;
    }

    public boolean isPrimany() {
        return isPrimany;
    }

    public void setPrimany(boolean primany) {
        isPrimany = primany;
    }

    public boolean isBoardMember() {
        return isBoardMember;
    }

    public void setBoardMember(boolean boardMember) {
        isBoardMember = boardMember;
    }

    public boolean isAddressCopy() {
        return isAddressCopy;
    }

    public void setAddressCopy(boolean addressCopy) {
        isAddressCopy = addressCopy;
    }

    public boolean isContactCopy() {
        return isContactCopy;
    }

    public void setContactCopy(boolean contactCopy) {
        isContactCopy = contactCopy;
    }

    public boolean isShowDepEligiblePlan() {
        return showDepEligiblePlan;
    }

    public void setShowDepEligiblePlan(boolean showDepEligiblePlan) {
        this.showDepEligiblePlan = showDepEligiblePlan;
    }

    public boolean isLife() {
        return isLife;
    }

    public void setLife(boolean life) {
        isLife = life;
    }

    public Object getMedicalCertDate() {
        return medicalCertDate;
    }

    public void setMedicalCertDate(Object medicalCertDate) {
        this.medicalCertDate = medicalCertDate;
    }

    public boolean isIslifeCertDate() {
        return islifeCertDate;
    }

    public void setIslifeCertDate(boolean islifeCertDate) {
        this.islifeCertDate = islifeCertDate;
    }

    public boolean isIsdentalCertDate() {
        return isdentalCertDate;
    }

    public void setIsdentalCertDate(boolean isdentalCertDate) {
        this.isdentalCertDate = isdentalCertDate;
    }

    public boolean isIsmedicalCertDate() {
        return ismedicalCertDate;
    }

    public void setIsmedicalCertDate(boolean ismedicalCertDate) {
        this.ismedicalCertDate = ismedicalCertDate;
    }

    public boolean isIsvisionCertDate() {
        return isvisionCertDate;
    }

    public void setIsvisionCertDate(boolean isvisionCertDate) {
        this.isvisionCertDate = isvisionCertDate;
    }

    public boolean isEdit() {
        return isEdit;
    }

    public void setEdit(boolean edit) {
        isEdit = edit;
    }

    public boolean isDeptCertApplicable() {
        return isDeptCertApplicable;
    }

    public void setDeptCertApplicable(boolean deptCertApplicable) {
        isDeptCertApplicable = deptCertApplicable;
    }

    public boolean isFreezeRelationship() {
        return IsFreezeRelationship;
    }

    public void setFreezeRelationship(boolean freezeRelationship) {
        IsFreezeRelationship = freezeRelationship;
    }

    public boolean isHideEdit() {
        return IsHideEdit;
    }

    public void setHideEdit(boolean hideEdit) {
        IsHideEdit = hideEdit;
    }

    public boolean isExistAsSubscriber() {
        return IsExistAsSubscriber;
    }

    public void setExistAsSubscriber(boolean existAsSubscriber) {
        IsExistAsSubscriber = existAsSubscriber;
    }

    public boolean isCobra() {
        return isCobra;
    }

    public void setCobra(boolean cobra) {
        isCobra = cobra;
    }

    public pojo.Member getMember() {
        return Member;
    }

    public void setMember(pojo.Member member) {
        Member = member;
    }

    public List<pojo.SubscriptionMemberPlans> getSubscriptionMemberPlans() {
        return SubscriptionMemberPlans;
    }

    public void setSubscriptionMemberPlans(List<pojo.SubscriptionMemberPlans> subscriptionMemberPlans) {
        SubscriptionMemberPlans = subscriptionMemberPlans;
    }

    public pojo.RelationTypes getRelationTypes() {
        return RelationTypes;
    }

    public void setRelationTypes(pojo.RelationTypes relationTypes) {
        RelationTypes = relationTypes;
    }

    public int getCobraCode() {
        return CobraCode;
    }

    public void setCobraCode(int cobraCode) {
        CobraCode = cobraCode;
    }

    public boolean isAutoPopulate() {
        return isAutoPopulate;
    }

    public void setAutoPopulate(boolean autoPopulate) {
        isAutoPopulate = autoPopulate;
    }

    public boolean isNewMember() {
        return isNewMember;
    }

    public void setNewMember(boolean newMember) {
        isNewMember = newMember;
    }

    public Object getSsnBind() {
        return ssnBind;
    }

    public void setSsnBind(Object ssnBind) {
        this.ssnBind = ssnBind;
    }

    public boolean isMasterEffectiveDate() {
        return isMasterEffectiveDate;
    }

    public void setMasterEffectiveDate(boolean masterEffectiveDate) {
        isMasterEffectiveDate = masterEffectiveDate;
    }

    public Object getMasterEffectiveDate() {
        return masterEffectiveDate;
    }

    public void setMasterEffectiveDate(Object masterEffectiveDate) {
        this.masterEffectiveDate = masterEffectiveDate;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public boolean isSelected() {
        return isSelected;
    }

    public void setSelected(boolean selected) {
        isSelected = selected;
    }

    @Override
    public String toString() {
        return "SubscriptionMembers{" +
                "isPrimany=" + isPrimany +
                ", isBoardMember=" + isBoardMember +
                ", isAddressCopy=" + isAddressCopy +
                ", isContactCopy=" + isContactCopy +
                ", showDepEligiblePlan=" + showDepEligiblePlan +
                ", isLife=" + isLife +
                ", medicalCertDate=" + medicalCertDate +
                ", islifeCertDate=" + islifeCertDate +
                ", isdentalCertDate=" + isdentalCertDate +
                ", ismedicalCertDate=" + ismedicalCertDate +
                ", isvisionCertDate=" + isvisionCertDate +
                ", isEdit=" + isEdit +
                ", isDeptCertApplicable=" + isDeptCertApplicable +
                ", IsFreezeRelationship=" + IsFreezeRelationship +
                ", IsHideEdit=" + IsHideEdit +
                ", IsExistAsSubscriber=" + IsExistAsSubscriber +
                ", isCobra=" + isCobra +
                ", Member=" + Member +
                ", SubscriptionMemberPlans=" + SubscriptionMemberPlans +
                ", RelationTypes=" + RelationTypes +
                ", CobraCode=" + CobraCode +
                ", isAutoPopulate=" + isAutoPopulate +
                ", isNewMember=" + isNewMember +
                ", ssnBind=" + ssnBind +
                ", isMasterEffectiveDate=" + isMasterEffectiveDate +
                ", masterEffectiveDate=" + masterEffectiveDate +
                ", isActive=" + isActive +
                ", isSelected=" + isSelected +
                '}';
    }
}
