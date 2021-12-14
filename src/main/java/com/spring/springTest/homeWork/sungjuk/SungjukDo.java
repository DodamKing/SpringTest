package com.spring.springTest.homeWork.sungjuk;

public class SungjukDo {

	public void getSungjukResultDo(String name, int kor, int eng) {
		int tot;
		double avg;
		String grade;
		
		tot = kor + eng;
		avg = tot / 2.0;
		
		if (avg >= 90) grade = "A";
		else if (avg >= 80) grade = "B";
		else if (avg >= 70) grade = "C";
		else if (avg >= 60) grade = "D";
		else grade = "F";
		
		System.out.println(name + "님!! 점수가 나왔습니다.");
		System.out.print("국어 점수는 " + kor);
		System.out.print(", 영어 점수는 " + eng);
		System.out.print(", 총점은 " + tot);
		System.out.print(", 평균은 " + avg);
		System.out.print(", 학점은 " + grade);
		System.out.println("입니다.");
		System.out.println("--------------------------");
	}

	public void getSungjukResultDo(SungjukVO vo) {
		String name = vo.getName();
		int kor = vo.getKor();
		int eng = vo.getEng();
		
		getSungjukResultDo(name, kor, eng);
	}
	
}
