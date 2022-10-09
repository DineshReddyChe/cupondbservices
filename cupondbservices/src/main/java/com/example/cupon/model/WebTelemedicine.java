package com.example.cupon.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class WebTelemedicine {
	@Id
    @GeneratedValue
   
    @Column(name = "TELEMEDICINE_ID")
    private Long telemedicineId;
	@Column(name = "IS_ALLOWED")
    private Boolean isAllowed;
    @Column(name = "IS_CANCEL")
    private Boolean isCancel;
    @Column(name = "IS_FREE_CALL")
    private Boolean isFreeCall;
    @Column(name = "IS_SMS_SEND")
    private Boolean isSmsSend;
	public Long getTelemedicineId() {
		return telemedicineId;
	}
	public void setTelemedicineId(Long telemedicineId) {
		this.telemedicineId = telemedicineId;
	}
	public Boolean getIsAllowed() {
		return isAllowed;
	}
	public void setIsAllowed(Boolean isAllowed) {
		this.isAllowed = isAllowed;
	}
	public Boolean getIsCancel() {
		return isCancel;
	}
	public void setIsCancel(Boolean isCancel) {
		this.isCancel = isCancel;
	}
	public Boolean getIsFreeCall() {
		return isFreeCall;
	}
	public void setIsFreeCall(Boolean isFreeCall) {
		this.isFreeCall = isFreeCall;
	}
	public Boolean getIsSmsSend() {
		return isSmsSend;
	}
	public void setIsSmsSend(Boolean isSmsSend) {
		this.isSmsSend = isSmsSend;
	}
}
