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
	public Integer getKbmmGenderCd() {
		return kbmmGenderCd;
	}
	public void setKbmmGenderCd(Integer kbmmGenderCd) {
		this.kbmmGenderCd = kbmmGenderCd;
	}

	
	
	

}
