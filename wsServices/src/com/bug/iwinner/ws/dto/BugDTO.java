package com.bug.iwinner.ws.dto;

import java.util.Date;

public class BugDTO implements java.io.Serializable
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String bugName;
	private String bugDesc;
	private String bugInfo;
	private Long bugLongId;
	private Double bugDoubleId;
	private Float bugFloatId;
	private Date date;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getBugName() {
		return bugName;
	}

	public void setBugName(String bugName) {
		this.bugName = bugName;
	}

	public String getBugDesc() {
		return bugDesc;
	}

	public void setBugDesc(String bugDesc) {
		this.bugDesc = bugDesc;
	}

	public String getBugInfo() {
		return bugInfo;
	}

	public void setBugInfo(String bugInfo) {
		this.bugInfo = bugInfo;
	}

	public Long getBugLongId() {
		return bugLongId;
	}

	public void setBugLongId(Long bugLongId) {
		this.bugLongId = bugLongId;
	}

	public Double getBugDoubleId() {
		return bugDoubleId;
	}

	public void setBugDoubleId(Double bugDoubleId) {
		this.bugDoubleId = bugDoubleId;
	}

	public Float getBugFloatId() {
		return bugFloatId;
	}

	public void setBugFloatId(Float bugFloatId) {
		this.bugFloatId = bugFloatId;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

		@Override
	public String toString() {
		return "BugDTO [id=" + id + ", bugName=" + bugName + ", bugDesc="
				+ bugDesc + ", bugInfo=" + bugInfo + ", bugLongId=" + bugLongId
				+ ", bugDoubleId=" + bugDoubleId + ", bugFloatId=" + bugFloatId
				+ "]";
	}

	
}
