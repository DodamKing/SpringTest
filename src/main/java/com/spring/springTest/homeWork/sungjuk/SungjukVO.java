package com.spring.springTest.homeWork.sungjuk;

public class SungjukVO {
	private String name;
	private int kor;
	private int eng;
	private SungjukDo sj;
	
	public SungjukVO() {}
	
	public SungjukVO(String name, int kor, int eng) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public SungjukDo getSj() {
		return sj;
	}
	public void setSj(SungjukDo sj) {
		this.sj = sj;
	}
	
	public void getSungjukResult() {
//		sj.getSungjukResultDo(name, kor, eng);
		SungjukVO vo = new SungjukVO(name, kor, eng);
		sj.getSungjukResultDo(vo);
	}
	
}
