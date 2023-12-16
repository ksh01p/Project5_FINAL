package com.example;

import java.util.Date;

public class BoardVO {
	private int seq;
	private String title;
	private String writer;
	private String publish;
	private String years;
	private String symbol;

	private String category;

	private String location;

	private String loaned;
	private Date regdate;
	private int cnt;
	
	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	public String getTitle() {return title; }
	public void setTitle(String title){ this.title = title;}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getPublish() {
		return publish;
	}
	public void setPublish(String publish) {
		this.publish = publish;
	}
	public String getYears() {return years;}
	public void setYears(String years) {this.years = years;}
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getLoaned() {
		return loaned;
	}
	public void setLoaned(String loaned) {
		this.loaned = loaned;
	}

	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
}
