package com.shop2.myapp.dto;

public class NoticeDTO {
	private int idx;
	private String subject;
	private String content;
	private String writer;
	private String resdate;
	
	public NoticeDTO() { }
	
	public NoticeDTO(int idx, String subject, String content, String writer, String resdate) {
		super();
		this.idx = idx;
		this.subject = subject;
		this.content = content;
		this.writer = writer;
		this.resdate = resdate;
	}
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getResdate() {
		return resdate;
	}
	public void setResdate(String resdate) {
		this.resdate = resdate;
	}
	@Override
	public String toString() {
		return "NoticeDTO [idx=" + idx + ", subject=" + subject + ", content=" + content + ", writer=" + writer
				+ ", resdate=" + resdate + "]";
	}
	
	
}
