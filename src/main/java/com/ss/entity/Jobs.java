package com.ss.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "jobs")
public class Jobs {
	@Id
	@Column(name = "idjobs", nullable = false)
	private int idjobs;
	@Column(name = "jobtitle", nullable = false)
	private String jobtitle;
	@Column(name = "jobdescription", nullable = false)
	private String jobdescription;
	@Column(name = "requiredqualification", nullable = false)
	private String requiredqualification;
	@Column(name = "selectioncriteria", nullable = false)
	private String selectioncriteria;
	@Column(name = "joblocation", nullable = false)
	private String joblocation;
	@Column(name = "salary", nullable = false)
	private String salary;
	@Column(name = "lastdate", nullable = false)
	private String lastdate;
	@Column(name = "postedby", nullable = false)
	private String postedby;
	@Column(name = "postedbyid", nullable = false)
	private int postedbyid;
	@Column(name = "active", nullable = false)
	private String active;
	@Column(name = "job_requirement", nullable = false)
	private String job_requirement;
	@Column(name = "experience", nullable = false)
	private String experience;
	@Column(name = "specialization", nullable = false)
	private String specialization;
	@Column(name = "jobcategory", nullable = false)
	private String jobcategory;
	
	public String getJobcategory() {
		return jobcategory;
	}
	public void setJobcategory(String jobcategory) {
		this.jobcategory = jobcategory;
	}
	public String getExperience() {
		return experience;
	}
	public void setExperience(String experience) {
		this.experience = experience;
	}
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	public String getActive() {
		return active;
	}
	public void setActive(String active) {
		this.active = active;
	}
	public String getJob_requirement() {
		return job_requirement;
	}
	public void setJob_requirement(String job_requirement) {
		this.job_requirement = job_requirement;
	}
	public int getIdjobs() {
		return idjobs;
	}
	public int getPostedbyid() {
		return postedbyid;
	}
	public void setPostedbyid(int postedbyid2) {
		this.postedbyid = postedbyid2;
	}
	public void setIdjobs(int idjobs) {
		this.idjobs = idjobs;
	}
	public String getJobtitle() {
		return jobtitle;
	}
	public void setJobtitle(String jobtitle) {
		this.jobtitle = jobtitle;
	}
	public String getJobdescription() {
		return jobdescription;
	}
	public void setJobdescription(String jobdescription) {
		this.jobdescription = jobdescription;
	}
	public String getRequiredqualification() {
		return requiredqualification;
	}
	public void setRequiredqualification(String requiredqualification) {
		this.requiredqualification = requiredqualification;
	}
	public String getSelectioncriteria() {
		return selectioncriteria;
	}
	public void setSelectioncriteria(String selectioncriteria) {
		this.selectioncriteria = selectioncriteria;
	}
	public String getJoblocation() {
		return joblocation;
	}
	public void setJoblocation(String joblocation) {
		this.joblocation = joblocation;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public String getLastdate() {
		return lastdate;
	}
	public void setLastdate(String lastdate) {
		this.lastdate = lastdate;
	}
	public String getPostedby() {
		return postedby;
	}
	public void setPostedby(String postedby) {
		this.postedby = postedby;
	}
	@Override
	public String toString() {
		return "jobs [idjobs=" + idjobs + ", jobtitle=" + jobtitle + ", jobdescription=" + jobdescription
				+ ", requiredqualification=" + requiredqualification + ", selectioncriteria=" + selectioncriteria
				+ ", joblocation=" + joblocation + ", salary=" + salary + ", lastdate=" + lastdate + ", postedby="
				+ postedby + ", postedbyid=" + postedbyid + ", active=" + active + ", job_requirement="
				+ job_requirement + "]";
	}
	
	
}
