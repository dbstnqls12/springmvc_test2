package com.junefw.infra.modules.member;

public class Member {
	
//	DTO	
	
	private String kbmmSeq;
	private String kbmmId;
	private String kbmmName;
	private Integer kbmmDelNy;
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
	

}
