package com.ss.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "job_application")
public class Job_Application {

	@Id
	@Column(name = "idjob_application", nullable = false)
	private int idjob_application;
	
	@Column(name="candidate_id", nullable = false)
	public int candidate_id;
	
	@Column(name="job_id", nullable = false)
	public int job_id;

	public int getCandidate_id() {
		return candidate_id;
	}

	public void setCandidate_id(int candidate_id) {
		this.candidate_id = candidate_id;
	}

	public int getJob_id() {
		return job_id;
	}

	public void setJob_id(int job_id) {
		this.job_id = job_id;
	}

	@Override
	public String toString() {
		return "Job_Application [candidate_id=" + candidate_id + ", job_id=" + job_id + "]";
	}

}
