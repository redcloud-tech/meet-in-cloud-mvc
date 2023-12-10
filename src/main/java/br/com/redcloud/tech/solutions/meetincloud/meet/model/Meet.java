package br.com.redcloud.tech.solutions.meetincloud.meet.model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Objects;

public class Meet {
	private String meetingName;
	private LocalDate meetingStartDate;
	private LocalDate meetingEndDate;
	private LocalTime meetingStartTime;
	private LocalTime meetingEndTime;
	private LocalDate creationDate;
	private Integer priority;
	private String meetingCategory;
	private String meetingDescription;
	
	
	public Meet() {
		super();
	}


	public Meet(String meetingName, LocalDate meetingStartDate, LocalDate meetingEndDate, LocalTime meetingStartTime,
			LocalTime meetingEndTime, LocalDate creationDate, Integer priority, String meetingCategory,
			String meetingDescription) {
		super();
		this.meetingName = meetingName;
		this.meetingStartDate = meetingStartDate;
		this.meetingEndDate = meetingEndDate;
		this.meetingStartTime = meetingStartTime;
		this.meetingEndTime = meetingEndTime;
		this.creationDate = creationDate;
		this.priority = priority;
		this.meetingCategory = meetingCategory;
		this.meetingDescription = meetingDescription;
	}




	public String getMeetingName() {
		return meetingName;
	}


	public void setMeetingName(String meetingName) {
		this.meetingName = meetingName;
	}


	public LocalDate getMeetingStartDate() {
		return meetingStartDate;
	}


	public void setMeetingStartDate(LocalDate meetingStartDate) {
		this.meetingStartDate = meetingStartDate;
	}


	public LocalDate getMeetingEndDate() {
		return meetingEndDate;
	}


	public void setMeetingEndDate(LocalDate meetingEndDate) {
		this.meetingEndDate = meetingEndDate;
	}


	public LocalTime getMeetingStartTime() {
		return meetingStartTime;
	}


	public void setMeetingStartTime(LocalTime meetingStartTime) {
		this.meetingStartTime = meetingStartTime;
	}


	public LocalTime getMeetingEndTime() {
		return meetingEndTime;
	}


	public void setMeetingEndTime(LocalTime meetingEndTime) {
		this.meetingEndTime = meetingEndTime;
	}


	public LocalDate getCreationDate() {
		return creationDate;
	}


	public void setCreationDate(LocalDate creationDate) {
		this.creationDate = creationDate;
	}


	public Integer getPriority() {
		return priority;
	}


	public void setPriority(Integer priority) {
		this.priority = priority;
	}


	public String getMeetingCategory() {
		return meetingCategory;
	}


	public void setMeetingCategory(String meetingCategory) {
		this.meetingCategory = meetingCategory;
	}


	public String getMeetingDescription() {
		return meetingDescription;
	}


	public void setMeetingDescription(String meetingDescription) {
		this.meetingDescription = meetingDescription;
	}




	@Override
	public int hashCode() {
		return Objects.hash(creationDate, meetingCategory, meetingDescription, meetingEndDate, meetingEndTime,
				meetingName, meetingStartDate, meetingStartTime, priority);
	}




	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Meet other = (Meet) obj;
		return Objects.equals(creationDate, other.creationDate)
				&& Objects.equals(meetingCategory, other.meetingCategory)
				&& Objects.equals(meetingDescription, other.meetingDescription)
				&& Objects.equals(meetingEndDate, other.meetingEndDate)
				&& Objects.equals(meetingEndTime, other.meetingEndTime)
				&& Objects.equals(meetingName, other.meetingName)
				&& Objects.equals(meetingStartDate, other.meetingStartDate)
				&& Objects.equals(meetingStartTime, other.meetingStartTime) && Objects.equals(priority, other.priority);
	}




	@Override
	public String toString() {
		return "Meet [meetingName=" + meetingName + ", meetingStartDate=" + meetingStartDate + ", meetingEndDate="
				+ meetingEndDate + ", meetingStartTime=" + meetingStartTime + ", meetingEndTime=" + meetingEndTime
				+ ", creationDate=" + creationDate + ", priority=" + priority + ", meetingCategory=" + meetingCategory
				+ ", meetingDescription=" + meetingDescription + "]";
	}
	
	
}
