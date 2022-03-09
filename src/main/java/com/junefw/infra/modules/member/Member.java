package com.junefw.infra.modules.member;

public class Member {
	
//	DTO	
	
	private String kbmmSeq;
	private String kbmmId;
	private String kbmmName;
	private String kbmmPassword;
	private Integer kbmmAdminNy;
	private Integer kbmmDelNy;
	private Integer kbmmGenderCd;
	private String kbmpNumberFull;
	private String ifcgSeq;
	private String ifcdName;
	private String ifcdOrder;

//------------
	public String getKbmmSeq() {
		return kbmmSeq;
	}
	public void setKbmmSeq(String kbmmSeq) {
		this.kbmmSeq = kbmmSeq;
	}
	public String getKbmmId() {
		return kbmmId;
	}
	public void setKbmmId(String kbmmId) {
		this.kbmmId = kbmmId;
	}
	public String getKbmmName() {
		return kbmmName;
	}
	public void setKbmmName(String kbmmName) {
		this.kbmmName = kbmmName;
	}
	public Integer getKbmmDelNy() {
		return kbmmDelNy;
	}
	public void setKbmmDelNy(Integer kbmmDelNy) {
		this.kbmmDelNy = kbmmDelNy;
	}
	public Integer getKbmmAdminNy() {
		return kbmmAdminNy;
	}
	public void setKbmmAdminNy(Integer kbmmAdminNy) {
		this.kbmmAdminNy = kbmmAdminNy;
	}
	public String getKbmmPassword() {
		return kbmmPassword;
	}
	public void setKbmmPassword(String kbmmPassword) {
		this.kbmmPassword = kbmmPassword;
	}
	public String getIfcdName() {
		return ifcdName;
	}
	public void setIfcdName(String ifcdName) {
		this.ifcdName = ifcdName;
	}
	public Integer getKbmmGenderCd() {
		return kbmmGenderCd;
	}
	public void setKbmmGenderCd(Integer kbmmGenderCd) {
		this.kbmmGenderCd = kbmmGenderCd;
	}
	public String getKbmpNumberFull() {
		return kbmpNumberFull;
	}
	public void setKbmpNumberFull(String kbmpNumberFull) {
		this.kbmpNumberFull = kbmpNumberFull;
	}
	public String getIfcgSeq() {
		return ifcgSeq;
	}
	public void setIfcgSeq(String ifcgSeq) {
		this.ifcgSeq = ifcgSeq;
	}
	public String getIfcdOrder() {
		return ifcdOrder;
	}
	public void setIfcdOrder(String ifcdOrder) {
		this.ifcdOrder = ifcdOrder;
	}
	
	
	

}
