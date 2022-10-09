package com.example.cupon.model;

import java.math.BigDecimal;
import java.sql.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Encounter {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Basic(optional = false)
	    @Column(name = "ENCOUNTER_ID")
	    private Long encounterId;
	   
	    @Column(name = "OP_ID")
	    private String opId;
	    @Basic(optional = false)
	   
	    @Column(name = "PATIENT_ID")
	    private long patientId;
	   
	    @Column(name = "DATE_OF_VISIT")
	    
	    private Date dateOfVisit;
	   
	    @Column(name = "SPECIALITY_ID")
	    private int specialityId;
	   
	    @Column(name = "NOTES")
	    private String notes;

	    @Column(name = "IS_SHOWN_IN_PROGRESSNOTE")
	    private Boolean isShownInProgressnote;
	    @Column(name = "FACILITY_SPECIALITY_LINK_ID")
	    private Integer facilitySpecialityLinkId;
	  
	  
	    @Column(name = "IS_CONCURRENT_LOCKED")
	    private boolean isConcurrentLocked;
	  
	    @Column(name = "LOCKED_FOR")
	    private String lockedFor;
	    
	   
	    @Column(name = "DISCHARGE_NOTES")
	    private String dischargeNotes;
	    @Column(name = "IS_ADULT")
	    private Boolean isAdult;
	    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
	    @Column(name = "SERVICE_TAX_PERCENTAGE")
	    private BigDecimal serviceTaxPercentage;
	    @Column(name = "TOTAL_BILLED_AMOUNT")
	    private BigDecimal totalBilledAmount;
	    @Column(name = "SEQUENCE_NUMBER")
	    private Integer sequenceNumber;
	    @Column(name = "IS_AROGYASREE")
	    private Boolean isArogyasree;
	    
	    private String arogyasreeId;
	    @Column(name = "IS_EMERGENCY_REGISTRATION")
	    private Boolean isEmergencyRegistration;
	    @Column(name = "IS_CONVERTED_TO_ADMISSION")
	    private Boolean isConvertedToAdmission;
	    
	    
	    @Column(name = "IS_REVIEW")
	    private Boolean isReview;
	   
	    @Column(name = "IS_FREE_CONSULTATION")
	    private Boolean isFreeConsultation;
	   
	    @Column(name = "MODE")
	    private String mode;
	    @Column(name = "IS_COLLECTION_CENTER")
	    private Boolean isCollectionCenter;
	    @Column(name = "OP_SPECIALITY_ID")
	    private Integer opSpecialityId;
	    @Column(name = "OP_NO")
	    private Integer opNo;
	    @Column(name = "OP_CONSULTATION_STATUS_ID")
	    private Integer opConsultationStatusId;
	    @Column(name = "OP_LAB_STATUS_ID")
	    private Integer opLabStatusId;
	    @Column(name = "IS_OP_LAB_BILL")
	    private Boolean isOpLabBill;
	    @Column(name = "CONSULTATION_CHARGE_GROUP_ID")
	    private Integer consultationChargeGroupId;
	    @Column(name = "LAB_ADMISSION_ID")
	    private Integer labAdmissionId;
	    @Column(name = "REVIEW_COUNT")
	    private Integer reviewCount;
		public Long getEncounterId() {
			return encounterId;
		}
		public void setEncounterId(Long encounterId) {
			this.encounterId = encounterId;
		}
		public String getOpId() {
			return opId;
		}
		public void setOpId(String opId) {
			this.opId = opId;
		}
		public long getPatientId() {
			return patientId;
		}
		public void setPatientId(long patientId) {
			this.patientId = patientId;
		}
		public Date getDateOfVisit() {
			return dateOfVisit;
		}
		public void setDateOfVisit(Date dateOfVisit) {
			this.dateOfVisit = dateOfVisit;
		}
		public int getSpecialityId() {
			return specialityId;
		}
		public void setSpecialityId(int specialityId) {
			this.specialityId = specialityId;
		}
		public String getNotes() {
			return notes;
		}
		public void setNotes(String notes) {
			this.notes = notes;
		}
		public Boolean getIsShownInProgressnote() {
			return isShownInProgressnote;
		}
		public void setIsShownInProgressnote(Boolean isShownInProgressnote) {
			this.isShownInProgressnote = isShownInProgressnote;
		}
		public Integer getFacilitySpecialityLinkId() {
			return facilitySpecialityLinkId;
		}
		public void setFacilitySpecialityLinkId(Integer facilitySpecialityLinkId) {
			this.facilitySpecialityLinkId = facilitySpecialityLinkId;
		}
		public boolean isConcurrentLocked() {
			return isConcurrentLocked;
		}
		public void setConcurrentLocked(boolean isConcurrentLocked) {
			this.isConcurrentLocked = isConcurrentLocked;
		}
		public String getLockedFor() {
			return lockedFor;
		}
		public void setLockedFor(String lockedFor) {
			this.lockedFor = lockedFor;
		}
		public String getDischargeNotes() {
			return dischargeNotes;
		}
		public void setDischargeNotes(String dischargeNotes) {
			this.dischargeNotes = dischargeNotes;
		}
		public Boolean getIsAdult() {
			return isAdult;
		}
		public void setIsAdult(Boolean isAdult) {
			this.isAdult = isAdult;
		}
		public BigDecimal getServiceTaxPercentage() {
			return serviceTaxPercentage;
		}
		public void setServiceTaxPercentage(BigDecimal serviceTaxPercentage) {
			this.serviceTaxPercentage = serviceTaxPercentage;
		}
		public BigDecimal getTotalBilledAmount() {
			return totalBilledAmount;
		}
		public void setTotalBilledAmount(BigDecimal totalBilledAmount) {
			this.totalBilledAmount = totalBilledAmount;
		}
		public Integer getSequenceNumber() {
			return sequenceNumber;
		}
		public void setSequenceNumber(Integer sequenceNumber) {
			this.sequenceNumber = sequenceNumber;
		}
		public Boolean getIsArogyasree() {
			return isArogyasree;
		}
		public void setIsArogyasree(Boolean isArogyasree) {
			this.isArogyasree = isArogyasree;
		}
		public String getArogyasreeId() {
			return arogyasreeId;
		}
		public void setArogyasreeId(String arogyasreeId) {
			this.arogyasreeId = arogyasreeId;
		}
		public Boolean getIsEmergencyRegistration() {
			return isEmergencyRegistration;
		}
		public void setIsEmergencyRegistration(Boolean isEmergencyRegistration) {
			this.isEmergencyRegistration = isEmergencyRegistration;
		}
		public Boolean getIsConvertedToAdmission() {
			return isConvertedToAdmission;
		}
		public void setIsConvertedToAdmission(Boolean isConvertedToAdmission) {
			this.isConvertedToAdmission = isConvertedToAdmission;
		}
		public Boolean getIsReview() {
			return isReview;
		}
		public void setIsReview(Boolean isReview) {
			this.isReview = isReview;
		}
		public Boolean getIsFreeConsultation() {
			return isFreeConsultation;
		}
		public void setIsFreeConsultation(Boolean isFreeConsultation) {
			this.isFreeConsultation = isFreeConsultation;
		}
		public String getMode() {
			return mode;
		}
		public void setMode(String mode) {
			this.mode = mode;
		}
		public Boolean getIsCollectionCenter() {
			return isCollectionCenter;
		}
		public void setIsCollectionCenter(Boolean isCollectionCenter) {
			this.isCollectionCenter = isCollectionCenter;
		}
		public Integer getOpSpecialityId() {
			return opSpecialityId;
		}
		public void setOpSpecialityId(Integer opSpecialityId) {
			this.opSpecialityId = opSpecialityId;
		}
		public Integer getOpNo() {
			return opNo;
		}
		public void setOpNo(Integer opNo) {
			this.opNo = opNo;
		}
		public Integer getOpConsultationStatusId() {
			return opConsultationStatusId;
		}
		public void setOpConsultationStatusId(Integer opConsultationStatusId) {
			this.opConsultationStatusId = opConsultationStatusId;
		}
		public Integer getOpLabStatusId() {
			return opLabStatusId;
		}
		public void setOpLabStatusId(Integer opLabStatusId) {
			this.opLabStatusId = opLabStatusId;
		}
		public Boolean getIsOpLabBill() {
			return isOpLabBill;
		}
		public void setIsOpLabBill(Boolean isOpLabBill) {
			this.isOpLabBill = isOpLabBill;
		}
		public Integer getConsultationChargeGroupId() {
			return consultationChargeGroupId;
		}
		public void setConsultationChargeGroupId(Integer consultationChargeGroupId) {
			this.consultationChargeGroupId = consultationChargeGroupId;
		}
		public Integer getLabAdmissionId() {
			return labAdmissionId;
		}
		public void setLabAdmissionId(Integer labAdmissionId) {
			this.labAdmissionId = labAdmissionId;
		}
		public Integer getReviewCount() {
			return reviewCount;
		}
		public void setReviewCount(Integer reviewCount) {
			this.reviewCount = reviewCount;
		}
	   
}
	   
	   