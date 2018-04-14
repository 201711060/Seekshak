package com.ss.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "research")
public class Research {

	@Id
	@Column(name = "idresearch", nullable = false)
	private int idresearch;
	@Column(name = "title", nullable = false)
	private String title;
	@Column(name = "paper_type", nullable = false)
	private String paper_type;
	@Column(name = "issn", nullable = false)
	private int issn;
	@Column(name = "impact_factor", nullable = false)
	private String impact_factor;
	@Column(name = "year", nullable = false)
	private int year;
	@Column(name = "volume", nullable = false)
	private int volume;
	@Column(name = "pageno", nullable = false)
	private int pageno;
	@Column(name = "no_research", nullable = false)
	private int no_research;
	@Column(name = "user_id", nullable = false)
	private int user_id;
	@Column(name = "year_publication", nullable = false)
	private int year_publication;
	
	
	public int getYear_publication() {
		return year_publication;
	}
	public void setYear_publication(int year_publication) {
		this.year_publication = year_publication;
	}
	public int getIdresearch() {
		return idresearch;
	}
	public void setIdresearch(int idresearch) {
		this.idresearch = idresearch;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getPaper_type() {
		return paper_type;
	}
	public void setPaper_type(String paper_type) {
		this.paper_type = paper_type;
	}
	public int getIssn() {
		return issn;
	}
	public void setIssn(int issn) {
		this.issn = issn;
	}
	public String getImpact_factor() {
		return impact_factor;
	}
	public void setImpact_factor(String impact_factor) {
		this.impact_factor = impact_factor;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	public int getPageno() {
		return pageno;
	}
	public void setPageno(int pageno) {
		this.pageno = pageno;
	}
	public int getNo_research() {
		return no_research;
	}
	public void setNo_research(int no_research) {
		this.no_research = no_research;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	@Override
	public String toString() {
		return "Research [idresearch=" + idresearch + ", title=" + title + ", paper_type=" + paper_type + ", issn="
				+ issn + ", impact_factor=" + impact_factor + ", year=" + year + ", volume=" + volume + ", pageno="
				+ pageno + ", no_research=" + no_research + ", user_id=" + user_id + "]";
	}
	
}
